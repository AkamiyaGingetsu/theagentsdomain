package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VectorStoreObjectFileCounts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-31T08:43:25.403038835+09:00[Asia/Tokyo]")


public class VectorStoreObjectFileCounts   {
  @JsonProperty("in_progress")
  private Integer inProgress = null;

  @JsonProperty("completed")
  private Integer completed = null;

  @JsonProperty("failed")
  private Integer failed = null;

  @JsonProperty("cancelled")
  private Integer cancelled = null;

  @JsonProperty("total")
  private Integer total = null;

  public VectorStoreObjectFileCounts inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  /**
   * The number of files that are currently being processed.
   * @return inProgress
   **/
  @Schema(required = true, description = "The number of files that are currently being processed.")
      @NotNull

    public Integer getInProgress() {
    return inProgress;
  }

  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }

  public VectorStoreObjectFileCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

  /**
   * The number of files that have been successfully processed.
   * @return completed
   **/
  @Schema(required = true, description = "The number of files that have been successfully processed.")
      @NotNull

    public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  public VectorStoreObjectFileCounts failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  /**
   * The number of files that have failed to process.
   * @return failed
   **/
  @Schema(required = true, description = "The number of files that have failed to process.")
      @NotNull

    public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public VectorStoreObjectFileCounts cancelled(Integer cancelled) {
    this.cancelled = cancelled;
    return this;
  }

  /**
   * The number of files that were cancelled.
   * @return cancelled
   **/
  @Schema(required = true, description = "The number of files that were cancelled.")
      @NotNull

    public Integer getCancelled() {
    return cancelled;
  }

  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }

  public VectorStoreObjectFileCounts total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of files.
   * @return total
   **/
  @Schema(required = true, description = "The total number of files.")
      @NotNull

    public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreObjectFileCounts vectorStoreObjectFileCounts = (VectorStoreObjectFileCounts) o;
    return Objects.equals(this.inProgress, vectorStoreObjectFileCounts.inProgress) &&
        Objects.equals(this.completed, vectorStoreObjectFileCounts.completed) &&
        Objects.equals(this.failed, vectorStoreObjectFileCounts.failed) &&
        Objects.equals(this.cancelled, vectorStoreObjectFileCounts.cancelled) &&
        Objects.equals(this.total, vectorStoreObjectFileCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProgress, completed, failed, cancelled, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreObjectFileCounts {\n");
    
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
