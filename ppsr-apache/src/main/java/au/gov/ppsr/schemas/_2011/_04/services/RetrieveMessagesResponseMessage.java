
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveMessagesResponseTypeType;


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
 *         &lt;element name="RetrieveMessagesResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveMessagesResponseType" minOccurs="0"/>
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
    "retrieveMessagesResponse"
})
@XmlRootElement(name = "RetrieveMessagesResponseMessage")
public class RetrieveMessagesResponseMessage {

    @XmlElementRef(name = "RetrieveMessagesResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveMessagesResponseTypeType> retrieveMessagesResponse;

    /**
     * Gets the value of the retrieveMessagesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveMessagesResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveMessagesResponseTypeType> getRetrieveMessagesResponse() {
        return retrieveMessagesResponse;
    }

    /**
     * Sets the value of the retrieveMessagesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveMessagesResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveMessagesResponse(JAXBElement<RetrieveMessagesResponseTypeType> value) {
        this.retrieveMessagesResponse = ((JAXBElement<RetrieveMessagesResponseTypeType> ) value);
    }

}
