/*
 * Report Portal
 * Report Portal API documentation
 *
 * OpenAPI spec version: 4.3.11
 * Contact: Support EPMC-TST Report Portal <SupportEPMC-TSTReportPortal@epam.com>
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.qatools.rp.dto.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * LogResource
 */

public class LogResource {
  @JsonProperty("binary_content")
  private BinaryContent binaryContent = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets level
   */
  public enum LevelEnum {
    ERROR("error"),
    
    WARN("warn"),
    
    INFO("info"),
    
    DEBUG("debug"),
    
    TRACE("trace"),
    
    FATAL("fatal"),
    
    UNKNOWN("unknown");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("level")
  private LevelEnum level = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("test_item")
  private String testItem = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  public LogResource binaryContent(BinaryContent binaryContent) {
    this.binaryContent = binaryContent;
    return this;
  }

   /**
   * Get binaryContent
   * @return binaryContent
  **/
  @ApiModelProperty(value = "")
  public BinaryContent getBinaryContent() {
    return binaryContent;
  }

  public void setBinaryContent(BinaryContent binaryContent) {
    this.binaryContent = binaryContent;
  }

  public LogResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LogResource level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public LogResource message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LogResource testItem(String testItem) {
    this.testItem = testItem;
    return this;
  }

   /**
   * Get testItem
   * @return testItem
  **/
  @ApiModelProperty(value = "")
  public String getTestItem() {
    return testItem;
  }

  public void setTestItem(String testItem) {
    this.testItem = testItem;
  }

  public LogResource thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public LogResource time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogResource logResource = (LogResource) o;
    return Objects.equals(this.binaryContent, logResource.binaryContent) &&
        Objects.equals(this.id, logResource.id) &&
        Objects.equals(this.level, logResource.level) &&
        Objects.equals(this.message, logResource.message) &&
        Objects.equals(this.testItem, logResource.testItem) &&
        Objects.equals(this.thumbnail, logResource.thumbnail) &&
        Objects.equals(this.time, logResource.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryContent, id, level, message, testItem, thumbnail, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogResource {\n");

    sb.append("    binaryContent: ").append(toIndentedString(binaryContent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    testItem: ").append(toIndentedString(testItem)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

