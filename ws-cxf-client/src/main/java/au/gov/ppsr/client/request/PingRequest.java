/*
 * Copyright (c) for Murtaza Kheriwala
 * Date: 2014.
 * This code is not for distribution.
 */

package au.gov.ppsr.client.request;

import au.gov.ppsr.client.header.TargetEnvironment;
import au.gov.ppsr.exception.PpsrException;
import au.gov.ppsr.schemas._2011._04.data.PingRequestTypeType;
import au.gov.ppsr.schemas._2011._04.services.ObjectFactory;
import au.gov.ppsr.schemas._2011._04.services.PingRequestMessage;
import au.gov.ppsr.schemas._2011._04.services.PingResponseMessage;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import au.gov.ppsr.util.FormatHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;

/**
 * User: murtaza
 * Date: 31/03/2014
 * Time: 12:43 AM
 */
public class PingRequest {
  private static final Calendar CAL = Calendar.getInstance();

  private static final Logger LOG = LoggerFactory.getLogger(PingRequest.class);

  public PingResponseMessage request(ObjectFactory factory, RegisterOperationsService client) {
    JAXBElement<PingRequestTypeType> requestTypeElement = factory.createPingRequestMessagePingRequest(buildRequestType());

    PingRequestMessage requestMessage = factory.createPingRequestMessage();
    requestMessage.setPingRequest(requestTypeElement);
    try {
      TargetEnvironment.addTargetEnvToHeader(client, factory);
      PingResponseMessage responseMessage = client.ping(requestMessage);
      LOG.debug("Response message is :{}", responseMessage);
      long id = responseMessage.getPingResponse().getValue().getPpsrRequestMessageId();
      XMLGregorianCalendar processedDateTime = responseMessage.getPingResponse().getValue().getRequestProcessedDateTime();
      System.out.println(id);
      System.out.println(processedDateTime);
      return responseMessage;
    } catch (JAXBException je) {
      je.printStackTrace();
      return null;
    } catch (Exception e) {
      LOG.error(e.getMessage());
      throw new PpsrException(e);
    }
  }

  private PingRequestTypeType buildRequestType() {
    PingRequestTypeType type = new PingRequestTypeType();
    type.setCustomersRequestMessageId(FormatHelper.dateToDateTime(CAL.getTime()));
    return type;
  }
}
