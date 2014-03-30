package au.gov.ppsr.client;

import au.gov.ppsr.client.header.handler.ClientPasswordCallback;
import au.gov.ppsr.client.request.ChangeB2GPasswordRequest;
import au.gov.ppsr.client.response.ChangePasswordResponse;
import au.gov.ppsr.exception.PpsrException;
import au.gov.ppsr.schemas._2011._04.services.*;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * User: murtaza
 * Date: 5/03/2014
 * Time: 10:21 PM
 */
public class ChangeB2GSpringClient {

  private static final Logger LOG = LoggerFactory.getLogger(ChangeB2GSpringClient.class);

  public static void main(String[] args) throws Exception {
    String username = "MUR181";
    String password = "NewPas$w0rd";
    String newPassword = "123456789";
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"cxf.xml"});
    RegisterOperationsService port = (RegisterOperationsService) context.getBean("changePasswordClient");
    ObjectFactory factory = (ObjectFactory) context.getBean("objectFactory");
    ChangeB2GPasswordRequest request = new ChangeB2GPasswordRequest();
    addAuthentication(port, username, password);
    request.request(factory, port, username, newPassword);
  }

  public ChangePasswordResponse invokeService(String username, String password, String newPassword) throws PpsrException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"cxf.xml"});
    RegisterOperationsService port = (RegisterOperationsService) context.getBean("changePasswordClient");
    ObjectFactory factory = (ObjectFactory) context.getBean("objectFactory");
    ChangeB2GPasswordRequest request = new ChangeB2GPasswordRequest();
    addAuthentication(port, username, password);
    ChangeB2GPasswordResponseMessage responseMessage = request.request(factory, port, username, newPassword);
    return ChangePasswordResponse.build()
        .customersRequestMessageId(responseMessage.getChangeB2GPasswordResponse().getValue().getCustomersRequestMessageId())
        .ppsrTransactionId(responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrTransactionId())
        .passwordExpiryDateTime(responseMessage.getChangeB2GPasswordResponse().getValue().getPasswordExpiryDateTime())
        .ppsrRequestMessageId(responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrRequestMessageId())
        .requestProcessedDateTime(responseMessage.getChangeB2GPasswordResponse().getValue().getRequestProcessedDateTime());
  }

  private static void addAuthentication(RegisterOperationsService port, String username, String password) {
    Client client = ClientProxy.getClient(port);
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
