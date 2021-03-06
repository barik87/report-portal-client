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
 * AnalyzeLaunchRQ
 */

public class AnalyzeLaunchRQ {
  /**
   * Gets or Sets analyzeItemsMode
   */
  public enum AnalyzeItemsModeEnum {
    TO_INVESTIGATE("TO_INVESTIGATE"),
    
    AUTO_ANALYZED("AUTO_ANALYZED"),
    
    MANUALLY_ANALYZED("MANUALLY_ANALYZED");

    private String value;

    AnalyzeItemsModeEnum(String value) {
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
    public static AnalyzeItemsModeEnum fromValue(String text) {
      for (AnalyzeItemsModeEnum b : AnalyzeItemsModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("analyze_items_mode")
  private List<AnalyzeItemsModeEnum> analyzeItemsMode = null;

  /**
   * Gets or Sets analyzerMode
   */
  public enum AnalyzerModeEnum {
    ALL("ALL"),
    
    LAUNCH_NAME("LAUNCH_NAME"),
    
    CURRENT_LAUNCH("CURRENT_LAUNCH");

    private String value;

    AnalyzerModeEnum(String value) {
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
    public static AnalyzerModeEnum fromValue(String text) {
      for (AnalyzerModeEnum b : AnalyzerModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("analyzer_mode")
  private AnalyzerModeEnum analyzerMode = null;

  @JsonProperty("launch_id")
  private String launchId = null;

  public AnalyzeLaunchRQ analyzeItemsMode(List<AnalyzeItemsModeEnum> analyzeItemsMode) {
    this.analyzeItemsMode = analyzeItemsMode;
    return this;
  }

  public AnalyzeLaunchRQ addAnalyzeItemsModeItem(AnalyzeItemsModeEnum analyzeItemsModeItem) {
    if (this.analyzeItemsMode == null) {
      this.analyzeItemsMode = new ArrayList<>();
    }
    this.analyzeItemsMode.add(analyzeItemsModeItem);
    return this;
  }

   /**
   * Get analyzeItemsMode
   * @return analyzeItemsMode
  **/
  @ApiModelProperty(value = "")
  public List<AnalyzeItemsModeEnum> getAnalyzeItemsMode() {
    return analyzeItemsMode;
  }

  public void setAnalyzeItemsMode(List<AnalyzeItemsModeEnum> analyzeItemsMode) {
    this.analyzeItemsMode = analyzeItemsMode;
  }

  public AnalyzeLaunchRQ analyzerMode(AnalyzerModeEnum analyzerMode) {
    this.analyzerMode = analyzerMode;
    return this;
  }

   /**
   * Get analyzerMode
   * @return analyzerMode
  **/
  @ApiModelProperty(value = "")
  public AnalyzerModeEnum getAnalyzerMode() {
    return analyzerMode;
  }

  public void setAnalyzerMode(AnalyzerModeEnum analyzerMode) {
    this.analyzerMode = analyzerMode;
  }

  public AnalyzeLaunchRQ launchId(String launchId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeLaunchRQ analyzeLaunchRQ = (AnalyzeLaunchRQ) o;
    return Objects.equals(this.analyzeItemsMode, analyzeLaunchRQ.analyzeItemsMode) &&
        Objects.equals(this.analyzerMode, analyzeLaunchRQ.analyzerMode) &&
        Objects.equals(this.launchId, analyzeLaunchRQ.launchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzeItemsMode, analyzerMode, launchId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeLaunchRQ {\n");

    sb.append("    analyzeItemsMode: ").append(toIndentedString(analyzeItemsMode)).append("\n");
    sb.append("    analyzerMode: ").append(toIndentedString(analyzerMode)).append("\n");
    sb.append("    launchId: ").append(toIndentedString(launchId)).append("\n");
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

