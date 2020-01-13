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
 * UpdateDashboardRQ
 */

public class UpdateDashboardRQ {
  @JsonProperty("addWidget")
  private WidgetObjectModel addWidget = null;

  @JsonProperty("deleteWidget")
  private String deleteWidget = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("share")
  private Boolean share = null;

  @JsonProperty("updateWidgets")
  private List<WidgetObjectModel> updateWidgets = null;

  public UpdateDashboardRQ addWidget(WidgetObjectModel addWidget) {
    this.addWidget = addWidget;
    return this;
  }

   /**
   * Get addWidget
   * @return addWidget
  **/
  @ApiModelProperty(value = "")
  public WidgetObjectModel getAddWidget() {
    return addWidget;
  }

  public void setAddWidget(WidgetObjectModel addWidget) {
    this.addWidget = addWidget;
  }

  public UpdateDashboardRQ deleteWidget(String deleteWidget) {
    this.deleteWidget = deleteWidget;
    return this;
  }

   /**
   * Get deleteWidget
   * @return deleteWidget
  **/
  @ApiModelProperty(value = "")
  public String getDeleteWidget() {
    return deleteWidget;
  }

  public void setDeleteWidget(String deleteWidget) {
    this.deleteWidget = deleteWidget;
  }

  public UpdateDashboardRQ description(String description) {
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

  public UpdateDashboardRQ name(String name) {
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

  public UpdateDashboardRQ share(Boolean share) {
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

  public UpdateDashboardRQ updateWidgets(List<WidgetObjectModel> updateWidgets) {
    this.updateWidgets = updateWidgets;
    return this;
  }

  public UpdateDashboardRQ addUpdateWidgetsItem(WidgetObjectModel updateWidgetsItem) {
    if (this.updateWidgets == null) {
      this.updateWidgets = new ArrayList<>();
    }
    this.updateWidgets.add(updateWidgetsItem);
    return this;
  }

   /**
   * Get updateWidgets
   * @return updateWidgets
  **/
  @ApiModelProperty(value = "")
  public List<WidgetObjectModel> getUpdateWidgets() {
    return updateWidgets;
  }

  public void setUpdateWidgets(List<WidgetObjectModel> updateWidgets) {
    this.updateWidgets = updateWidgets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDashboardRQ updateDashboardRQ = (UpdateDashboardRQ) o;
    return Objects.equals(this.addWidget, updateDashboardRQ.addWidget) &&
        Objects.equals(this.deleteWidget, updateDashboardRQ.deleteWidget) &&
        Objects.equals(this.description, updateDashboardRQ.description) &&
        Objects.equals(this.name, updateDashboardRQ.name) &&
        Objects.equals(this.share, updateDashboardRQ.share) &&
        Objects.equals(this.updateWidgets, updateDashboardRQ.updateWidgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addWidget, deleteWidget, description, name, share, updateWidgets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDashboardRQ {\n");

    sb.append("    addWidget: ").append(toIndentedString(addWidget)).append("\n");
    sb.append("    deleteWidget: ").append(toIndentedString(deleteWidget)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    updateWidgets: ").append(toIndentedString(updateWidgets)).append("\n");
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

