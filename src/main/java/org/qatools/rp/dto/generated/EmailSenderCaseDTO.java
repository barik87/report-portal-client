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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmailSenderCaseDTO
 */

public class EmailSenderCaseDTO {
  @JsonProperty("launchNames")
  private List<String> launchNames = null;

  @JsonProperty("recipients")
  private List<String> recipients = null;

  /**
   * Gets or Sets sendCase
   */
  public enum SendCaseEnum {
    ALWAYS("ALWAYS"),
    
    FAILED("FAILED"),
    
    MORE_10("MORE_10"),
    
    MORE_20("MORE_20"),
    
    MORE_50("MORE_50");

    private String value;

    SendCaseEnum(String value) {
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
    public static SendCaseEnum fromValue(String text) {
      for (SendCaseEnum b : SendCaseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sendCase")
  private SendCaseEnum sendCase = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  public EmailSenderCaseDTO launchNames(List<String> launchNames) {
    this.launchNames = launchNames;
    return this;
  }

  public EmailSenderCaseDTO addLaunchNamesItem(String launchNamesItem) {
    if (this.launchNames == null) {
      this.launchNames = new ArrayList<>();
    }
    this.launchNames.add(launchNamesItem);
    return this;
  }

   /**
   * Get launchNames
   * @return launchNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getLaunchNames() {
    return launchNames;
  }

  public void setLaunchNames(List<String> launchNames) {
    this.launchNames = launchNames;
  }

  public EmailSenderCaseDTO recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public EmailSenderCaseDTO addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(value = "")
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  public EmailSenderCaseDTO sendCase(SendCaseEnum sendCase) {
    this.sendCase = sendCase;
    return this;
  }

   /**
   * Get sendCase
   * @return sendCase
  **/
  @ApiModelProperty(value = "")
  public SendCaseEnum getSendCase() {
    return sendCase;
  }

  public void setSendCase(SendCaseEnum sendCase) {
    this.sendCase = sendCase;
  }

  public EmailSenderCaseDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EmailSenderCaseDTO addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSenderCaseDTO emailSenderCaseDTO = (EmailSenderCaseDTO) o;
    return Objects.equals(this.launchNames, emailSenderCaseDTO.launchNames) &&
        Objects.equals(this.recipients, emailSenderCaseDTO.recipients) &&
        Objects.equals(this.sendCase, emailSenderCaseDTO.sendCase) &&
        Objects.equals(this.tags, emailSenderCaseDTO.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchNames, recipients, sendCase, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSenderCaseDTO {\n");

    sb.append("    launchNames: ").append(toIndentedString(launchNames)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    sendCase: ").append(toIndentedString(sendCase)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
