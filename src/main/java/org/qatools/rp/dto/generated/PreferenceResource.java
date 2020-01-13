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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PreferenceResource
 */

public class PreferenceResource {
  @JsonProperty("active")
  private String active = null;

  @JsonProperty("filters")
  private List<String> filters = null;

  @JsonProperty("projectRef")
  private String projectRef = null;

  @JsonProperty("userRef")
  private String userRef = null;

  public PreferenceResource active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public PreferenceResource filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public PreferenceResource addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(value = "")
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public PreferenceResource projectRef(String projectRef) {
    this.projectRef = projectRef;
    return this;
  }

   /**
   * Get projectRef
   * @return projectRef
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProjectRef() {
    return projectRef;
  }

  public void setProjectRef(String projectRef) {
    this.projectRef = projectRef;
  }

  public PreferenceResource userRef(String userRef) {
    this.userRef = userRef;
    return this;
  }

   /**
   * Get userRef
   * @return userRef
  **/
  @ApiModelProperty(value = "")
  public String getUserRef() {
    return userRef;
  }

  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferenceResource preferenceResource = (PreferenceResource) o;
    return Objects.equals(this.active, preferenceResource.active) &&
        Objects.equals(this.filters, preferenceResource.filters) &&
        Objects.equals(this.projectRef, preferenceResource.projectRef) &&
        Objects.equals(this.userRef, preferenceResource.userRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, filters, projectRef, userRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferenceResource {\n");

    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    projectRef: ").append(toIndentedString(projectRef)).append("\n");
    sb.append("    userRef: ").append(toIndentedString(userRef)).append("\n");
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

