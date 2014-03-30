
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.363+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrCollateralRegistrationAccessFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceTransferSingleRegistrationPpsrCollateralRegistrationAccessFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAccessFaultDetail ppsrCollateralRegistrationAccessFaultDetail;

    public CollateralRegistrationServiceTransferSingleRegistrationPpsrCollateralRegistrationAccessFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceTransferSingleRegistrationPpsrCollateralRegistrationAccessFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceTransferSingleRegistrationPpsrCollateralRegistrationAccessFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceTransferSingleRegistrationPpsrCollateralRegistrationAccessFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAccessFaultDetail ppsrCollateralRegistrationAccessFaultDetail) {
        super(message);
        this.ppsrCollateralRegistrationAccessFaultDetail = ppsrCollateralRegistrationAccessFaultDetail;
    }

    public CollateralRegistrationServiceTransferSingleRegistrationPpsrCollateralRegistrationAccessFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAccessFaultDetail ppsrCollateralRegistrationAccessFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrCollateralRegistrationAccessFaultDetail = ppsrCollateralRegistrationAccessFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationAccessFaultDetail getFaultInfo() {
        return this.ppsrCollateralRegistrationAccessFaultDetail;
    }
}
