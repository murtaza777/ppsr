
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.502+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrIncorrectEnvironmentFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceReissueVerificationStatementPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail ppsrIncorrectEnvironmentFaultDetail;

    public CollateralRegistrationServiceReissueVerificationStatementPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceReissueVerificationStatementPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceReissueVerificationStatementPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceReissueVerificationStatementPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail ppsrIncorrectEnvironmentFaultDetail) {
        super(message);
        this.ppsrIncorrectEnvironmentFaultDetail = ppsrIncorrectEnvironmentFaultDetail;
    }

    public CollateralRegistrationServiceReissueVerificationStatementPpsrIncorrectEnvironmentFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail ppsrIncorrectEnvironmentFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrIncorrectEnvironmentFaultDetail = ppsrIncorrectEnvironmentFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrIncorrectEnvironmentFaultDetail getFaultInfo() {
        return this.ppsrIncorrectEnvironmentFaultDetail;
    }
}