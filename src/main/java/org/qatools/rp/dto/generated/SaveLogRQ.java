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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * SaveLogRQ
 */

public class SaveLogRQ {
  @JsonProperty("file")
  private File file = null;

  @JsonProperty("item_id")
  private String itemId = null;

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

  @JsonProperty("time")
  private Date time = null;

  public SaveLogRQ file(File file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public SaveLogRQ itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public SaveLogRQ level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public SaveLogRQ message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SaveLogRQ time(Date time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
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
    SaveLogRQ saveLogRQ = (SaveLogRQ) o;
    return Objects.equals(this.file, saveLogRQ.file) &&
        Objects.equals(this.itemId, saveLogRQ.itemId) &&
        Objects.equals(this.level, saveLogRQ.level) &&
        Objects.equals(this.message, saveLogRQ.message) &&
        Objects.equals(this.time, saveLogRQ.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, itemId, level, message, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveLogRQ {\n");

    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

  public static class File {

    @JsonProperty(value = "name")
    private String name;

    @JsonIgnore
    private byte[] content;

    @JsonIgnore
    private String contentType;

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public byte[] getContent() {
      return content;
    }

    public void setContent(byte[] content) {
      this.content = content;
    }

    public String getContentType() {
      return contentType;
    }

    public void setContentType(String contentType) {
      this.contentType = contentType;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("File{");
      sb.append("name='").append(name).append('\'');
      sb.append(", content=").append(Arrays.toString(content));
      sb.append(", contentType='").append(contentType).append('\'');
      sb.append('}');
      return sb.toString();
    }
  }


}

