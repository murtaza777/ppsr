
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatedAddressForService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatedAddressForService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressForService" type="{http://schemas.ppsr.gov.au/2011/04/data}NewAddressForService"/>
 *         &lt;element name="CompletionNotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedAddressForService", propOrder = {
    "addressForService",
    "completionNotificationEmailAddress"
})
public class UpdatedAddressForServiceType {

    @XmlElement(name = "AddressForService", required = true, nillable = true)
    protected NewAddressForServiceType addressForService;
    @XmlElementRef(name = "CompletionNotificationEmailAddress", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> completionNotificationEmailAddress;

    /**
     * Gets the value of the addressForService property.
     * 
     * @return
     *     possible object is
     *     {@link NewAddressForServiceType }
     *     
     */
    public NewAddressForServiceType getAddressForService() {
        return addressForService;
    }

    /**
     * Sets the value of the addressForService property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewAddressForServiceType }
     *     
     */
    public void setAddressForService(NewAddressForServiceType value) {
        this.addressForService = value;
    }

    /**
     * Gets the value of the completionNotificationEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompletionNotificationEmailAddress() {
        return completionNotificationEmailAddress;
    }

    /**
     * Sets the value of the completionNotificationEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompletionNotificationEmailAddress(JAXBElement<String> value) {
        this.completionNotificationEmailAddress = ((JAXBElement<String> ) value);
    }

}
