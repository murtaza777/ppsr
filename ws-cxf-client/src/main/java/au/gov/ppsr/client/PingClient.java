/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.client;

import au.gov.ppsr.client.header.HeaderAuthentication;
import au.gov.ppsr.client.request.PingRequest;
import au.gov.ppsr.client.response.PingResponse;
import au.gov.ppsr.exception.PpsrException;
import au.gov.ppsr.schemas._2011._04.services.ObjectFactory;
import au.gov.ppsr.schemas._2011._04.services.PingResponseMessage;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: murtaza
 * Date: 31/03/2014
 * Time: 12:34 AM
 */
public class PingClient {

  private static final Logger LOG = LoggerFactory.getLogger(ChangeB2GSpringClient.class);

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"cxf.xml"});
    ObjectFactory factory = (ObjectFactory) context.getBean("objectFactory");
    RegisterOperationsService port = (RegisterOperationsService)context.getBean("registerOperationsClient");
    PingRequest request = new PingRequest();
    HeaderAuthentication.addAuthentication(port, "MUR181", "NewPas$w0rd");
    request.request(factory, port);
  }

  public PingResponse invokeService(String username, String password) throws PpsrException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"cxf.xml"});
    ObjectFactory factory = (ObjectFactory) context.getBean("objectFactory");
    RegisterOperationsService port = (RegisterOperationsService)context.getBean("registerOperationsClient");
    PingRequest request = new PingRequest();
    HeaderAuthentication.addAuthentication(port, username, password);
    PingResponseMessage responseMessage = request.request(factory, port);
    return PingResponse.build()
        .customersRequestMessageId(responseMessage.getPingResponse().getValue().getCustomersRequestMessageId())
        .ppsrRequestMessageId(responseMessage.getPingResponse().getValue().getPpsrRequestMessageId())
        .requestProcessedDateTime(responseMessage.getPingResponse().getValue().getRequestProcessedDateTime());
  }
}
