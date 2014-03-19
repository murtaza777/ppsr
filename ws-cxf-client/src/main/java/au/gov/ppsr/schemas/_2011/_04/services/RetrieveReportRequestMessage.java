
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveReportRequestTypeType;


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
 *         &lt;element name="RetrieveReportRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveReportRequestType" minOccurs="0"/>
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
    "retrieveReportRequest"
})
@XmlRootElement(name = "RetrieveReportRequestMessage")
public class RetrieveReportRequestMessage {

    @XmlElementRef(name = "RetrieveReportRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveReportRequestTypeType> retrieveReportRequest;

    /**
     * Gets the value of the retrieveReportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveReportRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveReportRequestTypeType> getRetrieveReportRequest() {
        return retrieveReportRequest;
    }

    /**
     * Sets the value of the retrieveReportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveReportRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveReportRequest(JAXBElement<RetrieveReportRequestTypeType> value) {
        this.retrieveReportRequest = ((JAXBElement<RetrieveReportRequestTypeType> ) value);
    }

}
