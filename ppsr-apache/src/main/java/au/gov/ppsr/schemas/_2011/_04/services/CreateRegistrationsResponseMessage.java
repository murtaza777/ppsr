
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.CreateRegistrationsResponseTypeType;


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
 *         &lt;element name="CreateRegistrationsResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}CreateRegistrationsResponseType" minOccurs="0"/>
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
    "createRegistrationsResponse"
})
@XmlRootElement(name = "CreateRegistrationsResponseMessage")
public class CreateRegistrationsResponseMessage {

    @XmlElementRef(name = "CreateRegistrationsResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<CreateRegistrationsResponseTypeType> createRegistrationsResponse;

    /**
     * Gets the value of the createRegistrationsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateRegistrationsResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<CreateRegistrationsResponseTypeType> getCreateRegistrationsResponse() {
        return createRegistrationsResponse;
    }

    /**
     * Sets the value of the createRegistrationsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateRegistrationsResponseTypeType }{@code >}
     *     
     */
    public void setCreateRegistrationsResponse(JAXBElement<CreateRegistrationsResponseTypeType> value) {
        this.createRegistrationsResponse = ((JAXBElement<CreateRegistrationsResponseTypeType> ) value);
    }

}
