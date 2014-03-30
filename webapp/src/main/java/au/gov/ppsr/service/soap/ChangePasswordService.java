/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.service.soap;

import au.gov.ppsr.client.ChangeB2GSpringClient;
import au.gov.ppsr.client.response.ChangePasswordResponse;
import au.gov.ppsr.exception.PpsrException;
import org.springframework.stereotype.Service;

/**
 * User: murtaza
 * Date: 27/03/2014
 * Time: 9:29 AM
 */
@Service
public class ChangePasswordService {

  public ChangePasswordResponse invokeWebService(String username, String password, String newPassword) throws PpsrException {
    ChangeB2GSpringClient client = new ChangeB2GSpringClient();
    return client.invokeService(username, password, newPassword);

  }
}
