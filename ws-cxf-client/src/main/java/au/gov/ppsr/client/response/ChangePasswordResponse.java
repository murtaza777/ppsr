/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.client.response;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;

/**
 * User: murtaza
 * Date: 30/03/2014
 * Time: 3:07 PM
 */
public class ChangePasswordResponse implements Serializable {
  private long ppsrTransactionId;
  private long ppsrRequestMessageId;
  private XMLGregorianCalendar passwordExpiryDateTime;
  private XMLGregorianCalendar requestProcessedDateTime;
  private String customersRequestMessageId;
  private String newPassword;

  private ChangePasswordResponse() {
  }

  public static ChangePasswordResponse build() {
    return new ChangePasswordResponse();
  }

  public long getPpsrTransactionId() {
    return ppsrTransactionId;
  }

  public ChangePasswordResponse ppsrTransactionId(long ppsrTransactionId) {
    this.ppsrTransactionId = ppsrTransactionId;
    return this;
  }

  public long getPpsrRequestMessageId() {
    return ppsrRequestMessageId;
  }

  public ChangePasswordResponse ppsrRequestMessageId(long ppsrRequestMessageId) {
    this.ppsrRequestMessageId = ppsrRequestMessageId;
    return this;
  }

  public XMLGregorianCalendar getPasswordExpiryDateTime() {
    return passwordExpiryDateTime;
  }

  public ChangePasswordResponse passwordExpiryDateTime(XMLGregorianCalendar passwordExpiryDateTime) {
    this.passwordExpiryDateTime = passwordExpiryDateTime;
    return this;
  }

  public XMLGregorianCalendar getRequestProcessedDateTime() {
    return requestProcessedDateTime;
  }

  public ChangePasswordResponse requestProcessedDateTime(XMLGregorianCalendar requestProcessedDateTime) {
    this.requestProcessedDateTime = requestProcessedDateTime;
    return this;
  }

  public String getCustomersRequestMessageId() {
    return customersRequestMessageId;
  }

  public ChangePasswordResponse customersRequestMessageId(String customersRequestMessageId) {
    this.customersRequestMessageId = customersRequestMessageId;
    return this;
  }

  public String getNewPassword() {
    return newPassword;
  }

  public ChangePasswordResponse newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  @Override
  public String toString() {
    return "ChangePasswordResponse{" +
        "ppsrTransactionId=" + ppsrTransactionId +
        ", ppsrRequestMessageId=" + ppsrRequestMessageId +
        ", passwordExpiryDateTime=" + passwordExpiryDateTime +
        ", requestProcessedDateTime=" + requestProcessedDateTime +
        ", customersRequestMessageId='" + customersRequestMessageId + '\'' +
        ", newPassword='" + newPassword + '\'' +
        '}';
  }
}
