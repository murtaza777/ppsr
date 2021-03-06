
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.726+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrStringLengthExceededFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationSearchServiceRetrieveRegistrationHistoryDetailPpsrStringLengthExceededFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail ppsrStringLengthExceededFaultDetail;

    public CollateralRegistrationSearchServiceRetrieveRegistrationHistoryDetailPpsrStringLengthExceededFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationSearchServiceRetrieveRegistrationHistoryDetailPpsrStringLengthExceededFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationSearchServiceRetrieveRegistrationHistoryDetailPpsrStringLengthExceededFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationSearchServiceRetrieveRegistrationHistoryDetailPpsrStringLengthExceededFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail ppsrStringLengthExceededFaultDetail) {
        super(message);
        this.ppsrStringLengthExceededFaultDetail = ppsrStringLengthExceededFaultDetail;
    }

    public CollateralRegistrationSearchServiceRetrieveRegistrationHistoryDetailPpsrStringLengthExceededFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail ppsrStringLengthExceededFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrStringLengthExceededFaultDetail = ppsrStringLengthExceededFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrStringLengthExceededFaultDetail getFaultInfo() {
        return this.ppsrStringLengthExceededFaultDetail;
    }
}
