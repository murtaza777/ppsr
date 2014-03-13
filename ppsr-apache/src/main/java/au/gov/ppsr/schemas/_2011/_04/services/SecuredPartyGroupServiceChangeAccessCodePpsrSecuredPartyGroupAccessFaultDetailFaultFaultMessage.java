
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T17:25:30.418+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrSecuredPartyGroupAccessFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class SecuredPartyGroupServiceChangeAccessCodePpsrSecuredPartyGroupAccessFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupAccessFaultDetail ppsrSecuredPartyGroupAccessFaultDetail;

    public SecuredPartyGroupServiceChangeAccessCodePpsrSecuredPartyGroupAccessFaultDetailFaultFaultMessage() {
        super();
    }
    
    public SecuredPartyGroupServiceChangeAccessCodePpsrSecuredPartyGroupAccessFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public SecuredPartyGroupServiceChangeAccessCodePpsrSecuredPartyGroupAccessFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public SecuredPartyGroupServiceChangeAccessCodePpsrSecuredPartyGroupAccessFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupAccessFaultDetail ppsrSecuredPartyGroupAccessFaultDetail) {
        super(message);
        this.ppsrSecuredPartyGroupAccessFaultDetail = ppsrSecuredPartyGroupAccessFaultDetail;
    }

    public SecuredPartyGroupServiceChangeAccessCodePpsrSecuredPartyGroupAccessFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupAccessFaultDetail ppsrSecuredPartyGroupAccessFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrSecuredPartyGroupAccessFaultDetail = ppsrSecuredPartyGroupAccessFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupAccessFaultDetail getFaultInfo() {
        return this.ppsrSecuredPartyGroupAccessFaultDetail;
    }
}
