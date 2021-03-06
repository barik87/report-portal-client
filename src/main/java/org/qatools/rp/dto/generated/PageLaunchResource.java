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
 * PageLaunchResource
 */

public class PageLaunchResource {
  @JsonProperty("content")
  private List<LaunchResource> content = null;

  @JsonProperty("page")
  private PageMetadata page = null;

  public PageLaunchResource content(List<LaunchResource> content) {
    this.content = content;
    return this;
  }

  public PageLaunchResource addContentItem(LaunchResource contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<LaunchResource> getContent() {
    return content;
  }

  public void setContent(List<LaunchResource> content) {
    this.content = content;
  }

  public PageLaunchResource page(PageMetadata page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public PageMetadata getPage() {
    return page;
  }

  public void setPage(PageMetadata page) {
    this.page = page;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageLaunchResource pageLaunchResource = (PageLaunchResource) o;
    return Objects.equals(this.content, pageLaunchResource.content) &&
        Objects.equals(this.page, pageLaunchResource.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageLaunchResource {\n");

    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

