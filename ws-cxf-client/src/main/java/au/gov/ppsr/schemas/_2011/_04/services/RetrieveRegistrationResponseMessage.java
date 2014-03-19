
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.RetrieveRegistrationResponseTypeType;


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
 *         &lt;element name="RetrieveRegistrationResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}RetrieveRegistrationResponseType" minOccurs="0"/>
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
    "retrieveRegistrationResponse"
})
@XmlRootElement(name = "RetrieveRegistrationResponseMessage")
public class RetrieveRegistrationResponseMessage {

    @XmlElementRef(name = "RetrieveRegistrationResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<RetrieveRegistrationResponseTypeType> retrieveRegistrationResponse;

    /**
     * Gets the value of the retrieveRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveRegistrationResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<RetrieveRegistrationResponseTypeType> getRetrieveRegistrationResponse() {
        return retrieveRegistrationResponse;
    }

    /**
     * Sets the value of the retrieveRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveRegistrationResponseTypeType }{@code >}
     *     
     */
    public void setRetrieveRegistrationResponse(JAXBElement<RetrieveRegistrationResponseTypeType> value) {
        this.retrieveRegistrationResponse = ((JAXBElement<RetrieveRegistrationResponseTypeType> ) value);
    }

}
