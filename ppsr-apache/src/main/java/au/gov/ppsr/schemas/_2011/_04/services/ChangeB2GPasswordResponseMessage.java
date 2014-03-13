
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordResponseTypeType;


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
 *         &lt;element name="ChangeB2GPasswordResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}ChangeB2GPasswordResponseType" minOccurs="0"/>
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
    "changeB2GPasswordResponse"
})
@XmlRootElement(name = "ChangeB2GPasswordResponseMessage")
public class ChangeB2GPasswordResponseMessage {

    @XmlElementRef(name = "ChangeB2GPasswordResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ChangeB2GPasswordResponseTypeType> changeB2GPasswordResponse;

    /**
     * Gets the value of the changeB2GPasswordResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeB2GPasswordResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<ChangeB2GPasswordResponseTypeType> getChangeB2GPasswordResponse() {
        return changeB2GPasswordResponse;
    }

    /**
     * Sets the value of the changeB2GPasswordResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeB2GPasswordResponseTypeType }{@code >}
     *     
     */
    public void setChangeB2GPasswordResponse(JAXBElement<ChangeB2GPasswordResponseTypeType> value) {
        this.changeB2GPasswordResponse = ((JAXBElement<ChangeB2GPasswordResponseTypeType> ) value);
    }

}
