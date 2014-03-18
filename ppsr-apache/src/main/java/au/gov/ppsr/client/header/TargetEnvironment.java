package au.gov.ppsr.client.header;

import au.gov.ppsr.schemas._2011._04.services.ObjectFactory;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 18/03/2014
 * Time: 10:39 PM
 */
public final class TargetEnvironment {

  private static final String ENVIRONMENT = "Discovery";

  private TargetEnvironment() {
  }

  public static void addTargetEnvToHeader(RegisterOperationsService client, ObjectFactory factory) throws JAXBException {
    JAXBElement<String> targetEnvironment = factory.createTargetEnvironment(ENVIRONMENT);
    Header targetEnvHeader = new Header(targetEnvironment.getName(),
        targetEnvironment,
        new JAXBDataBinding(String.class));
    List<Header> headers = new ArrayList<Header>();
    headers.add(targetEnvHeader);
    Map<String,Object> requestContext = ((BindingProvider)client).getRequestContext();
    requestContext.put(Header.HEADER_LIST, headers);
  }
}
