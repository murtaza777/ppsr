package au.gov.ppsr.client;

import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordRequestTypeType;
import au.gov.ppsr.schemas._2011._04.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.soap.AddressingFeature;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 23/02/2014
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangePasswordClient {
    private static final Logger LOG = LoggerFactory.getLogger(ChangePasswordClient.class);
    private static final String UNAME = "MUR181";
    private static final String PWD = "LDGU297R9X2P";
    private static final String NEW_PWD = "LDGU297R9X2P";

    public static void main(String[] args) {

        /*if (args.length < 2) {
            throw new IllegalArgumentException("Please supply user name and password");
        }*/
        /*String username = args[0];
        String password = args[1];*/
        String username = UNAME;
        String password = PWD;

        ObjectFactory factory = new ObjectFactory();

        JAXBElement<ChangeB2GPasswordRequestTypeType> requestTypeElement =
                new JAXBElement<ChangeB2GPasswordRequestTypeType>(QName.valueOf("http://schemas.ppsr.gov.au/2011/04/services"),
                        ChangeB2GPasswordRequestTypeType.class,
                        buildRequestType(username, password));

        ChangeB2GPasswordRequestMessage message = factory.createChangeB2GPasswordRequestMessage();
        message.setChangeB2GPasswordRequest(requestTypeElement);

        Ppsr ppsr = new Ppsr();
        RegisterOperationsService service = ppsr.getRegisterOperationsSoap11();
        try {
            ChangeB2GPasswordResponseMessage responseMessage = service.changeB2GPassword(message);
            LOG.debug("Response message is :{}", responseMessage);
            long id = responseMessage.getChangeB2GPasswordResponse().getValue().getPpsrTransactionId();
            System.out.print(id);
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage exceptionMessage) {
            LOG.debug(exceptionMessage.getMessage());
            exceptionMessage.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage exceptionMessage) {
            LOG.debug(exceptionMessage.getMessage());
            exceptionMessage.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage exceptionMessage) {
            LOG.debug(exceptionMessage.getMessage());
            exceptionMessage.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrUnauthorisedFaultDetailFaultFaultMessage exceptionMessage) {
            LOG.debug(exceptionMessage.getMessage());
            exceptionMessage.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrStringLengthExceededFaultDetailFaultFaultMessage exceptionMessage) {
            LOG.debug(exceptionMessage.getMessage());
            exceptionMessage.printStackTrace();
        } catch (RegisterOperationsServiceChangeB2GPasswordPpsrRegisterOperationsChangeB2GPasswordValidationFaultDetailFaultFaultMessage exceptionMessage) {
            LOG.debug(exceptionMessage.getMessage());
            exceptionMessage.printStackTrace();
        }
    }

    private static ChangeB2GPasswordRequestTypeType buildRequestType(String username, String password) {
        ChangeB2GPasswordRequestTypeType type = new ChangeB2GPasswordRequestTypeType();
        type.setNewPassword(password);
        type.setUsername(username);
        return type;
    }
}
