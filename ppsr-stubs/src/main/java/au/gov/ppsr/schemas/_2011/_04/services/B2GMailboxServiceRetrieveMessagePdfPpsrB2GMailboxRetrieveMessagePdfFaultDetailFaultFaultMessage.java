
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.980+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrB2GMailboxRetrieveMessagePdfFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class B2GMailboxServiceRetrieveMessagePdfPpsrB2GMailboxRetrieveMessagePdfFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagePdfFaultDetail ppsrB2GMailboxRetrieveMessagePdfFaultDetail;

    public B2GMailboxServiceRetrieveMessagePdfPpsrB2GMailboxRetrieveMessagePdfFaultDetailFaultFaultMessage() {
        super();
    }
    
    public B2GMailboxServiceRetrieveMessagePdfPpsrB2GMailboxRetrieveMessagePdfFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public B2GMailboxServiceRetrieveMessagePdfPpsrB2GMailboxRetrieveMessagePdfFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public B2GMailboxServiceRetrieveMessagePdfPpsrB2GMailboxRetrieveMessagePdfFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagePdfFaultDetail ppsrB2GMailboxRetrieveMessagePdfFaultDetail) {
        super(message);
        this.ppsrB2GMailboxRetrieveMessagePdfFaultDetail = ppsrB2GMailboxRetrieveMessagePdfFaultDetail;
    }

    public B2GMailboxServiceRetrieveMessagePdfPpsrB2GMailboxRetrieveMessagePdfFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagePdfFaultDetail ppsrB2GMailboxRetrieveMessagePdfFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrB2GMailboxRetrieveMessagePdfFaultDetail = ppsrB2GMailboxRetrieveMessagePdfFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrB2GMailboxRetrieveMessagePdfFaultDetail getFaultInfo() {
        return this.ppsrB2GMailboxRetrieveMessagePdfFaultDetail;
    }
}
