package au.gov.ppsr.client;

import au.gov.ppsr.client.header.HeaderAuthentication;
import au.gov.ppsr.client.request.ChangeB2GPasswordRequest;
import au.gov.ppsr.client.response.ChangePasswordResponse;
import au.gov.ppsr.exception.PpsrException;
import au.gov.ppsr.schemas._2011._04.services.ChangeB2GPasswordResponseMessage;
import au.gov.ppsr.schemas._2011._04.services.ObjectFactory;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: murtaza
 * Date: 5/03/2014
 * Time: 10:21 PM
 */
public class ChangeB2GSpringClient {
  //TODO Autowire the properties from cxf.xml
  /*@Autowired
  private ObjectFactory objectFactory;
  @Autowired
  RegisterOperationsService changePasswordClient;*/

  private static final Logger LOG = LoggerFactory.getLogger(ChangeB2GSpringClient.class);

  public static void main(String[] args) throws Exception {
    String username = "MUR181";
    String password = "NewPas$w0rd";
    String newPassword = "123456789";
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"cxf.xml"});
    RegisterOperationsService port = (RegisterOperationsService) context.getBean("changePasswordClient");
    ObjectFactory factory = (ObjectFactory) context.getBean("objectFactory");
    ChangeB2GPasswordRequest request = new ChangeB2GPasswordRequest();
    HeaderAuthentication.addAuthentication(port, username, password);
    request.request(factory, port, username, newPassword);
  }

  public ChangePasswordResponse invokeService(String username, String password, String newPassword) throws PpsrException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"cxf.xml"});
    RegisterOperationsService changePasswordClient = (RegisterOperationsService) context.getBean("changePasswordClient");
    ObjectFactory objectFactory = (ObjectFactory) context.getBean("objectFactory");
    ChangeB2GPasswordRequest request = new ChangeB2GPasswordRequest();
    HeaderAuthentication.addAuthentication(changePasswordClient, username, password);
    ChangeB2GPasswordResponseMessage responseMessage = request.request(objectFactory, changePasswordClient, username, newPassword);
    return ChangePasswordResponse.build()
        .customersRequestMessageId(responseMessage.getChangeB2GPasswordResponse().getValue().getCustomersRequestMessageId())
        .ppsrTransactionId(responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrTransactionId())
        .passwordExpiryDateTime(responseMessage.getChangeB2GPasswordResponse().getValue().getPasswordExpiryDateTime())
        .ppsrRequestMessageId(responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrRequestMessageId())
        .requestProcessedDateTime(responseMessage.getChangeB2GPasswordResponse().getValue().getRequestProcessedDateTime());
  }
}
