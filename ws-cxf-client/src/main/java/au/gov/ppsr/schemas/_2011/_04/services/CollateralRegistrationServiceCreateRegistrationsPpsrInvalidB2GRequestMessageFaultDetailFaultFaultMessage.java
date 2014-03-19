
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T17:25:29.575+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrInvalidB2GRequestMessageFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationServiceCreateRegistrationsPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail ppsrInvalidB2GRequestMessageFaultDetail;

    public CollateralRegistrationServiceCreateRegistrationsPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationServiceCreateRegistrationsPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationServiceCreateRegistrationsPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationServiceCreateRegistrationsPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail ppsrInvalidB2GRequestMessageFaultDetail) {
        super(message);
        this.ppsrInvalidB2GRequestMessageFaultDetail = ppsrInvalidB2GRequestMessageFaultDetail;
    }

    public CollateralRegistrationServiceCreateRegistrationsPpsrInvalidB2GRequestMessageFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail ppsrInvalidB2GRequestMessageFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrInvalidB2GRequestMessageFaultDetail = ppsrInvalidB2GRequestMessageFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrInvalidB2GRequestMessageFaultDetail getFaultInfo() {
        return this.ppsrInvalidB2GRequestMessageFaultDetail;
    }
}