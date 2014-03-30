
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveMessagesRequestTypeType;


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
 *         &lt;element name="RetrieveMessagesRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveMessagesRequestType" minOccurs="0"/>
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
    "retrieveMessagesRequest"
})
@XmlRootElement(name = "RetrieveMessagesRequestMessage")
public class RetrieveMessagesRequestMessage {

    @XmlElementRef(name = "RetrieveMessagesRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveMessagesRequestTypeType> retrieveMessagesRequest;

    /**
     * Gets the value of the retrieveMessagesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveMessagesRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveMessagesRequestTypeType> getRetrieveMessagesRequest() {
        return retrieveMessagesRequest;
    }

    /**
     * Sets the value of the retrieveMessagesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveMessagesRequestTypeType }{@code >}
     *     
     */
    public void setRetrieveMessagesRequest(JAXBElement<RetrieveMessagesRequestTypeType> value) {
        this.retrieveMessagesRequest = ((JAXBElement<RetrieveMessagesRequestTypeType> ) value);
    }

}
