
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T17:25:29.373+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrCollateralRegistrationTransferAllFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceTransferAllRegistrationsPpsrCollateralRegistrationTransferAllFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationTransferAllFaultDetail ppsrCollateralRegistrationTransferAllFaultDetail;

    public CollateralRegistrationServiceTransferAllRegistrationsPpsrCollateralRegistrationTransferAllFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceTransferAllRegistrationsPpsrCollateralRegistrationTransferAllFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceTransferAllRegistrationsPpsrCollateralRegistrationTransferAllFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceTransferAllRegistrationsPpsrCollateralRegistrationTransferAllFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationTransferAllFaultDetail ppsrCollateralRegistrationTransferAllFaultDetail) {
        super(message);
        this.ppsrCollateralRegistrationTransferAllFaultDetail = ppsrCollateralRegistrationTransferAllFaultDetail;
    }

    public CollateralRegistrationServiceTransferAllRegistrationsPpsrCollateralRegistrationTransferAllFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationTransferAllFaultDetail ppsrCollateralRegistrationTransferAllFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrCollateralRegistrationTransferAllFaultDetail = ppsrCollateralRegistrationTransferAllFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationTransferAllFaultDetail getFaultInfo() {
        return this.ppsrCollateralRegistrationTransferAllFaultDetail;
    }
}
