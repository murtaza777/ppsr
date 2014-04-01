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
 * Date: 31/03/2014
 * Time: 12:53 AM
 */
public class PingResponse implements Serializable {
  private long ppsrRequestMessageId;
  private XMLGregorianCalendar requestProcessedDateTime;
  private String customersRequestMessageId;

  private PingResponse() {
  }

  public static PingResponse build() {
    return new PingResponse();
  }

  public long getPpsrRequestMessageId() {
    return ppsrRequestMessageId;
  }

  public PingResponse ppsrRequestMessageId(long ppsrRequestMessageId) {
    this.ppsrRequestMessageId = ppsrRequestMessageId;
    return this;
  }

  public XMLGregorianCalendar getRequestProcessedDateTime() {
    return requestProcessedDateTime;
  }

  public PingResponse requestProcessedDateTime(XMLGregorianCalendar requestProcessedDateTime) {
    this.requestProcessedDateTime = requestProcessedDateTime;
    return this;
  }

  public String getCustomersRequestMessageId() {
    return customersRequestMessageId;
  }

  public PingResponse customersRequestMessageId(String customersRequestMessageId) {
    this.customersRequestMessageId = customersRequestMessageId;
    return this;
  }

  @Override
  public String toString() {
    return "PingResponse{" +
        "ppsrRequestMessageId=" + ppsrRequestMessageId +
        ", requestProcessedDateTime=" + requestProcessedDateTime +
        ", customersRequestMessageId='" + customersRequestMessageId + '\'' +
        '}';
  }
}
