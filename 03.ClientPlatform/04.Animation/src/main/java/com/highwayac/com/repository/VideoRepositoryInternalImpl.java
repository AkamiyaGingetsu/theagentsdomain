package com.highwayac.com.repository;

import com.highwayac.com.domain.Keyword;
import com.highwayac.com.domain.Video;
import com.highwayac.com.repository.rowmapper.CategoryRowMapper;
import com.highwayac.com.repository.rowmapper.CopyrightRowMapper;
import com.highwayac.com.repository.rowmapper.CreatorRowMapper;
import com.highwayac.com.repository.rowmapper.MetadataRowMapper;
import com.highwayac.com.repository.rowmapper.VideoRowMapper;
import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.convert.R2dbcConverter;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.repository.support.SimpleR2dbcRepository;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Comparison;
import org.springframework.data.relational.core.sql.Condition;
import org.springframework.data.relational.core.sql.Conditions;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Select;
import org.springframework.data.relational.core.sql.SelectBuilder.SelectFromAndJoinCondition;
import org.springframework.data.relational.core.sql.Table;
import org.springframework.data.relational.repository.support.MappingRelationalEntityInformation;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.r2dbc.core.RowsFetchSpec;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Spring Data R2DBC custom repository implementation for the Video entity.
 */
@SuppressWarnings("unused")
class VideoRepositoryInternalImpl extends SimpleR2dbcRepository<Video, Long> implements VideoRepositoryInternal {

    private final DatabaseClient db;
    private final R2dbcEntityTemplate r2dbcEntityTemplate;
    private final EntityManager entityManager;

    private final CreatorRowMapper creatorMapper;
    private final CategoryRowMapper categoryMapper;
    private final CopyrightRowMapper copyrightMapper;
    private final MetadataRowMapper metadataMapper;
    private final VideoRowMapper videoMapper;

    private static final Table entityTable = Table.aliased("video", EntityManager.ENTITY_ALIAS);
    private static final Table creatorTable = Table.aliased("creator", "creator");
    private static final Table categoryTable = Table.aliased("category", "category");
    private static final Table copyrightTable = Table.aliased("copyright", "copyright");
    private static final Table extraInfoTable = Table.aliased("metadata", "extraInfo");

    private static final EntityManager.LinkTable keywordLink = new EntityManager.LinkTable("rel_video__keyword", "video_id", "keyword_id");

    public VideoRepositoryInternalImpl(
        R2dbcEntityTemplate template,
        EntityManager entityManager,
        CreatorRowMapper creatorMapper,
        CategoryRowMapper categoryMapper,
        CopyrightRowMapper copyrightMapper,
        MetadataRowMapper metadataMapper,
        VideoRowMapper videoMapper,
        R2dbcEntityOperations entityOperations,
        R2dbcConverter converter
    ) {
        super(
            new MappingRelationalEntityInformation(converter.getMappingContext().getRequiredPersistentEntity(Video.class)),
            entityOperations,
            converter
        );
        this.db = template.getDatabaseClient();
        this.r2dbcEntityTemplate = template;
        this.entityManager = entityManager;
        this.creatorMapper = creatorMapper;
        this.categoryMapper = categoryMapper;
        this.copyrightMapper = copyrightMapper;
        this.metadataMapper = metadataMapper;
        this.videoMapper = videoMapper;
    }

    @Override
    public Flux<Video> findAllBy(Pageable pageable) {
        return createQuery(pageable, null).all();
    }

    RowsFetchSpec<Video> createQuery(Pageable pageable, Condition whereClause) {
        List<Expression> columns = VideoSqlHelper.getColumns(entityTable, EntityManager.ENTITY_ALIAS);
        columns.addAll(CreatorSqlHelper.getColumns(creatorTable, "creator"));
        columns.addAll(CategorySqlHelper.getColumns(categoryTable, "category"));
        columns.addAll(CopyrightSqlHelper.getColumns(copyrightTable, "copyright"));
        columns.addAll(MetadataSqlHelper.getColumns(extraInfoTable, "extraInfo"));
        SelectFromAndJoinCondition selectFrom = Select
            .builder()
            .select(columns)
            .from(entityTable)
            .leftOuterJoin(creatorTable)
            .on(Column.create("creator_id", entityTable))
            .equals(Column.create("id", creatorTable))
            .leftOuterJoin(categoryTable)
            .on(Column.create("category_id", entityTable))
            .equals(Column.create("id", categoryTable))
            .leftOuterJoin(copyrightTable)
            .on(Column.create("copyright_id", entityTable))
            .equals(Column.create("id", copyrightTable))
            .leftOuterJoin(extraInfoTable)
            .on(Column.create("extra_info_id", entityTable))
            .equals(Column.create("id", extraInfoTable));
        // we do not support Criteria here for now as of https://github.com/jhipster/generator-jhipster/issues/18269
        String select = entityManager.createSelect(selectFrom, Video.class, pageable, whereClause);
        return db.sql(select).map(this::process);
    }

    @Override
    public Flux<Video> findAll() {
        return findAllBy(null);
    }

    @Override
    public Mono<Video> findById(Long id) {
        Comparison whereClause = Conditions.isEqual(entityTable.column("id"), Conditions.just(id.toString()));
        return createQuery(null, whereClause).one();
    }

    @Override
    public Mono<Video> findOneWithEagerRelationships(Long id) {
        return findById(id);
    }

    @Override
    public Flux<Video> findAllWithEagerRelationships() {
        return findAll();
    }

    @Override
    public Flux<Video> findAllWithEagerRelationships(Pageable page) {
        return findAllBy(page);
    }

    private Video process(Row row, RowMetadata metadata) {
        Video entity = videoMapper.apply(row, "e");
        entity.setCreator(creatorMapper.apply(row, "creator"));
        entity.setCategory(categoryMapper.apply(row, "category"));
        entity.setCopyright(copyrightMapper.apply(row, "copyright"));
        entity.setExtraInfo(metadataMapper.apply(row, "extraInfo"));
        return entity;
    }

    @Override
    public <S extends Video> Mono<S> save(S entity) {
        return super.save(entity).flatMap((S e) -> updateRelations(e));
    }

    protected <S extends Video> Mono<S> updateRelations(S entity) {
        Mono<Void> result = entityManager
            .updateLinkTable(keywordLink, entity.getId(), entity.getKeywords().stream().map(Keyword::getId))
            .then();
        return result.thenReturn(entity);
    }

    @Override
    public Mono<Void> deleteById(Long entityId) {
        return deleteRelations(entityId).then(super.deleteById(entityId));
    }

    protected Mono<Void> deleteRelations(Long entityId) {
        return entityManager.deleteFromLinkTable(keywordLink, entityId);
    }
}
