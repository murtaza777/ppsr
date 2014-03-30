
package au.gov.ppsr.schemas._2011._04.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.gov.ppsr.schemas._2011._04.data.ReissueVerificationStatementRequestTypeType;


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
 *         &lt;element name="ReissueVerificationStatementRequest" type="{http://schemas.ppsr.gov.au/2011/04/data}ReissueVerificationStatementRequestType" minOccurs="0"/>
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
    "reissueVerificationStatementRequest"
})
@XmlRootElement(name = "ReissueVerificationStatementRequestMessage")
public class ReissueVerificationStatementRequestMessage {

    @XmlElementRef(name = "ReissueVerificationStatementRequest", namespace = "http://schemas.ppsr.gov.au/2011/04/services", type = JAXBElement.class)
    protected JAXBElement<ReissueVerificationStatementRequestTypeType> reissueVerificationStatementRequest;

    /**
     * Gets the value of the reissueVerificationStatementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReissueVerificationStatementRequestTypeType }{@code >}
     *     
     */
    public JAXBElement<ReissueVerificationStatementRequestTypeType> getReissueVerificationStatementRequest() {
        return reissueVerificationStatementRequest;
    }

    /**
     * Sets the value of the reissueVerificationStatementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReissueVerificationStatementRequestTypeType }{@code >}
     *     
     */
    public void setReissueVerificationStatementRequest(JAXBElement<ReissueVerificationStatementRequestTypeType> value) {
        this.reissueVerificationStatementRequest = ((JAXBElement<ReissueVerificationStatementRequestTypeType> ) value);
    }

}
