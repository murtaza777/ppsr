
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveReportSummariesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveReportSummariesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="ReportSummaries" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfReportSummary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveReportSummariesResponseType", propOrder = {
    "reportSummaries"
})
public class RetrieveReportSummariesResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "ReportSummaries", required = true, nillable = true)
    protected ArrayOfReportSummaryType reportSummaries;

    /**
     * Gets the value of the reportSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReportSummaryType }
     *     
     */
    public ArrayOfReportSummaryType getReportSummaries() {
        return reportSummaries;
    }

    /**
     * Sets the value of the reportSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReportSummaryType }
     *     
     */
    public void setReportSummaries(ArrayOfReportSummaryType value) {
        this.reportSummaries = value;
    }

}
