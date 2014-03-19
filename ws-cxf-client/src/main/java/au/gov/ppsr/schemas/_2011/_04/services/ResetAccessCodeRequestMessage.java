
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ResetAccessCodeRequestTypeType;


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
 *         &lt;element name="ResetAccessCodeRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}ResetAccessCodeRequestType" minOccurs="0"/>
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
    "resetAccessCodeRequest"
})
@XmlRootElement(name = "ResetAccessCodeRequestMessage")
public class ResetAccessCodeRequestMessage {

    @XmlElementRef(name = "ResetAccessCodeRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ResetAccessCodeRequestTypeType> resetAccessCodeRequest;

    /**
     * Gets the value of the resetAccessCodeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResetAccessCodeRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<ResetAccessCodeRequestTypeType> getResetAccessCodeRequest() {
        return resetAccessCodeRequest;
    }

    /**
     * Sets the value of the resetAccessCodeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResetAccessCodeRequestTypeType }{@code >}
     *     
     */
    public void setResetAccessCodeRequest(JAXBElement<ResetAccessCodeRequestTypeType> value) {
        this.resetAccessCodeRequest = ((JAXBElement<ResetAccessCodeRequestTypeType> ) value);
    }

}
