/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.model.form;

import java.io.Serializable;

/**
 * User: murtaza
 * Date: 26/03/2014
 * Time: 6:06 PM
 */
public class ChangePasswordForm implements Form, Serializable {
  private String username;
  private String password;
  private String newPassword;

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

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public String getOperationName() {
    return "ChangeB2GPassword";
  }

  @Override
  public String toString() {
    return "ChangePasswordForm{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", newPassword='" + newPassword + '\'' +
        '}';
  }
}
