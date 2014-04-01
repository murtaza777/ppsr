/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.model.form;

/**
 * User: murtaza
 * Date: 31/03/2014
 * Time: 1:15 AM
 */
public class PingForm implements Form {
  private String username;
  private String password;

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

  @Override
  public String getOperationName() {
    return "Ping";
  }

  @Override
  public String toString() {
    return "PingForm{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
