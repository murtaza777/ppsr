
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.694+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrStringLengthExceededFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationSearchServiceSearchByGrantorAndEventDateRangePpsrStringLengthExceededFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail ppsrStringLengthExceededFaultDetail;

    public CollateralRegistrationSearchServiceSearchByGrantorAndEventDateRangePpsrStringLengthExceededFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationSearchServiceSearchByGrantorAndEventDateRangePpsrStringLengthExceededFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationSearchServiceSearchByGrantorAndEventDateRangePpsrStringLengthExceededFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationSearchServiceSearchByGrantorAndEventDateRangePpsrStringLengthExceededFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail ppsrStringLengthExceededFaultDetail) {
        super(message);
        this.ppsrStringLengthExceededFaultDetail = ppsrStringLengthExceededFaultDetail;
    }

    public CollateralRegistrationSearchServiceSearchByGrantorAndEventDateRangePpsrStringLengthExceededFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail ppsrStringLengthExceededFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrStringLengthExceededFaultDetail = ppsrStringLengthExceededFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail getFaultInfo() {
        return this.ppsrStringLengthExceededFaultDetail;
    }
}
