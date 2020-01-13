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
 * BulkUpdateFilterRQ
 */

public class BulkUpdateFilterRQ {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("entities")
  private List<UserFilterEntity> entities = new ArrayList<>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("is_link")
  private Boolean isLink = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("selection_parameters")
  private SelectionParameters selectionParameters = null;

  @JsonProperty("share")
  private Boolean share = null;

  @JsonProperty("type")
  private String type = null;

  public BulkUpdateFilterRQ description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BulkUpdateFilterRQ entities(List<UserFilterEntity> entities) {
    this.entities = entities;
    return this;
  }

  public BulkUpdateFilterRQ addEntitiesItem(UserFilterEntity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @ApiModelProperty(required = true, value = "")
  public List<UserFilterEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<UserFilterEntity> entities) {
    this.entities = entities;
  }

  public BulkUpdateFilterRQ id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BulkUpdateFilterRQ isLink(Boolean isLink) {
    this.isLink = isLink;
    return this;
  }

   /**
   * Get isLink
   * @return isLink
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLink() {
    return isLink;
  }

  public void setIsLink(Boolean isLink) {
    this.isLink = isLink;
  }

  public BulkUpdateFilterRQ name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkUpdateFilterRQ selectionParameters(SelectionParameters selectionParameters) {
    this.selectionParameters = selectionParameters;
    return this;
  }

   /**
   * Get selectionParameters
   * @return selectionParameters
  **/
  @ApiModelProperty(value = "")
  public SelectionParameters getSelectionParameters() {
    return selectionParameters;
  }

  public void setSelectionParameters(SelectionParameters selectionParameters) {
    this.selectionParameters = selectionParameters;
  }

  public BulkUpdateFilterRQ share(Boolean share) {
    this.share = share;
    return this;
  }

   /**
   * Get share
   * @return share
  **/
  @ApiModelProperty(value = "")
  public Boolean isShare() {
    return share;
  }

  public void setShare(Boolean share) {
    this.share = share;
  }

  public BulkUpdateFilterRQ type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateFilterRQ bulkUpdateFilterRQ = (BulkUpdateFilterRQ) o;
    return Objects.equals(this.description, bulkUpdateFilterRQ.description) &&
        Objects.equals(this.entities, bulkUpdateFilterRQ.entities) &&
        Objects.equals(this.id, bulkUpdateFilterRQ.id) &&
        Objects.equals(this.isLink, bulkUpdateFilterRQ.isLink) &&
        Objects.equals(this.name, bulkUpdateFilterRQ.name) &&
        Objects.equals(this.selectionParameters, bulkUpdateFilterRQ.selectionParameters) &&
        Objects.equals(this.share, bulkUpdateFilterRQ.share) &&
        Objects.equals(this.type, bulkUpdateFilterRQ.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, entities, id, isLink, name, selectionParameters, share, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateFilterRQ {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLink: ").append(toIndentedString(isLink)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectionParameters: ").append(toIndentedString(selectionParameters)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

