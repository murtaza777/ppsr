
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.744+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrInvalidDateTimeFormatFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationSearchServiceSearchBySerialNumberPpsrInvalidDateTimeFormatFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrInvalidDateTimeFormatFaultDetail ppsrInvalidDateTimeFormatFaultDetail;

    public CollateralRegistrationSearchServiceSearchBySerialNumberPpsrInvalidDateTimeFormatFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationSearchServiceSearchBySerialNumberPpsrInvalidDateTimeFormatFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationSearchServiceSearchBySerialNumberPpsrInvalidDateTimeFormatFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationSearchServiceSearchBySerialNumberPpsrInvalidDateTimeFormatFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrInvalidDateTimeFormatFaultDetail ppsrInvalidDateTimeFormatFaultDetail) {
        super(message);
        this.ppsrInvalidDateTimeFormatFaultDetail = ppsrInvalidDateTimeFormatFaultDetail;
    }

    public CollateralRegistrationSearchServiceSearchBySerialNumberPpsrInvalidDateTimeFormatFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrInvalidDateTimeFormatFaultDetail ppsrInvalidDateTimeFormatFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrInvalidDateTimeFormatFaultDetail = ppsrInvalidDateTimeFormatFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrInvalidDateTimeFormatFaultDetail getFaultInfo() {
        return this.ppsrInvalidDateTimeFormatFaultDetail;
    }
}
