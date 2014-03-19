
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ResetAccessCodeResponseTypeType;


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
 *         &lt;element name="ResetAccessCodeResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}ResetAccessCodeResponseType" minOccurs="0"/>
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
    "resetAccessCodeResponse"
})
@XmlRootElement(name = "ResetAccessCodeResponseMessage")
public class ResetAccessCodeResponseMessage {

    @XmlElementRef(name = "ResetAccessCodeResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ResetAccessCodeResponseTypeType> resetAccessCodeResponse;

    /**
     * Gets the value of the resetAccessCodeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResetAccessCodeResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<ResetAccessCodeResponseTypeType> getResetAccessCodeResponse() {
        return resetAccessCodeResponse;
    }

    /**
     * Sets the value of the resetAccessCodeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResetAccessCodeResponseTypeType }{@code >}
     *     
     */
    public void setResetAccessCodeResponse(JAXBElement<ResetAccessCodeResponseTypeType> value) {
        this.resetAccessCodeResponse = ((JAXBElement<ResetAccessCodeResponseTypeType> ) value);
    }

}
