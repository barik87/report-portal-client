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

import java.util.Objects;

/**
 * CreateProjectRQ
 */

public class CreateProjectRQ {
  @JsonProperty("addInfo")
  private String addInfo = null;

  @JsonProperty("customer")
  private String customer = null;

  /**
   * Gets or Sets entryType
   */
  public enum EntryTypeEnum {
    INTERNAL("INTERNAL"),
    
    UPSA("UPSA");

    private String value;

    EntryTypeEnum(String value) {
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
    public static EntryTypeEnum fromValue(String text) {
      for (EntryTypeEnum b : EntryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("entryType")
  private EntryTypeEnum entryType = null;

  @JsonProperty("projectName")
  private String projectName = null;

  public CreateProjectRQ addInfo(String addInfo) {
    this.addInfo = addInfo;
    return this;
  }

   /**
   * Get addInfo
   * @return addInfo
  **/
  @ApiModelProperty(value = "")
  public String getAddInfo() {
    return addInfo;
  }

  public void setAddInfo(String addInfo) {
    this.addInfo = addInfo;
  }

  public CreateProjectRQ customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public CreateProjectRQ entryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * Get entryType
   * @return entryType
  **/
  @ApiModelProperty(required = true, value = "")
  public EntryTypeEnum getEntryType() {
    return entryType;
  }

  public void setEntryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
  }

  public CreateProjectRQ projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectRQ createProjectRQ = (CreateProjectRQ) o;
    return Objects.equals(this.addInfo, createProjectRQ.addInfo) &&
        Objects.equals(this.customer, createProjectRQ.customer) &&
        Objects.equals(this.entryType, createProjectRQ.entryType) &&
        Objects.equals(this.projectName, createProjectRQ.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addInfo, customer, entryType, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectRQ {\n");

    sb.append("    addInfo: ").append(toIndentedString(addInfo)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
