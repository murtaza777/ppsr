
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.345+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrCollateralRegistrationResetRegistrationTokenFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceResetRegistrationTokenPpsrCollateralRegistrationResetRegistrationTokenFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationResetRegistrationTokenFaultDetail ppsrCollateralRegistrationResetRegistrationTokenFaultDetail;

    public CollateralRegistrationServiceResetRegistrationTokenPpsrCollateralRegistrationResetRegistrationTokenFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceResetRegistrationTokenPpsrCollateralRegistrationResetRegistrationTokenFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceResetRegistrationTokenPpsrCollateralRegistrationResetRegistrationTokenFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceResetRegistrationTokenPpsrCollateralRegistrationResetRegistrationTokenFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationResetRegistrationTokenFaultDetail ppsrCollateralRegistrationResetRegistrationTokenFaultDetail) {
        super(message);
        this.ppsrCollateralRegistrationResetRegistrationTokenFaultDetail = ppsrCollateralRegistrationResetRegistrationTokenFaultDetail;
    }

    public CollateralRegistrationServiceResetRegistrationTokenPpsrCollateralRegistrationResetRegistrationTokenFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationResetRegistrationTokenFaultDetail ppsrCollateralRegistrationResetRegistrationTokenFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrCollateralRegistrationResetRegistrationTokenFaultDetail = ppsrCollateralRegistrationResetRegistrationTokenFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationResetRegistrationTokenFaultDetail getFaultInfo() {
        return this.ppsrCollateralRegistrationResetRegistrationTokenFaultDetail;
    }
}