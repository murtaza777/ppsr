
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdinalSearchSearchResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinalSearchSearchResultDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrdinalSearchResult" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalSearchResultType"/>
 *         &lt;element name="RegistrationOne" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalRegistrationDetail"/>
 *         &lt;element name="RegistrationTwo" type="{http://schemas.ppsr.gov.au/2011/04/data}OrdinalRegistrationDetail"/>
 *         &lt;element name="TransitionalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinalSearchSearchResultDetail", propOrder = {
    "ordinalSearchResult",
    "registrationOne",
    "registrationTwo",
    "transitionalMessage"
})
public class OrdinalSearchSearchResultDetailType {

    @XmlElement(name = "OrdinalSearchResult", required = true)
    protected OrdinalSearchResultTypeType ordinalSearchResult;
    @XmlElement(name = "RegistrationOne", required = true, nillable = true)
    protected OrdinalRegistrationDetailType registrationOne;
    @XmlElement(name = "RegistrationTwo", required = true, nillable = true)
    protected OrdinalRegistrationDetailType registrationTwo;
    @XmlElementRef(name = "TransitionalMessage", namespace = "http://schemas.ppsr.gov.au/2011/04/data", type = JAXBElement.class)
    protected JAXBElement<String> transitionalMessage;

    /**
     * Gets the value of the ordinalSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinalSearchResultTypeType }
     *     
     */
    public OrdinalSearchResultTypeType getOrdinalSearchResult() {
        return ordinalSearchResult;
    }

    /**
     * Sets the value of the ordinalSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalSearchResultTypeType }
     *     
     */
    public void setOrdinalSearchResult(OrdinalSearchResultTypeType value) {
        this.ordinalSearchResult = value;
    }

    /**
     * Gets the value of the registrationOne property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinalRegistrationDetailType }
     *     
     */
    public OrdinalRegistrationDetailType getRegistrationOne() {
        return registrationOne;
    }

    /**
     * Sets the value of the registrationOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalRegistrationDetailType }
     *     
     */
    public void setRegistrationOne(OrdinalRegistrationDetailType value) {
        this.registrationOne = value;
    }

    /**
     * Gets the value of the registrationTwo property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinalRegistrationDetailType }
     *     
     */
    public OrdinalRegistrationDetailType getRegistrationTwo() {
        return registrationTwo;
    }

    /**
     * Sets the value of the registrationTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalRegistrationDetailType }
     *     
     */
    public void setRegistrationTwo(OrdinalRegistrationDetailType value) {
        this.registrationTwo = value;
    }

    /**
     * Gets the value of the transitionalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransitionalMessage() {
        return transitionalMessage;
    }

    /**
     * Sets the value of the transitionalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransitionalMessage(JAXBElement<String> value) {
        this.transitionalMessage = ((JAXBElement<String> ) value);
    }

}
