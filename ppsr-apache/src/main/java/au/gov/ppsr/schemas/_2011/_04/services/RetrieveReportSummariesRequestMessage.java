
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveReportSummariesRequestTypeType;


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
 *         &lt;element name="RetrieveReportSummariesRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveReportSummariesRequestType" minOccurs="0"/>
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
    "retrieveReportSummariesRequest"
})
@XmlRootElement(name = "RetrieveReportSummariesRequestMessage")
public class RetrieveReportSummariesRequestMessage {

    @XmlElementRef(name = "RetrieveReportSummariesRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveReportSummariesRequestTypeType> retrieveReportSummariesRequest;

    /**
     * Gets the value of the retrieveReportSummariesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveReportSummariesRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveReportSummariesRequestTypeType> getRetrieveReportSummariesRequest() {
        return retrieveReportSummariesRequest;
    }

    /**
     * Sets the value of the retrieveReportSummariesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveReportSummariesRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveReportSummariesRequest(JAXBElement<RetrieveReportSummariesRequestTypeType> value) {
        this.retrieveReportSummariesRequest = ((JAXBElement<RetrieveReportSummariesRequestTypeType> ) value);
    }

}
