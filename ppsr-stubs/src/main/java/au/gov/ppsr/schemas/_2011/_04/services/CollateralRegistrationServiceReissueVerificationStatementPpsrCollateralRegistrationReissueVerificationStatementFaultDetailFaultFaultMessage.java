
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.491+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrCollateralRegistrationReissueVerificationStatementFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceReissueVerificationStatementPpsrCollateralRegistrationReissueVerificationStatementFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationReissueVerificationStatementFaultDetail ppsrCollateralRegistrationReissueVerificationStatementFaultDetail;

    public CollateralRegistrationServiceReissueVerificationStatementPpsrCollateralRegistrationReissueVerificationStatementFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceReissueVerificationStatementPpsrCollateralRegistrationReissueVerificationStatementFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceReissueVerificationStatementPpsrCollateralRegistrationReissueVerificationStatementFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceReissueVerificationStatementPpsrCollateralRegistrationReissueVerificationStatementFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationReissueVerificationStatementFaultDetail ppsrCollateralRegistrationReissueVerificationStatementFaultDetail) {
        super(message);
        this.ppsrCollateralRegistrationReissueVerificationStatementFaultDetail = ppsrCollateralRegistrationReissueVerificationStatementFaultDetail;
    }

    public CollateralRegistrationServiceReissueVerificationStatementPpsrCollateralRegistrationReissueVerificationStatementFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationReissueVerificationStatementFaultDetail ppsrCollateralRegistrationReissueVerificationStatementFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrCollateralRegistrationReissueVerificationStatementFaultDetail = ppsrCollateralRegistrationReissueVerificationStatementFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationReissueVerificationStatementFaultDetail getFaultInfo() {
        return this.ppsrCollateralRegistrationReissueVerificationStatementFaultDetail;
    }
}