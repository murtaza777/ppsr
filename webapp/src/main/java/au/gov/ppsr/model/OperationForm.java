package au.gov.ppsr.model;

import java.io.Serializable;

/**
 * @author kheriwalam5g
 * @since <version>
 */
public class OperationForm implements Serializable {
  private String username;
  private String password;
  private String newPassword;
  private String operationName;
  private String searchText;
  private String registrationNo;

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public String getRegistrationNo() {
    return registrationNo;
  }

  public void setRegistrationNo(String registrationNo) {
    this.registrationNo = registrationNo;
  }

  public String getSearchText() {
    return searchText;
  }

  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  @Override
  public String toString() {
    return "OperationForm{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", newPassword='" + newPassword + '\'' +
        ", operationName='" + operationName + '\'' +
        ", searchText='" + searchText + '\'' +
        ", registrationNo='" + registrationNo + '\'' +
        '}';
  }
}
