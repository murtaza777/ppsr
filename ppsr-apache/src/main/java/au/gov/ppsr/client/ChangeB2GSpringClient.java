package au.gov.ppsr.client;

import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordRequestTypeType;
import au.gov.ppsr.schemas._2011._04.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 5/03/2014
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeB2GSpringClient {

    private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordClient.class);

    private static final String UNAME = "MUR181";
    private static final String PWD = "123456789";

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"cxf.xml"});
        RegisterOperationsService client = (RegisterOperationsService) context.getBean("changePasswordClient");

        ObjectFactory factory = new ObjectFactory();

        JAXBElement<ChangeB2GPasswordRequestTypeType> requestTypeElement =
                new JAXBElement<ChangeB2GPasswordRequestTypeType>(QName.valueOf("http://schemas.ppsr.gov.au/2011/04/services"),
                        ChangeB2GPasswordRequestTypeType.class,
                        buildRequestType(UNAME, PWD));

        ChangeB2GPasswordRequestMessage requestMessage = factory.createChangeB2GPasswordRequestMessage();
        requestMessage.setChangeB2GPasswordRequest(requestTypeElement);
        try {
            ChangeB2GPasswordResponseMessage responseMessage = client.changeB2GPassword(requestMessage);
            LOG.debug("Response message is :{}", responseMessage);
            long id = responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrTransactionId();
            XMLGregorianCalendar passwordExpiryDateTime = responseMessage.getChangeB2GPasswordResponse().getValue().getPasswordExpiryDateTime();
            System.out.println(id);
            System.out.println(passwordExpiryDateTime);
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage registerOperationsServiceChangeB2GPasswordPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage) {
            registerOperationsServiceChangeB2GPasswordPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage registerOperationsServiceChangeB2GPasswordPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage) {
            registerOperationsServiceChangeB2GPasswordPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage registerOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage) {
            registerOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrUnauthorisedFaultDetailFaultFaultMessage registerOperationsServiceChangeB2GPasswordPpsrUnauthorisedFaultDetailFaultFaultMessage) {
            registerOperationsServiceChangeB2GPasswordPpsrUnauthorisedFaultDetailFaultFaultMessage.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrStringLengthExceededFaultDetailFaultFaultMessage registerOperationsServiceChangeB2GPasswordPpsrStringLengthExceededFaultDetailFaultFaultMessage) {
            registerOperationsServiceChangeB2GPasswordPpsrStringLengthExceededFaultDetailFaultFaultMessage.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrRegisterOperationsChangeB2GPasswordValidationFaultDetailFaultFaultMessage registerOperationsServiceChangeB2GPasswordPpsrRegisterOperationsChangeB2GPasswordValidationFaultDetailFaultFaultMessage) {
            registerOperationsServiceChangeB2GPasswordPpsrRegisterOperationsChangeB2GPasswordValidationFaultDetailFaultFaultMessage.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private static ChangeB2GPasswordRequestTypeType buildRequestType(String username, String password) {
        ChangeB2GPasswordRequestTypeType type = new ChangeB2GPasswordRequestTypeType();
        type.setNewPassword(password);
        type.setUsername(username);
        return type;
    }
}
