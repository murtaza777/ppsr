package au.gov.ppsr.client.request;

import au.gov.ppsr.client.header.TargetEnvironment;
import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordRequestTypeType;
import au.gov.ppsr.schemas._2011._04.services.ChangeB2GPasswordRequestMessage;
import au.gov.ppsr.schemas._2011._04.services.ChangeB2GPasswordResponseMessage;
import au.gov.ppsr.schemas._2011._04.services.ObjectFactory;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import au.gov.ppsr.util.FormatHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;

/**
 * @author kheriwalam5g
 * @since <version>
 */
public class ChangeB2GPasswordRequest {
  private static final Calendar CAL = Calendar.getInstance();

  private static final Logger LOG = LoggerFactory.getLogger(ChangeB2GPasswordRequest.class);

  public ChangeB2GPasswordResponseMessage request(ObjectFactory factory, RegisterOperationsService client, String username, String newPassword) {
    JAXBElement<ChangeB2GPasswordRequestTypeType> requestTypeElement = factory.createChangeB2GPasswordRequestMessageChangeB2GPasswordRequest(buildRequestType(username, newPassword));

    ChangeB2GPasswordRequestMessage requestMessage = factory.createChangeB2GPasswordRequestMessage();
    requestMessage.setChangeB2GPasswordRequest(requestTypeElement);
    try {
      TargetEnvironment.addTargetEnvToHeader(client, factory);
      ChangeB2GPasswordResponseMessage responseMessage = client.changeB2GPassword(requestMessage);
      LOG.debug("Response message is :{}", responseMessage);
      long id = responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrTransactionId();
      XMLGregorianCalendar passwordExpiryDateTime = responseMessage.getChangeB2GPasswordResponse().getValue().getPasswordExpiryDateTime();
      System.out.println(id);
      System.out.println(passwordExpiryDateTime);
      return responseMessage;
    } catch (JAXBException je) {
      je.printStackTrace();
      return null;
    } catch (Exception e) {
      LOG.error(e.getMessage());
      throw new RuntimeException(e);
    }
  }

  private ChangeB2GPasswordRequestTypeType buildRequestType(String username, String password) {
    ChangeB2GPasswordRequestTypeType type = new ChangeB2GPasswordRequestTypeType();
    type.setNewPassword(password);
    type.setUsername(username);
    type.setCustomersRequestMessageId(FormatHelper.dateToDateTime(CAL.getTime()));
    return type;
  }
}
