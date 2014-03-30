
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ChangeAccessCodeRequestTypeType;


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
 *         &lt;element name="ChangeAccessCodeRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}ChangeAccessCodeRequestType" minOccurs="0"/>
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
    "changeAccessCodeRequest"
})
@XmlRootElement(name = "ChangeAccessCodeRequestMessage")
public class ChangeAccessCodeRequestMessage {

    @XmlElementRef(name = "ChangeAccessCodeRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ChangeAccessCodeRequestTypeType> changeAccessCodeRequest;

    /**
     * Gets the value of the changeAccessCodeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeAccessCodeRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<ChangeAccessCodeRequestTypeType> getChangeAccessCodeRequest() {
        return changeAccessCodeRequest;
    }

    /**
     * Sets the value of the changeAccessCodeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeAccessCodeRequestTypeType }{@code >}
     *     
     */
    public void setChangeAccessCodeRequest(JAXBElement<ChangeAccessCodeRequestTypeType> value) {
        this.changeAccessCodeRequest = ((JAXBElement<ChangeAccessCodeRequestTypeType> ) value);
    }

}
