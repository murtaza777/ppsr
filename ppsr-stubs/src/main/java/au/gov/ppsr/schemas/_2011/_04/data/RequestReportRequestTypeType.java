
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RequestReportRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestReportRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
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
 *         &lt;element name="ReportFormat" type="{http://schemas.ppsr.gov.au/2011/04/data}ReportFormatType"/>
 *         &lt;element name="ReportReadyNotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestReportRequestType", propOrder = {
    "reportCriteria",
    "reportFormat",
    "reportReadyNotificationEmailAddress",
    "reportType"
})
public class RequestReportRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "ReportCriteria", required = true, nillable = true)
    protected RequestReportRequestTypeType.ReportCriteria reportCriteria;
    @XmlElement(name = "ReportFormat", required = true)
    protected ReportFormatTypeType reportFormat;
    @XmlElementRef(name = "ReportReadyNotificationEmailAddress", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> reportReadyNotificationEmailAddress;
    @XmlElement(name = "ReportType", required = true, nillable = true)
    protected String reportType;

    /**
     * Gets the value of the reportCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReportRequestTypeType.ReportCriteria }
     *     
     */
    public RequestReportRequestTypeType.ReportCriteria getReportCriteria() {
        return reportCriteria;
    }

    /**
     * Sets the value of the reportCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReportRequestTypeType.ReportCriteria }
     *     
     */
    public void setReportCriteria(RequestReportRequestTypeType.ReportCriteria value) {
        this.reportCriteria = value;
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
     * Gets the value of the reportReadyNotificationEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportReadyNotificationEmailAddress() {
        return reportReadyNotificationEmailAddress;
    }

    /**
     * Sets the value of the reportReadyNotificationEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportReadyNotificationEmailAddress(JAXBElement<String> value) {
        this.reportReadyNotificationEmailAddress = ((JAXBElement<String> ) value);
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
