
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.678+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrUnauthorisedFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class CollateralRegistrationSearchServiceRetrieveSearchCertificateRegistrationAttachmentPpsrUnauthorisedFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrUnauthorisedFaultDetail ppsrUnauthorisedFaultDetail;

    public CollateralRegistrationSearchServiceRetrieveSearchCertificateRegistrationAttachmentPpsrUnauthorisedFaultDetailFaultFaultMessage() {
        super();
    }
    
    public CollateralRegistrationSearchServiceRetrieveSearchCertificateRegistrationAttachmentPpsrUnauthorisedFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public CollateralRegistrationSearchServiceRetrieveSearchCertificateRegistrationAttachmentPpsrUnauthorisedFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CollateralRegistrationSearchServiceRetrieveSearchCertificateRegistrationAttachmentPpsrUnauthorisedFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrUnauthorisedFaultDetail ppsrUnauthorisedFaultDetail) {
        super(message);
        this.ppsrUnauthorisedFaultDetail = ppsrUnauthorisedFaultDetail;
    }

    public CollateralRegistrationSearchServiceRetrieveSearchCertificateRegistrationAttachmentPpsrUnauthorisedFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrUnauthorisedFaultDetail ppsrUnauthorisedFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrUnauthorisedFaultDetail = ppsrUnauthorisedFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrUnauthorisedFaultDetail getFaultInfo() {
        return this.ppsrUnauthorisedFaultDetail;
    }
}
