
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.PingResponseTypeType;


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
 *         &lt;element name="PingResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}PingResponseType" minOccurs="0"/>
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
    "pingResponse"
})
@XmlRootElement(name = "PingResponseMessage")
public class PingResponseMessage {

    @XmlElementRef(name = "PingResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<PingResponseTypeType> pingResponse;

    /**
     * Gets the value of the pingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PingResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<PingResponseTypeType> getPingResponse() {
        return pingResponse;
    }

    /**
     * Sets the value of the pingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PingResponseTypeType }{@code >}
     *     
     */
    public void setPingResponse(JAXBElement<PingResponseTypeType> value) {
        this.pingResponse = ((JAXBElement<PingResponseTypeType> ) value);
    }

}
