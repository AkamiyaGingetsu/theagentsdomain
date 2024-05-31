package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CreateModerationResponseResults;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents if a given text input is potentially harmful.
 */
@Schema(description = "Represents if a given text input is potentially harmful.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-31T08:43:25.403038835+09:00[Asia/Tokyo]")


public class CreateModerationResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("results")
  @Valid
  private List<CreateModerationResponseResults> results = new ArrayList<CreateModerationResponseResults>();

  public CreateModerationResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the moderation request.
   * @return id
   **/
  @Schema(required = true, description = "The unique identifier for the moderation request.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateModerationResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model used to generate the moderation results.
   * @return model
   **/
  @Schema(required = true, description = "The model used to generate the moderation results.")
      @NotNull

    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateModerationResponse results(List<CreateModerationResponseResults> results) {
    this.results = results;
    return this;
  }

  public CreateModerationResponse addResultsItem(CreateModerationResponseResults resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

  /**
   * A list of moderation objects.
   * @return results
   **/
  @Schema(required = true, description = "A list of moderation objects.")
      @NotNull
    @Valid
    public List<CreateModerationResponseResults> getResults() {
    return results;
  }

  public void setResults(List<CreateModerationResponseResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponse createModerationResponse = (CreateModerationResponse) o;
    return Objects.equals(this.id, createModerationResponse.id) &&
        Objects.equals(this.model, createModerationResponse.model) &&
        Objects.equals(this.results, createModerationResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
