
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveMessagePdfRequestTypeType;


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
 *         &lt;element name="RetrieveMessagePdfRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveMessagePdfRequestType" minOccurs="0"/>
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
    "retrieveMessagePdfRequest"
})
@XmlRootElement(name = "RetrieveMessagePdfRequestMessage")
public class RetrieveMessagePdfRequestMessage {

    @XmlElementRef(name = "RetrieveMessagePdfRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveMessagePdfRequestTypeType> retrieveMessagePdfRequest;

    /**
     * Gets the value of the retrieveMessagePdfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveMessagePdfRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveMessagePdfRequestTypeType> getRetrieveMessagePdfRequest() {
        return retrieveMessagePdfRequest;
    }

    /**
     * Sets the value of the retrieveMessagePdfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveMessagePdfRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveMessagePdfRequest(JAXBElement<RetrieveMessagePdfRequestTypeType> value) {
        this.retrieveMessagePdfRequest = ((JAXBElement<RetrieveMessagePdfRequestTypeType> ) value);
    }

}
