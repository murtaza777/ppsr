
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T17:25:30.487+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrSoapFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrSoapFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail ppsrSoapFaultDetail;

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrSoapFaultDetailFaultFaultMessage() {
        super();
    }
    
    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrSoapFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrSoapFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrSoapFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail ppsrSoapFaultDetail) {
        super(message);
        this.ppsrSoapFaultDetail = ppsrSoapFaultDetail;
    }

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrSoapFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail ppsrSoapFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrSoapFaultDetail = ppsrSoapFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail getFaultInfo() {
        return this.ppsrSoapFaultDetail;
    }
}
