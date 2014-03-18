package au.gov.ppsr.client.request;

import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordRequestTypeType;
import au.gov.ppsr.schemas._2011._04.services.*;
import au.gov.ppsr.util.FormatHelper;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @author kheriwalam5g
 * @since <version>
 */
public class ChangeB2GPasswordRequest {
  private static final Calendar CAL = Calendar.getInstance();

  private static final Logger LOG = LoggerFactory.getLogger(ChangeB2GPasswordRequest.class);

  private static final String UNAME = "MUR181";
  private static final String PWD = "123456789";

  public void request(ObjectFactory factory, RegisterOperationsService client) {
    JAXBElement<ChangeB2GPasswordRequestTypeType> requestTypeElement = factory.createChangeB2GPasswordRequestMessageChangeB2GPasswordRequest(buildRequestType(UNAME, PWD));

    ChangeB2GPasswordRequestMessage requestMessage = factory.createChangeB2GPasswordRequestMessage();
    requestMessage.setChangeB2GPasswordRequest(requestTypeElement);
    try {
      addTargetEnvToHeader(client, factory);
      ChangeB2GPasswordResponseMessage responseMessage = client.changeB2GPassword(requestMessage);
      LOG.debug("Response message is :{}", responseMessage);
      long id = responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrTransactionId();
      XMLGregorianCalendar passwordExpiryDateTime = responseMessage.getChangeB2GPasswordResponse().getValue().getPasswordExpiryDateTime();
      System.out.println(id);
      System.out.println(passwordExpiryDateTime);
    } catch (JAXBException je) {
      je.printStackTrace();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private void addTargetEnvToHeader(RegisterOperationsService client, ObjectFactory factory) throws JAXBException {
    JAXBElement<String> targetEnvironment = factory.createTargetEnvironment("Discovery");
    Header targetEnvHeader = new Header(targetEnvironment.getName(),
                                        targetEnvironment,
                                        new JAXBDataBinding(String.class));
    List<Header> headers = new ArrayList<Header>();
    headers.add(targetEnvHeader);
    Map<String,Object> requestContext = ((BindingProvider)client).getRequestContext();
    requestContext.put(Header.HEADER_LIST, headers);
  }

  private ChangeB2GPasswordRequestTypeType buildRequestType(String username, String password) {
    ChangeB2GPasswordRequestTypeType type = new ChangeB2GPasswordRequestTypeType();
    type.setNewPassword(password);
    type.setUsername(username);
    type.setCustomersRequestMessageId(FormatHelper.dateToDateTime(CAL.getTime()));
    return type;
  }
}
