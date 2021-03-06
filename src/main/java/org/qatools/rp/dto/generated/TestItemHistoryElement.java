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
 * TestItemHistoryElement
 */

public class TestItemHistoryElement {
  @JsonProperty("launchId")
  private String launchId = null;

  @JsonProperty("launchNumber")
  private String launchNumber = null;

  @JsonProperty("launchStatus")
  private String launchStatus = null;

  @JsonProperty("resources")
  private List<TestItemResource> resources = null;

  @JsonProperty("startTime")
  private String startTime = null;

  public TestItemHistoryElement launchId(String launchId) {
    this.launchId = launchId;
    return this;
  }

   /**
   * Get launchId
   * @return launchId
  **/
  @ApiModelProperty(value = "")
  public String getLaunchId() {
    return launchId;
  }

  public void setLaunchId(String launchId) {
    this.launchId = launchId;
  }

  public TestItemHistoryElement launchNumber(String launchNumber) {
    this.launchNumber = launchNumber;
    return this;
  }

   /**
   * Get launchNumber
   * @return launchNumber
  **/
  @ApiModelProperty(value = "")
  public String getLaunchNumber() {
    return launchNumber;
  }

  public void setLaunchNumber(String launchNumber) {
    this.launchNumber = launchNumber;
  }

  public TestItemHistoryElement launchStatus(String launchStatus) {
    this.launchStatus = launchStatus;
    return this;
  }

   /**
   * Get launchStatus
   * @return launchStatus
  **/
  @ApiModelProperty(value = "")
  public String getLaunchStatus() {
    return launchStatus;
  }

  public void setLaunchStatus(String launchStatus) {
    this.launchStatus = launchStatus;
  }

  public TestItemHistoryElement resources(List<TestItemResource> resources) {
    this.resources = resources;
    return this;
  }

  public TestItemHistoryElement addResourcesItem(TestItemResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<TestItemResource> getResources() {
    return resources;
  }

  public void setResources(List<TestItemResource> resources) {
    this.resources = resources;
  }

  public TestItemHistoryElement startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestItemHistoryElement testItemHistoryElement = (TestItemHistoryElement) o;
    return Objects.equals(this.launchId, testItemHistoryElement.launchId) &&
        Objects.equals(this.launchNumber, testItemHistoryElement.launchNumber) &&
        Objects.equals(this.launchStatus, testItemHistoryElement.launchStatus) &&
        Objects.equals(this.resources, testItemHistoryElement.resources) &&
        Objects.equals(this.startTime, testItemHistoryElement.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchId, launchNumber, launchStatus, resources, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestItemHistoryElement {\n");

    sb.append("    launchId: ").append(toIndentedString(launchId)).append("\n");
    sb.append("    launchNumber: ").append(toIndentedString(launchNumber)).append("\n");
    sb.append("    launchStatus: ").append(toIndentedString(launchStatus)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

