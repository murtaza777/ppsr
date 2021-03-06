
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:11.020+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrB2GMailboxRetrieveMessagesValidationFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class B2GMailboxServiceRetrieveMessagesPpsrB2GMailboxRetrieveMessagesValidationFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagesValidationFaultDetail ppsrB2GMailboxRetrieveMessagesValidationFaultDetail;

    public B2GMailboxServiceRetrieveMessagesPpsrB2GMailboxRetrieveMessagesValidationFaultDetailFaultFaultMessage() {
        super();
    }
    
    public B2GMailboxServiceRetrieveMessagesPpsrB2GMailboxRetrieveMessagesValidationFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public B2GMailboxServiceRetrieveMessagesPpsrB2GMailboxRetrieveMessagesValidationFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public B2GMailboxServiceRetrieveMessagesPpsrB2GMailboxRetrieveMessagesValidationFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagesValidationFaultDetail ppsrB2GMailboxRetrieveMessagesValidationFaultDetail) {
        super(message);
        this.ppsrB2GMailboxRetrieveMessagesValidationFaultDetail = ppsrB2GMailboxRetrieveMessagesValidationFaultDetail;
    }

    public B2GMailboxServiceRetrieveMessagesPpsrB2GMailboxRetrieveMessagesValidationFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagesValidationFaultDetail ppsrB2GMailboxRetrieveMessagesValidationFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrB2GMailboxRetrieveMessagesValidationFaultDetail = ppsrB2GMailboxRetrieveMessagesValidationFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagesValidationFaultDetail getFaultInfo() {
        return this.ppsrB2GMailboxRetrieveMessagesValidationFaultDetail;
    }
}
