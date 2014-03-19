package au.gov.ppsr.client;

import au.gov.ppsr.client.request.ChangeB2GPasswordRequest;
import au.gov.ppsr.schemas._2011._04.services.ObjectFactory;
import au.gov.ppsr.schemas._2011._04.services.RegisterOperationsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: murtaza
 * Date: 5/03/2014
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChangeB2GSpringClient {

    private static final Logger LOG = LoggerFactory.getLogger(ChangeB2GSpringClient.class);


    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"cxf.xml"});
        RegisterOperationsService client = (RegisterOperationsService) context.getBean("changePasswordClient");

        ObjectFactory factory = (ObjectFactory) context.getBean("objectFactory");

      ChangeB2GPasswordRequest request = new ChangeB2GPasswordRequest();

      request.request(factory, client);


    }
}
