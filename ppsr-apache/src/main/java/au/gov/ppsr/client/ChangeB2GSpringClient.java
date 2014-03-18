package au.gov.ppsr.client;

import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordRequestTypeType;
import au.gov.ppsr.schemas._2011._04.services.*;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 5/03/2014
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeB2GSpringClient {

    private static final Calendar CAL = Calendar.getInstance();

    private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordClient.class);

    private static final String UNAME = "MUR181";
    private static final String PWD = "123456789";

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"cxf.xml"});
        RegisterOperationsService client = (RegisterOperationsService) context.getBean("changePasswordClient");

        ObjectFactory factory = new ObjectFactory();

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
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage roe) {
            roe.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage roe) {
            roe.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage roe) {
            roe.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrUnauthorisedFaultDetailFaultFaultMessage roe) {
            roe.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrStringLengthExceededFaultDetailFaultFaultMessage roe) {
            roe.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrRegisterOperationsChangeB2GPasswordValidationFaultDetailFaultFaultMessage roe) {
            roe.printStackTrace();
        }
    }

    private static void addTargetEnvToHeader(RegisterOperationsService client, ObjectFactory factory) throws JAXBException {
        JAXBElement<String> targetEnvironment = factory.createTargetEnvironment("Discovery");
        Header targetEnvHeader = new Header(targetEnvironment.getName(),
                targetEnvironment,
                new JAXBDataBinding(String.class));
        List<Header> headers = new ArrayList<Header>();
        headers.add(targetEnvHeader);
        Map<String,Object> requestContext = ((BindingProvider)client).getRequestContext();
        requestContext.put(Header.HEADER_LIST, headers);
    }

    private static ChangeB2GPasswordRequestTypeType buildRequestType(String username, String password) {
        ChangeB2GPasswordRequestTypeType type = new ChangeB2GPasswordRequestTypeType();
        type.setNewPassword(password);
        type.setUsername(username);
        type.setCustomersRequestMessageId(CAL.getTime().toString());
        return type;
    }
}
