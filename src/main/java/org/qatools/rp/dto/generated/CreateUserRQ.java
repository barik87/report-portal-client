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
 * CreateUserRQ
 */

public class CreateUserRQ {
  @JsonProperty("default_project")
  private String defaultProject = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("role")
  private String role = null;

  public CreateUserRQ defaultProject(String defaultProject) {
    this.defaultProject = defaultProject;
    return this;
  }

   /**
   * Get defaultProject
   * @return defaultProject
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDefaultProject() {
    return defaultProject;
  }

  public void setDefaultProject(String defaultProject) {
    this.defaultProject = defaultProject;
  }

  public CreateUserRQ email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserRQ role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRQ createUserRQ = (CreateUserRQ) o;
    return Objects.equals(this.defaultProject, createUserRQ.defaultProject) &&
        Objects.equals(this.email, createUserRQ.email) &&
        Objects.equals(this.role, createUserRQ.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultProject, email, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRQ {\n");

    sb.append("    defaultProject: ").append(toIndentedString(defaultProject)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

