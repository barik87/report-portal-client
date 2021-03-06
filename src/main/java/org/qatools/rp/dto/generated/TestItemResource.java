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

import java.util.*;

/**
 * TestItemResource
 */

public class TestItemResource {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("end_time")
  private Date endTime = null;

  @JsonProperty("has_childs")
  private Boolean hasChilds = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("issue")
  private Issue issue = null;

  @JsonProperty("launchId")
  private String launchId = null;

  @JsonProperty("launchStatus")
  private String launchStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parameters")
  private List<ParameterResource> parameters = null;

  @JsonProperty("parent")
  private String parent = null;

  @JsonProperty("path_names")
  private Map<String, String> pathNames = null;

  @JsonProperty("retries")
  private List<TestItemResource> retries = null;

  @JsonProperty("start_time")
  private Date startTime = null;

  @JsonProperty("statistics")
  private Statistics statistics = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uniqueId")
  private String uniqueId = null;

  public TestItemResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestItemResource endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public TestItemResource hasChilds(Boolean hasChilds) {
    this.hasChilds = hasChilds;
    return this;
  }

   /**
   * Get hasChilds
   * @return hasChilds
  **/
  public Boolean isHasChilds() {
    return hasChilds;
  }

  public void setHasChilds(Boolean hasChilds) {
    this.hasChilds = hasChilds;
  }

  public TestItemResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TestItemResource issue(Issue issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  public Issue getIssue() {
    return issue;
  }

  public void setIssue(Issue issue) {
    this.issue = issue;
  }

  public TestItemResource launchId(String launchId) {
    this.launchId = launchId;
    return this;
  }

   /**
   * Get launchId
   * @return launchId
  **/
  public String getLaunchId() {
    return launchId;
  }

  public void setLaunchId(String launchId) {
    this.launchId = launchId;
  }

  public TestItemResource launchStatus(String launchStatus) {
    this.launchStatus = launchStatus;
    return this;
  }

   /**
   * Get launchStatus
   * @return launchStatus
  **/
  public String getLaunchStatus() {
    return launchStatus;
  }

  public void setLaunchStatus(String launchStatus) {
    this.launchStatus = launchStatus;
  }

  public TestItemResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestItemResource parameters(List<ParameterResource> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TestItemResource addParametersItem(ParameterResource parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  public List<ParameterResource> getParameters() {
    return parameters;
  }

  public void setParameters(List<ParameterResource> parameters) {
    this.parameters = parameters;
  }

  public TestItemResource parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public TestItemResource pathNames(Map<String, String> pathNames) {
    this.pathNames = pathNames;
    return this;
  }

  public TestItemResource putPathNamesItem(String key, String pathNamesItem) {
    if (this.pathNames == null) {
      this.pathNames = new HashMap<>();
    }
    this.pathNames.put(key, pathNamesItem);
    return this;
  }

   /**
   * Get pathNames
   * @return pathNames
  **/
  public Map<String, String> getPathNames() {
    return pathNames;
  }

  public void setPathNames(Map<String, String> pathNames) {
    this.pathNames = pathNames;
  }

  public TestItemResource retries(List<TestItemResource> retries) {
    this.retries = retries;
    return this;
  }

  public TestItemResource addRetriesItem(TestItemResource retriesItem) {
    if (this.retries == null) {
      this.retries = new ArrayList<>();
    }
    this.retries.add(retriesItem);
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  public List<TestItemResource> getRetries() {
    return retries;
  }

  public void setRetries(List<TestItemResource> retries) {
    this.retries = retries;
  }

  public TestItemResource startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public TestItemResource statistics(Statistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  public Statistics getStatistics() {
    return statistics;
  }

  public void setStatistics(Statistics statistics) {
    this.statistics = statistics;
  }

  public TestItemResource status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TestItemResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TestItemResource addTagsItem(String tagsItem) {
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
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public TestItemResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TestItemResource uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestItemResource testItemResource = (TestItemResource) o;
    return Objects.equals(this.description, testItemResource.description) &&
        Objects.equals(this.endTime, testItemResource.endTime) &&
        Objects.equals(this.hasChilds, testItemResource.hasChilds) &&
        Objects.equals(this.id, testItemResource.id) &&
        Objects.equals(this.issue, testItemResource.issue) &&
        Objects.equals(this.launchId, testItemResource.launchId) &&
        Objects.equals(this.launchStatus, testItemResource.launchStatus) &&
        Objects.equals(this.name, testItemResource.name) &&
        Objects.equals(this.parameters, testItemResource.parameters) &&
        Objects.equals(this.parent, testItemResource.parent) &&
        Objects.equals(this.pathNames, testItemResource.pathNames) &&
        Objects.equals(this.retries, testItemResource.retries) &&
        Objects.equals(this.startTime, testItemResource.startTime) &&
        Objects.equals(this.statistics, testItemResource.statistics) &&
        Objects.equals(this.status, testItemResource.status) &&
        Objects.equals(this.tags, testItemResource.tags) &&
        Objects.equals(this.type, testItemResource.type) &&
        Objects.equals(this.uniqueId, testItemResource.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endTime, hasChilds, id, issue, launchId, launchStatus, name, parameters, parent, pathNames, retries, startTime, statistics, status, tags, type, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestItemResource {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    hasChilds: ").append(toIndentedString(hasChilds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    launchId: ").append(toIndentedString(launchId)).append("\n");
    sb.append("    launchStatus: ").append(toIndentedString(launchStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    pathNames: ").append(toIndentedString(pathNames)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

