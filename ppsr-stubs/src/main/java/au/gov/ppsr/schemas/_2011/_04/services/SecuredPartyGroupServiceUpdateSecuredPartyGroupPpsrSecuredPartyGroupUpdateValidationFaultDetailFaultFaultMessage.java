
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:11.083+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrSecuredPartyGroupUpdateValidationFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class SecuredPartyGroupServiceUpdateSecuredPartyGroupPpsrSecuredPartyGroupUpdateValidationFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupUpdateValidationFaultDetail ppsrSecuredPartyGroupUpdateValidationFaultDetail;

    public SecuredPartyGroupServiceUpdateSecuredPartyGroupPpsrSecuredPartyGroupUpdateValidationFaultDetailFaultFaultMessage() {
        super();
    }
    
    public SecuredPartyGroupServiceUpdateSecuredPartyGroupPpsrSecuredPartyGroupUpdateValidationFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public SecuredPartyGroupServiceUpdateSecuredPartyGroupPpsrSecuredPartyGroupUpdateValidationFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public SecuredPartyGroupServiceUpdateSecuredPartyGroupPpsrSecuredPartyGroupUpdateValidationFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupUpdateValidationFaultDetail ppsrSecuredPartyGroupUpdateValidationFaultDetail) {
        super(message);
        this.ppsrSecuredPartyGroupUpdateValidationFaultDetail = ppsrSecuredPartyGroupUpdateValidationFaultDetail;
    }

    public SecuredPartyGroupServiceUpdateSecuredPartyGroupPpsrSecuredPartyGroupUpdateValidationFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupUpdateValidationFaultDetail ppsrSecuredPartyGroupUpdateValidationFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrSecuredPartyGroupUpdateValidationFaultDetail = ppsrSecuredPartyGroupUpdateValidationFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrSecuredPartyGroupUpdateValidationFaultDetail getFaultInfo() {
        return this.ppsrSecuredPartyGroupUpdateValidationFaultDetail;
    }
}
