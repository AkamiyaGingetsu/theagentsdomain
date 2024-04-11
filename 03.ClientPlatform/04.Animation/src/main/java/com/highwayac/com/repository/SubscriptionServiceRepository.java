package com.highwayac.com.repository;

import com.highwayac.com.domain.SubscriptionService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Spring Data R2DBC repository for the SubscriptionService entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SubscriptionServiceRepository
    extends ReactiveCrudRepository<SubscriptionService, Long>, SubscriptionServiceRepositoryInternal {
    @Override
    <S extends SubscriptionService> Mono<S> save(S entity);

    @Override
    Flux<SubscriptionService> findAll();

    @Override
    Mono<SubscriptionService> findById(Long id);

    @Override
    Mono<Void> deleteById(Long id);
}

interface SubscriptionServiceRepositoryInternal {
    <S extends SubscriptionService> Mono<S> save(S entity);

    Flux<SubscriptionService> findAllBy(Pageable pageable);

    Flux<SubscriptionService> findAll();

    Mono<SubscriptionService> findById(Long id);
    // this is not supported at the moment because of https://github.com/jhipster/generator-jhipster/issues/18269
    // Flux<SubscriptionService> findAllBy(Pageable pageable, Criteria criteria);
}
