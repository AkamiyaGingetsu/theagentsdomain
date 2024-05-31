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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DeleteVectorStoreResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-31T08:40:29.491725559+09:00[Asia/Tokyo]")
public class DeleteVectorStoreResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  /**
   * Gets or Sets object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    VECTOR_STORE_DELETED("vector_store.deleted");

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

  public DeleteVectorStoreResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeleteVectorStoreResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(required = true, description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public DeleteVectorStoreResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(required = true, description = "")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteVectorStoreResponse deleteVectorStoreResponse = (DeleteVectorStoreResponse) o;
    return Objects.equals(this.id, deleteVectorStoreResponse.id) &&
        Objects.equals(this.deleted, deleteVectorStoreResponse.deleted) &&
        Objects.equals(this.object, deleteVectorStoreResponse.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deleted, object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteVectorStoreResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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