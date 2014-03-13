
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RequestReportRequestTypeType;


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
 *         &lt;element name="RequestReportRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RequestReportRequestType" minOccurs="0"/>
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
    "requestReportRequest"
})
@XmlRootElement(name = "RequestReportRequestMessage")
public class RequestReportRequestMessage {

    @XmlElementRef(name = "RequestReportRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RequestReportRequestTypeType> requestReportRequest;

    /**
     * Gets the value of the requestReportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestReportRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RequestReportRequestTypeType> getRequestReportRequest() {
        return requestReportRequest;
    }

    /**
     * Sets the value of the requestReportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestReportRequestTypeType }{@code >}
     *     
     */
    public void setRequestReportRequest(JAXBElement<RequestReportRequestTypeType> value) {
        this.requestReportRequest = ((JAXBElement<RequestReportRequestTypeType> ) value);
    }

}
