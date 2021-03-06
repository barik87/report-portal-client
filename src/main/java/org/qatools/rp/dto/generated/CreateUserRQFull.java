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

import java.util.Objects;

/**
 * CreateUserRQFull
 */

public class CreateUserRQFull {
  /**
   * Gets or Sets accountRole
   */
  public enum AccountRoleEnum {
    USER("USER"),
    
    ADMINISTRATOR("ADMINISTRATOR");

    private String value;

    AccountRoleEnum(String value) {
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
    public static AccountRoleEnum fromValue(String text) {
      for (AccountRoleEnum b : AccountRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("accountRole")
  private AccountRoleEnum accountRole = null;

  @JsonProperty("default_project")
  private String defaultProject = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("password")
  private String password = null;

  /**
   * Gets or Sets projectRole
   */
  public enum ProjectRoleEnum {
    CUSTOMER("CUSTOMER"),
    
    MEMBER("MEMBER"),
    
    LEAD("LEAD"),
    
    PROJECT_MANAGER("PROJECT_MANAGER");

    private String value;

    ProjectRoleEnum(String value) {
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
    public static ProjectRoleEnum fromValue(String text) {
      for (ProjectRoleEnum b : ProjectRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("projectRole")
  private ProjectRoleEnum projectRole = null;

  public CreateUserRQFull accountRole(AccountRoleEnum accountRole) {
    this.accountRole = accountRole;
    return this;
  }

   /**
   * Get accountRole
   * @return accountRole
  **/
  @ApiModelProperty(required = true, value = "")
  public AccountRoleEnum getAccountRole() {
    return accountRole;
  }

  public void setAccountRole(AccountRoleEnum accountRole) {
    this.accountRole = accountRole;
  }

  public CreateUserRQFull defaultProject(String defaultProject) {
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

  public CreateUserRQFull email(String email) {
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

  public CreateUserRQFull fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CreateUserRQFull login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public CreateUserRQFull password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserRQFull projectRole(ProjectRoleEnum projectRole) {
    this.projectRole = projectRole;
    return this;
  }

   /**
   * Get projectRole
   * @return projectRole
  **/
  @ApiModelProperty(required = true, value = "")
  public ProjectRoleEnum getProjectRole() {
    return projectRole;
  }

  public void setProjectRole(ProjectRoleEnum projectRole) {
    this.projectRole = projectRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRQFull createUserRQFull = (CreateUserRQFull) o;
    return Objects.equals(this.accountRole, createUserRQFull.accountRole) &&
        Objects.equals(this.defaultProject, createUserRQFull.defaultProject) &&
        Objects.equals(this.email, createUserRQFull.email) &&
        Objects.equals(this.fullName, createUserRQFull.fullName) &&
        Objects.equals(this.login, createUserRQFull.login) &&
        Objects.equals(this.password, createUserRQFull.password) &&
        Objects.equals(this.projectRole, createUserRQFull.projectRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRole, defaultProject, email, fullName, login, password, projectRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRQFull {\n");

    sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
    sb.append("    defaultProject: ").append(toIndentedString(defaultProject)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
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

