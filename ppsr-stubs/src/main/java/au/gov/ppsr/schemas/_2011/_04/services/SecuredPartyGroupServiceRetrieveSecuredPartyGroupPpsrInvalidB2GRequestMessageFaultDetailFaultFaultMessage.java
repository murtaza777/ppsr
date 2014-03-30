
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:11.108+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrInvalidB2GRequestMessageFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class SecuredPartyGroupServiceRetrieveSecuredPartyGroupPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail ppsrInvalidB2GRequestMessageFaultDetail;

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage() {
        super();
    }
    
    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail ppsrInvalidB2GRequestMessageFaultDetail) {
        super(message);
        this.ppsrInvalidB2GRequestMessageFaultDetail = ppsrInvalidB2GRequestMessageFaultDetail;
    }

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail ppsrInvalidB2GRequestMessageFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrInvalidB2GRequestMessageFaultDetail = ppsrInvalidB2GRequestMessageFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail getFaultInfo() {
        return this.ppsrInvalidB2GRequestMessageFaultDetail;
    }
}