
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RequestReportResponseTypeType;


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
 *         &lt;element name="RequestReportResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RequestReportResponseType" minOccurs="0"/>
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
    "requestReportResponse"
})
@XmlRootElement(name = "RequestReportResponseMessage")
public class RequestReportResponseMessage {

    @XmlElementRef(name = "RequestReportResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RequestReportResponseTypeType> requestReportResponse;

    /**
     * Gets the value of the requestReportResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestReportResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RequestReportResponseTypeType> getRequestReportResponse() {
        return requestReportResponse;
    }

    /**
     * Sets the value of the requestReportResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestReportResponseTypeType }{@code >}
     *     
     */
    public void setRequestReportResponse(JAXBElement<RequestReportResponseTypeType> value) {
        this.requestReportResponse = ((JAXBElement<RequestReportResponseTypeType> ) value);
    }

}
