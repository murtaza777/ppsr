
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-02-23T17:25:30.535+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrSoapFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail ppsrSoapFaultDetail;

    public RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage() {
        super();
    }
    
    public RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail ppsrSoapFaultDetail) {
        super(message);
        this.ppsrSoapFaultDetail = ppsrSoapFaultDetail;
    }

    public RegisterOperationsServiceChangeB2GPasswordPpsrSoapFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail ppsrSoapFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrSoapFaultDetail = ppsrSoapFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrSoapFaultDetail getFaultInfo() {
        return this.ppsrSoapFaultDetail;
    }
}
