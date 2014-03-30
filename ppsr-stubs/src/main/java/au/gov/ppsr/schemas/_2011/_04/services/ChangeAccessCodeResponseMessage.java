
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ChangeAccessCodeResponseTypeType;


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
 *         &lt;element name="ChangeAccessCodeResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}ChangeAccessCodeResponseType" minOccurs="0"/>
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
    "changeAccessCodeResponse"
})
@XmlRootElement(name = "ChangeAccessCodeResponseMessage")
public class ChangeAccessCodeResponseMessage {

    @XmlElementRef(name = "ChangeAccessCodeResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ChangeAccessCodeResponseTypeType> changeAccessCodeResponse;

    /**
     * Gets the value of the changeAccessCodeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeAccessCodeResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<ChangeAccessCodeResponseTypeType> getChangeAccessCodeResponse() {
        return changeAccessCodeResponse;
    }

    /**
     * Sets the value of the changeAccessCodeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeAccessCodeResponseTypeType }{@code >}
     *     
     */
    public void setChangeAccessCodeResponse(JAXBElement<ChangeAccessCodeResponseTypeType> value) {
        this.changeAccessCodeResponse = ((JAXBElement<ChangeAccessCodeResponseTypeType> ) value);
    }

}
