/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.exception;

/**
 * User: murtaza
 * Date: 30/03/2014
 * Time: 8:48 PM
 */
public class PpsrException extends RuntimeException {

  public PpsrException() {
  }

  public PpsrException(String s) {
    super(s);
  }

  public PpsrException(String s, Throwable cause) {
    super(s, cause);
  }

  public PpsrException(Throwable cause) {
    super(cause);
  }
}
