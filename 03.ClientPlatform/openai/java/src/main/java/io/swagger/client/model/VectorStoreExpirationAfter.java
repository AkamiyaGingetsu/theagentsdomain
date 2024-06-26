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
 * The expiration policy for a vector store.
 */
@Schema(description = "The expiration policy for a vector store.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-31T08:40:29.491725559+09:00[Asia/Tokyo]")
public class VectorStoreExpirationAfter {
  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   */
  @JsonAdapter(AnchorEnum.Adapter.class)
  public enum AnchorEnum {
    LAST_ACTIVE_AT("last_active_at");

    private String value;

    AnchorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnchorEnum fromValue(String input) {
      for (AnchorEnum b : AnchorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnchorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnchorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AnchorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AnchorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("anchor")
  private AnchorEnum anchor = null;

  @SerializedName("days")
  private Integer days = null;

  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

   /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   * @return anchor
  **/
  @Schema(required = true, description = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.")
  public AnchorEnum getAnchor() {
    return anchor;
  }

  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

  public VectorStoreExpirationAfter days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * The number of days after the anchor time that the vector store will expire.
   * minimum: 1
   * maximum: 365
   * @return days
  **/
  @Schema(required = true, description = "The number of days after the anchor time that the vector store will expire.")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreExpirationAfter vectorStoreExpirationAfter = (VectorStoreExpirationAfter) o;
    return Objects.equals(this.anchor, vectorStoreExpirationAfter.anchor) &&
        Objects.equals(this.days, vectorStoreExpirationAfter.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchor, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreExpirationAfter {\n");
    
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
