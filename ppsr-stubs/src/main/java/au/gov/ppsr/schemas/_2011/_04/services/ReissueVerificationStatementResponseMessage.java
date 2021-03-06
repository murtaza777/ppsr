
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ReissueVerificationStatementResponseTypeType;


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
 *         &lt;element name="ReissueVerificationStatementResponse" type="{http://schemas.ppsr.gov.au/2011/04/data}ReissueVerificationStatementResponseType" minOccurs="0"/>
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
    "reissueVerificationStatementResponse"
})
@XmlRootElement(name = "ReissueVerificationStatementResponseMessage")
public class ReissueVerificationStatementResponseMessage {

    @XmlElementRef(name = "ReissueVerificationStatementResponse", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ReissueVerificationStatementResponseTypeType> reissueVerificationStatementResponse;

    /**
     * Gets the value of the reissueVerificationStatementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReissueVerificationStatementResponseTypeType }{@code >}
     *     
     */
    public JAXBElement<ReissueVerificationStatementResponseTypeType> getReissueVerificationStatementResponse() {
        return reissueVerificationStatementResponse;
    }

    /**
     * Sets the value of the reissueVerificationStatementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReissueVerificationStatementResponseTypeType }{@code >}
     *     
     */
    public void setReissueVerificationStatementResponse(JAXBElement<ReissueVerificationStatementResponseTypeType> value) {
        this.reissueVerificationStatementResponse = ((JAXBElement<ReissueVerificationStatementResponseTypeType> ) value);
    }

}
