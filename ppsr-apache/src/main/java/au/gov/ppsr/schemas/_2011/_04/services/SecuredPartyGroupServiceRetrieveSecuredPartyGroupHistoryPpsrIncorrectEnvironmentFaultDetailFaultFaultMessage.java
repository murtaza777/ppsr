
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T17:25:30.483+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrIncorrectEnvironmentFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail ppsrIncorrectEnvironmentFaultDetail;

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage() {
        super();
    }
    
    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail ppsrIncorrectEnvironmentFaultDetail) {
        super(message);
        this.ppsrIncorrectEnvironmentFaultDetail = ppsrIncorrectEnvironmentFaultDetail;
    }

    public SecuredPartyGroupServiceRetrieveSecuredPartyGroupHistoryPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail ppsrIncorrectEnvironmentFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrIncorrectEnvironmentFaultDetail = ppsrIncorrectEnvironmentFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail getFaultInfo() {
        return this.ppsrIncorrectEnvironmentFaultDetail;
    }
}
