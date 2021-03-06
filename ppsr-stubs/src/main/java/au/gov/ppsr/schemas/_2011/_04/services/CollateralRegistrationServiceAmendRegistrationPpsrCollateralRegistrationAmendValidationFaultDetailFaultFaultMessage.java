
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.600+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrCollateralRegistrationAmendValidationFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceAmendRegistrationPpsrCollateralRegistrationAmendValidationFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAmendValidationFaultDetail ppsrCollateralRegistrationAmendValidationFaultDetail;

    public CollateralRegistrationServiceAmendRegistrationPpsrCollateralRegistrationAmendValidationFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceAmendRegistrationPpsrCollateralRegistrationAmendValidationFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceAmendRegistrationPpsrCollateralRegistrationAmendValidationFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceAmendRegistrationPpsrCollateralRegistrationAmendValidationFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAmendValidationFaultDetail ppsrCollateralRegistrationAmendValidationFaultDetail) {
        super(message);
        this.ppsrCollateralRegistrationAmendValidationFaultDetail = ppsrCollateralRegistrationAmendValidationFaultDetail;
    }

    public CollateralRegistrationServiceAmendRegistrationPpsrCollateralRegistrationAmendValidationFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAmendValidationFaultDetail ppsrCollateralRegistrationAmendValidationFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrCollateralRegistrationAmendValidationFaultDetail = ppsrCollateralRegistrationAmendValidationFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAmendValidationFaultDetail getFaultInfo() {
        return this.ppsrCollateralRegistrationAmendValidationFaultDetail;
    }
}
