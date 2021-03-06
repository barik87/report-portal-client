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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UpdateOneIssueSubTypeRQ
 */

public class UpdateOneIssueSubTypeRQ {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("longName")
  private String longName = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("typeRef")
  private String typeRef = null;

  public UpdateOneIssueSubTypeRQ color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public UpdateOneIssueSubTypeRQ id(String id) {
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

  public UpdateOneIssueSubTypeRQ longName(String longName) {
    this.longName = longName;
    return this;
  }

   /**
   * Get longName
   * @return longName
  **/
  @ApiModelProperty(value = "")
  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public UpdateOneIssueSubTypeRQ shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public UpdateOneIssueSubTypeRQ typeRef(String typeRef) {
    this.typeRef = typeRef;
    return this;
  }

   /**
   * Get typeRef
   * @return typeRef
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(String typeRef) {
    this.typeRef = typeRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOneIssueSubTypeRQ updateOneIssueSubTypeRQ = (UpdateOneIssueSubTypeRQ) o;
    return Objects.equals(this.color, updateOneIssueSubTypeRQ.color) &&
        Objects.equals(this.id, updateOneIssueSubTypeRQ.id) &&
        Objects.equals(this.longName, updateOneIssueSubTypeRQ.longName) &&
        Objects.equals(this.shortName, updateOneIssueSubTypeRQ.shortName) &&
        Objects.equals(this.typeRef, updateOneIssueSubTypeRQ.typeRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, id, longName, shortName, typeRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOneIssueSubTypeRQ {\n");

    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    typeRef: ").append(toIndentedString(typeRef)).append("\n");
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

