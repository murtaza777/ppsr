
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.AmendRegistrationRequestTypeType;


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
 *         &lt;element name="AmendRegistrationRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}AmendRegistrationRequestType" minOccurs="0"/>
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
    "amendRegistrationRequest"
})
@XmlRootElement(name = "AmendRegistrationRequestMessage")
public class AmendRegistrationRequestMessage {

    @XmlElementRef(name = "AmendRegistrationRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<AmendRegistrationRequestTypeType> amendRegistrationRequest;

    /**
     * Gets the value of the amendRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmendRegistrationRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<AmendRegistrationRequestTypeType> getAmendRegistrationRequest() {
        return amendRegistrationRequest;
    }

    /**
     * Sets the value of the amendRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmendRegistrationRequestTypeType }{@code >}
     *     
     */
    public void setAmendRegistrationRequest(JAXBElement<AmendRegistrationRequestTypeType> value) {
        this.amendRegistrationRequest = ((JAXBElement<AmendRegistrationRequestTypeType> ) value);
    }

}
