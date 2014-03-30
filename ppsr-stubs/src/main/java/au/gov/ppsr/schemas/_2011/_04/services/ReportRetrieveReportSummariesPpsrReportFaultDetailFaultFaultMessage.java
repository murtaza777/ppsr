
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T00:15:10.952+11:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PpsrReportFaultDetail", targetNamespace = "http://schemas.ppsr.gov.au/faults")
public class ReportRetrieveReportSummariesPpsrReportFaultDetailFaultFaultMessage extends Exception {
    
    private au.gov.ppsr.schemas.faults.PpsrReportFaultDetail ppsrReportFaultDetail;

    public ReportRetrieveReportSummariesPpsrReportFaultDetailFaultFaultMessage() {
        super();
    }
    
    public ReportRetrieveReportSummariesPpsrReportFaultDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public ReportRetrieveReportSummariesPpsrReportFaultDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportRetrieveReportSummariesPpsrReportFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrReportFaultDetail ppsrReportFaultDetail) {
        super(message);
        this.ppsrReportFaultDetail = ppsrReportFaultDetail;
    }

    public ReportRetrieveReportSummariesPpsrReportFaultDetailFaultFaultMessage(String message, au.gov.ppsr.schemas.faults.PpsrReportFaultDetail ppsrReportFaultDetail, Throwable cause) {
        super(message, cause);
        this.ppsrReportFaultDetail = ppsrReportFaultDetail;
    }

    public au.gov.ppsr.schemas.faults.PpsrReportFaultDetail getFaultInfo() {
        return this.ppsrReportFaultDetail;
    }
}
