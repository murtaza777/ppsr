
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.AmendRegistrationResponseTypeType;


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
 *         &lt;element name="AmendRegistrationResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}AmendRegistrationResponseType" minOccurs="0"/>
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
    "amendRegistrationResponse"
})
@XmlRootElement(name = "AmendRegistrationResponseMessage")
public class AmendRegistrationResponseMessage {

    @XmlElementRef(name = "AmendRegistrationResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<AmendRegistrationResponseTypeType> amendRegistrationResponse;

    /**
     * Gets the value of the amendRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmendRegistrationResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<AmendRegistrationResponseTypeType> getAmendRegistrationResponse() {
        return amendRegistrationResponse;
    }

    /**
     * Sets the value of the amendRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmendRegistrationResponseTypeType }{@code >}
     *     
     */
    public void setAmendRegistrationResponse(JAXBElement<AmendRegistrationResponseTypeType> value) {
        this.amendRegistrationResponse = ((JAXBElement<AmendRegistrationResponseTypeType> ) value);
    }

}
