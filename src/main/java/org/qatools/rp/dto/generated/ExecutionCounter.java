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
 * ExecutionCounter
 */

public class ExecutionCounter {
  @JsonProperty("failed")
  private String failed = null;

  @JsonProperty("passed")
  private String passed = null;

  @JsonProperty("skipped")
  private String skipped = null;

  @JsonProperty("total")
  private String total = null;

  public ExecutionCounter failed(String failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @ApiModelProperty(value = "")
  public String getFailed() {
    return failed;
  }

  public void setFailed(String failed) {
    this.failed = failed;
  }

  public ExecutionCounter passed(String passed) {
    this.passed = passed;
    return this;
  }

   /**
   * Get passed
   * @return passed
  **/
  @ApiModelProperty(value = "")
  public String getPassed() {
    return passed;
  }

  public void setPassed(String passed) {
    this.passed = passed;
  }

  public ExecutionCounter skipped(String skipped) {
    this.skipped = skipped;
    return this;
  }

   /**
   * Get skipped
   * @return skipped
  **/
  @ApiModelProperty(value = "")
  public String getSkipped() {
    return skipped;
  }

  public void setSkipped(String skipped) {
    this.skipped = skipped;
  }

  public ExecutionCounter total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionCounter executionCounter = (ExecutionCounter) o;
    return Objects.equals(this.failed, executionCounter.failed) &&
        Objects.equals(this.passed, executionCounter.passed) &&
        Objects.equals(this.skipped, executionCounter.skipped) &&
        Objects.equals(this.total, executionCounter.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, passed, skipped, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionCounter {\n");

    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
