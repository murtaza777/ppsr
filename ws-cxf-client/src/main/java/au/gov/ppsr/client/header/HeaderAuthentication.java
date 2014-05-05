/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.client.header;

import au.gov.ppsr.client.header.handler.ClientPasswordCallback;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * User: murtaza
 * Date: 31/03/2014
 * Time: 12:36 AM
 */
public class HeaderAuthentication {
  public static void addAuthentication(Client client, String username, String password) {
    Endpoint endpoint = client.getEndpoint();
    Map<String, Object> outProps = new HashMap<String, Object>();
    outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
    outProps.put(WSHandlerConstants.USER, username);
    outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
    ClientPasswordCallback handler = new ClientPasswordCallback();
    handler.setUsername(username);
    handler.setPassword(password);
    outProps.put(WSHandlerConstants.PW_CALLBACK_REF, handler);
    outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallback.class.getName());
    WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);

    endpoint.getOutInterceptors().add(wssOut);
  }
}
