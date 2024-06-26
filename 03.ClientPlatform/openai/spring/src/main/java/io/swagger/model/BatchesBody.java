package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BatchesBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-31T08:43:25.403038835+09:00[Asia/Tokyo]")


public class BatchesBody   {
  @JsonProperty("input_file_id")
  private String inputFileId = null;

  /**
   * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
   */
  public enum EndpointEnum {
    CHAT_COMPLETIONS("/v1/chat/completions"),
    
    EMBEDDINGS("/v1/embeddings"),
    
    COMPLETIONS("/v1/completions");

    private String value;

    EndpointEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EndpointEnum fromValue(String text) {
      for (EndpointEnum b : EndpointEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("endpoint")
  private EndpointEnum endpoint = null;

  /**
   * The time frame within which the batch should be processed. Currently only `24h` is supported.
   */
  public enum CompletionWindowEnum {
    _24H("24h");

    private String value;

    CompletionWindowEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CompletionWindowEnum fromValue(String text) {
      for (CompletionWindowEnum b : CompletionWindowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("completion_window")
  private CompletionWindowEnum completionWindow = null;

  @JsonProperty("metadata")
  @Valid
  private Map<String, String> metadata = null;

  public BatchesBody inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

  /**
   * The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/requestInput), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 100 MB in size. 
   * @return inputFileId
   **/
  @Schema(required = true, description = "The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/requestInput), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 100 MB in size. ")
      @NotNull

    public String getInputFileId() {
    return inputFileId;
  }

  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  public BatchesBody endpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
   * @return endpoint
   **/
  @Schema(required = true, description = "The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.")
      @NotNull

    public EndpointEnum getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
  }

  public BatchesBody completionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

  /**
   * The time frame within which the batch should be processed. Currently only `24h` is supported.
   * @return completionWindow
   **/
  @Schema(required = true, description = "The time frame within which the batch should be processed. Currently only `24h` is supported.")
      @NotNull

    public CompletionWindowEnum getCompletionWindow() {
    return completionWindow;
  }

  public void setCompletionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
  }

  public BatchesBody metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public BatchesBody putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Optional custom metadata for the batch.
   * @return metadata
   **/
  @Schema(description = "Optional custom metadata for the batch.")
  
    public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchesBody batchesBody = (BatchesBody) o;
    return Objects.equals(this.inputFileId, batchesBody.inputFileId) &&
        Objects.equals(this.endpoint, batchesBody.endpoint) &&
        Objects.equals(this.completionWindow, batchesBody.completionWindow) &&
        Objects.equals(this.metadata, batchesBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileId, endpoint, completionWindow, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchesBody {\n");
    
    sb.append("    inputFileId: ").append(toIndentedString(inputFileId)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    completionWindow: ").append(toIndentedString(completionWindow)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
