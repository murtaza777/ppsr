/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.service.soap;

import au.gov.ppsr.client.PingClient;
import au.gov.ppsr.client.response.PingResponse;
import au.gov.ppsr.exception.PpsrException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: murtaza
 * Date: 31/03/2014
 * Time: 1:12 AM
 */
@Service
public class PingService {
  @Autowired
  private PingClient client;

  public PingResponse invokeWebService(String username, String password) throws PpsrException {
    return client.invokeService(username, password);

  }
}
