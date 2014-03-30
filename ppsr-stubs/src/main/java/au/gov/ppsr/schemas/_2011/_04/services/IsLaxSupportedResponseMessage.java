
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.IsLaxSupportedResponseTypeType;


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
 *         &lt;element name="IsLaxSupportedResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}IsLaxSupportedResponseType" minOccurs="0"/>
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
    "isLaxSupportedResponse"
})
@XmlRootElement(name = "IsLaxSupportedResponseMessage")
public class IsLaxSupportedResponseMessage {

    @XmlElementRef(name = "IsLaxSupportedResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<IsLaxSupportedResponseTypeType> isLaxSupportedResponse;

    /**
     * Gets the value of the isLaxSupportedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IsLaxSupportedResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<IsLaxSupportedResponseTypeType> getIsLaxSupportedResponse() {
        return isLaxSupportedResponse;
    }

    /**
     * Sets the value of the isLaxSupportedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IsLaxSupportedResponseTypeType }{@code >}
     *     
     */
    public void setIsLaxSupportedResponse(JAXBElement<IsLaxSupportedResponseTypeType> value) {
        this.isLaxSupportedResponse = ((JAXBElement<IsLaxSupportedResponseTypeType> ) value);
    }

}
