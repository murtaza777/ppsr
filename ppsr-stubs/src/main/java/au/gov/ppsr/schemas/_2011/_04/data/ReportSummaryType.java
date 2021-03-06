
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for ReportSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PdfFilePageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReportCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReportExpiryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReportFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportFileSizeBytes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReportFormat" type="{http://schemas.ppsr.gov.au/2011/04/data}ReportFormatType"/>
 *         &lt;element name="ReportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportProducedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReportRequestedB2GAccountCustomerLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportRequestedChannel" type="{http://schemas.ppsr.gov.au/2011/04/data}ReportRequestedChannelType"/>
 *         &lt;element name="ReportRequestedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReportRequestedUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportStatus" type="{http://schemas.ppsr.gov.au/2011/04/data}ReportStatusType"/>
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSummary", propOrder = {
    "pdfFilePageCount",
    "reportCriteria",
    "reportExpiryDateTime",
    "reportFileName",
    "reportFileSizeBytes",
    "reportFormat",
    "reportNumber",
    "reportProducedDateTime",
    "reportRequestedB2GAccountCustomerLocation",
    "reportRequestedChannel",
    "reportRequestedDateTime",
    "reportRequestedUsername",
    "reportStatus",
    "reportType"
})
public class ReportSummaryType {

    @XmlElementRef(name = "PdfFilePageCount", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Integer> pdfFilePageCount;
    @XmlElement(name = "ReportCriteria", required = true, nillable = true)
    protected ReportSummaryType.ReportCriteria reportCriteria;
    @XmlElementRef(name = "ReportExpiryDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> reportExpiryDateTime;
    @XmlElementRef(name = "ReportFileName", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> reportFileName;
    @XmlElementRef(name = "ReportFileSizeBytes", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<Integer> reportFileSizeBytes;
    @XmlElement(name = "ReportFormat", required = true)
    protected ReportFormatTypeType reportFormat;
    @XmlElement(name = "ReportNumber", required = true, nillable = true)
    protected String reportNumber;
    @XmlElementRef(name = "ReportProducedDateTime", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> reportProducedDateTime;
    @XmlElementRef(name = "ReportRequestedB2GAccountCustomerLocation", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> reportRequestedB2GAccountCustomerLocation;
    @XmlElement(name = "ReportRequestedChannel", required = true)
    protected ReportRequestedChannelTypeType reportRequestedChannel;
    @XmlElement(name = "ReportRequestedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportRequestedDateTime;
    @XmlElement(name = "ReportRequestedUsername", required = true, nillable = true)
    protected String reportRequestedUsername;
    @XmlElement(name = "ReportStatus", required = true)
    protected ReportStatusTypeType reportStatus;
    @XmlElement(name = "ReportType", required = true, nillable = true)
    protected String reportType;

    /**
     * Gets the value of the pdfFilePageCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdfFilePageCount() {
        return pdfFilePageCount;
    }

    /**
     * Sets the value of the pdfFilePageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdfFilePageCount(JAXBElement<Integer> value) {
        this.pdfFilePageCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the reportCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSummaryType.ReportCriteria }
     *     
     */
    public ReportSummaryType.ReportCriteria getReportCriteria() {
        return reportCriteria;
    }

    /**
     * Sets the value of the reportCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSummaryType.ReportCriteria }
     *     
     */
    public void setReportCriteria(ReportSummaryType.ReportCriteria value) {
        this.reportCriteria = value;
    }

    /**
     * Gets the value of the reportExpiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportExpiryDateTime() {
        return reportExpiryDateTime;
    }

    /**
     * Sets the value of the reportExpiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportExpiryDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.reportExpiryDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the reportFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportFileName() {
        return reportFileName;
    }

    /**
     * Sets the value of the reportFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportFileName(JAXBElement<String> value) {
        this.reportFileName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reportFileSizeBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReportFileSizeBytes() {
        return reportFileSizeBytes;
    }

    /**
     * Sets the value of the reportFileSizeBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReportFileSizeBytes(JAXBElement<Integer> value) {
        this.reportFileSizeBytes = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the reportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ReportFormatTypeType }
     *     
     */
    public ReportFormatTypeType getReportFormat() {
        return reportFormat;
    }

    /**
     * Sets the value of the reportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportFormatTypeType }
     *     
     */
    public void setReportFormat(ReportFormatTypeType value) {
        this.reportFormat = value;
    }

    /**
     * Gets the value of the reportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /**
     * Sets the value of the reportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNumber(String value) {
        this.reportNumber = value;
    }

    /**
     * Gets the value of the reportProducedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportProducedDateTime() {
        return reportProducedDateTime;
    }

    /**
     * Sets the value of the reportProducedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportProducedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.reportProducedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the reportRequestedB2GAccountCustomerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportRequestedB2GAccountCustomerLocation() {
        return reportRequestedB2GAccountCustomerLocation;
    }

    /**
     * Sets the value of the reportRequestedB2GAccountCustomerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportRequestedB2GAccountCustomerLocation(JAXBElement<String> value) {
        this.reportRequestedB2GAccountCustomerLocation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reportRequestedChannel property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRequestedChannelTypeType }
     *     
     */
    public ReportRequestedChannelTypeType getReportRequestedChannel() {
        return reportRequestedChannel;
    }

    /**
     * Sets the value of the reportRequestedChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRequestedChannelTypeType }
     *     
     */
    public void setReportRequestedChannel(ReportRequestedChannelTypeType value) {
        this.reportRequestedChannel = value;
    }

    /**
     * Gets the value of the reportRequestedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportRequestedDateTime() {
        return reportRequestedDateTime;
    }

    /**
     * Sets the value of the reportRequestedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportRequestedDateTime(XMLGregorianCalendar value) {
        this.reportRequestedDateTime = value;
    }

    /**
     * Gets the value of the reportRequestedUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRequestedUsername() {
        return reportRequestedUsername;
    }

    /**
     * Sets the value of the reportRequestedUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRequestedUsername(String value) {
        this.reportRequestedUsername = value;
    }

    /**
     * Gets the value of the reportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReportStatusTypeType }
     *     
     */
    public ReportStatusTypeType getReportStatus() {
        return reportStatus;
    }

    /**
     * Sets the value of the reportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStatusTypeType }
     *     
     */
    public void setReportStatus(ReportStatusTypeType value) {
        this.reportStatus = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ReportCriteria {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
