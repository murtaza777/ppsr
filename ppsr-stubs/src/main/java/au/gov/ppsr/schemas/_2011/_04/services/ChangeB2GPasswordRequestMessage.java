
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ChangeB2GPasswordRequestTypeType;


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
 *         &lt;element name="ChangeB2GPasswordRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}ChangeB2GPasswordRequestType" minOccurs="0"/>
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
    "changeB2GPasswordRequest"
})
@XmlRootElement(name = "ChangeB2GPasswordRequestMessage")
public class ChangeB2GPasswordRequestMessage {

    @XmlElementRef(name = "ChangeB2GPasswordRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ChangeB2GPasswordRequestTypeType> changeB2GPasswordRequest;

    /**
     * Gets the value of the changeB2GPasswordRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeB2GPasswordRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<ChangeB2GPasswordRequestTypeType> getChangeB2GPasswordRequest() {
        return changeB2GPasswordRequest;
    }

    /**
     * Sets the value of the changeB2GPasswordRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeB2GPasswordRequestTypeType }{@code >}
     *     
     */
    public void setChangeB2GPasswordRequest(JAXBElement<ChangeB2GPasswordRequestTypeType> value) {
        this.changeB2GPasswordRequest = ((JAXBElement<ChangeB2GPasswordRequestTypeType> ) value);
    }

}
