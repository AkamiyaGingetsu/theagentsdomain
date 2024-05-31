/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AssistantsApiResponseFormatOption;
import io.swagger.client.model.AssistantsApiToolChoiceOption;
import io.swagger.client.model.RunCompletionUsage;
import io.swagger.client.model.RunObjectIncompleteDetails;
import io.swagger.client.model.RunObjectLastError;
import io.swagger.client.model.RunObjectRequiredAction;
import io.swagger.client.model.TruncationObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
@Schema(description = "Represents an execution run on a [thread](/docs/api-reference/threads).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-31T08:40:29.491725559+09:00[Asia/Tokyo]")
public class RunObject {
  @SerializedName("id")
  private String id = null;

  /**
   * The object type, which is always &#x60;thread.run&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    THREAD_RUN("thread.run");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ObjectEnum fromValue(String input) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ObjectEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("created_at")
  private Integer createdAt = null;

  @SerializedName("thread_id")
  private String threadId = null;

  @SerializedName("assistant_id")
  private String assistantId = null;

  /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("queued"),
    IN_PROGRESS("in_progress"),
    REQUIRES_ACTION("requires_action"),
    CANCELLING("cancelling"),
    CANCELLED("cancelled"),
    FAILED("failed"),
    COMPLETED("completed"),
    INCOMPLETE("incomplete"),
    EXPIRED("expired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("required_action")
  private RunObjectRequiredAction requiredAction = null;

  @SerializedName("last_error")
  private RunObjectLastError lastError = null;

  @SerializedName("expires_at")
  private Integer expiresAt = null;

  @SerializedName("started_at")
  private Integer startedAt = null;

  @SerializedName("cancelled_at")
  private Integer cancelledAt = null;

  @SerializedName("failed_at")
  private Integer failedAt = null;

  @SerializedName("completed_at")
  private Integer completedAt = null;

  @SerializedName("incomplete_details")
  private RunObjectIncompleteDetails incompleteDetails = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("instructions")
  private String instructions = null;

  @SerializedName("tools")
  private List<OneOfRunObjectToolsItems> tools = new ArrayList<OneOfRunObjectToolsItems>();

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("usage")
  private RunCompletionUsage usage = null;

  @SerializedName("temperature")
  private BigDecimal temperature = null;

  @SerializedName("top_p")
  private BigDecimal topP = null;

  @SerializedName("max_prompt_tokens")
  private Integer maxPromptTokens = null;

  @SerializedName("max_completion_tokens")
  private Integer maxCompletionTokens = null;

  @SerializedName("truncation_strategy")
  private TruncationObject truncationStrategy = null;

  @SerializedName("tool_choice")
  private AssistantsApiToolChoiceOption toolChoice = null;

  @SerializedName("response_format")
  private AssistantsApiResponseFormatOption responseFormat = null;

  public RunObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @Schema(required = true, description = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunObject object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;thread.run&#x60;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always `thread.run`.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public RunObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was created.
   * @return createdAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public RunObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   * @return threadId
  **/
  @Schema(required = true, description = "The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public RunObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   * @return assistantId
  **/
  @Schema(required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public RunObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
   * @return status
  **/
  @Schema(required = true, description = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

   /**
   * Get requiredAction
   * @return requiredAction
  **/
  @Schema(required = true, description = "")
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }

  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

  public RunObject lastError(RunObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  @Schema(required = true, description = "")
  public RunObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

  public RunObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run will expire.
   * @return expiresAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run will expire.")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public RunObject startedAt(Integer startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was started.
   * @return startedAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was started.")
  public Integer getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  public RunObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   * @return cancelledAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was cancelled.")
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public RunObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run failed.
   * @return failedAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run failed.")
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  public RunObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was completed.
   * @return completedAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was completed.")
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public RunObject incompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

   /**
   * Get incompleteDetails
   * @return incompleteDetails
  **/
  @Schema(required = true, description = "")
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public RunObject model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return model
  **/
  @Schema(required = true, description = "The model that the [assistant](/docs/api-reference/assistants) used for this run.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public RunObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return instructions
  **/
  @Schema(required = true, description = "The instructions that the [assistant](/docs/api-reference/assistants) used for this run.")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public RunObject tools(List<OneOfRunObjectToolsItems> tools) {
    this.tools = tools;
    return this;
  }

  public RunObject addToolsItem(OneOfRunObjectToolsItems toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return tools
  **/
  @Schema(required = true, description = "The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.")
  public List<OneOfRunObjectToolsItems> getTools() {
    return tools;
  }

  public void setTools(List<OneOfRunObjectToolsItems> tools) {
    this.tools = tools;
  }

  public RunObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @Schema(required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public RunObject usage(RunCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(required = true, description = "")
  public RunCompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

  public RunObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   * @return temperature
  **/
  @Schema(description = "The sampling temperature used for this run. If not set, defaults to 1.")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RunObject topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

   /**
   * The nucleus sampling value used for this run. If not set, defaults to 1.
   * @return topP
  **/
  @Schema(description = "The nucleus sampling value used for this run. If not set, defaults to 1.")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public RunObject maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

   /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxPromptTokens
  **/
  @Schema(required = true, description = "The maximum number of prompt tokens specified to have been used over the course of the run. ")
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public RunObject maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

   /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxCompletionTokens
  **/
  @Schema(required = true, description = "The maximum number of completion tokens specified to have been used over the course of the run. ")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public RunObject truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

   /**
   * Get truncationStrategy
   * @return truncationStrategy
  **/
  @Schema(required = true, description = "")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  public RunObject toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * Get toolChoice
   * @return toolChoice
  **/
  @Schema(required = true, description = "")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RunObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
  @Schema(required = true, description = "")
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObject runObject = (RunObject) o;
    return Objects.equals(this.id, runObject.id) &&
        Objects.equals(this.object, runObject.object) &&
        Objects.equals(this.createdAt, runObject.createdAt) &&
        Objects.equals(this.threadId, runObject.threadId) &&
        Objects.equals(this.assistantId, runObject.assistantId) &&
        Objects.equals(this.status, runObject.status) &&
        Objects.equals(this.requiredAction, runObject.requiredAction) &&
        Objects.equals(this.lastError, runObject.lastError) &&
        Objects.equals(this.expiresAt, runObject.expiresAt) &&
        Objects.equals(this.startedAt, runObject.startedAt) &&
        Objects.equals(this.cancelledAt, runObject.cancelledAt) &&
        Objects.equals(this.failedAt, runObject.failedAt) &&
        Objects.equals(this.completedAt, runObject.completedAt) &&
        Objects.equals(this.incompleteDetails, runObject.incompleteDetails) &&
        Objects.equals(this.model, runObject.model) &&
        Objects.equals(this.instructions, runObject.instructions) &&
        Objects.equals(this.tools, runObject.tools) &&
        Objects.equals(this.metadata, runObject.metadata) &&
        Objects.equals(this.usage, runObject.usage) &&
        Objects.equals(this.temperature, runObject.temperature) &&
        Objects.equals(this.topP, runObject.topP) &&
        Objects.equals(this.maxPromptTokens, runObject.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, runObject.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, runObject.truncationStrategy) &&
        Objects.equals(this.toolChoice, runObject.toolChoice) &&
        Objects.equals(this.responseFormat, runObject.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, object, createdAt, threadId, assistantId, status, requiredAction, lastError, expiresAt, startedAt, cancelledAt, failedAt, completedAt, incompleteDetails, model, instructions, tools, metadata, usage, temperature, topP, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, responseFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requiredAction: ").append(toIndentedString(requiredAction)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    incompleteDetails: ").append(toIndentedString(incompleteDetails)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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