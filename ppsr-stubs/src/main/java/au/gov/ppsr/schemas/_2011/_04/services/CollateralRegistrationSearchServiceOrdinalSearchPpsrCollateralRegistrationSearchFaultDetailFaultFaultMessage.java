
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.794+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrCollateralRegistrationSearchFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationSearchServiceOrdinalSearchPpsrCollateralRegistrationSearchFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationSearchFaultDetail ppsrCollateralRegistrationSearchFaultDetail;

    public CollateralRegistrationSearchServiceOrdinalSearchPpsrCollateralRegistrationSearchFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationSearchServiceOrdinalSearchPpsrCollateralRegistrationSearchFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationSearchServiceOrdinalSearchPpsrCollateralRegistrationSearchFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationSearchServiceOrdinalSearchPpsrCollateralRegistrationSearchFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationSearchFaultDetail ppsrCollateralRegistrationSearchFaultDetail) {
        super(message);
        this.ppsrCollateralRegistrationSearchFaultDetail = ppsrCollateralRegistrationSearchFaultDetail;
    }

    public CollateralRegistrationSearchServiceOrdinalSearchPpsrCollateralRegistrationSearchFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationSearchFaultDetail ppsrCollateralRegistrationSearchFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrCollateralRegistrationSearchFaultDetail = ppsrCollateralRegistrationSearchFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrCollateralRegistrationSearchFaultDetail getFaultInfo() {
        return this.ppsrCollateralRegistrationSearchFaultDetail;
    }
}
