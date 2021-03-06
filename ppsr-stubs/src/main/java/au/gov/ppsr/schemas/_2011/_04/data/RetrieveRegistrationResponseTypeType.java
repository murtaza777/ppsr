
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRegistrationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="CollateralRegistration" type="{http://schemas.ppsr.gov.au/2011/04/data}CollateralRegistration"/>
 *         &lt;element name="PpsrTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRegistrationResponseType", propOrder = {
    "collateralRegistration",
    "ppsrTransactionId"
})
public class RetrieveRegistrationResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "CollateralRegistration", required = true, nillable = true)
    protected CollateralRegistrationType collateralRegistration;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;

    /**
     * Gets the value of the collateralRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRegistrationType }
     *     
     */
    public CollateralRegistrationType getCollateralRegistration() {
        return collateralRegistration;
    }

    /**
     * Sets the value of the collateralRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRegistrationType }
     *     
     */
    public void setCollateralRegistration(CollateralRegistrationType value) {
        this.collateralRegistration = value;
    }

    /**
     * Gets the value of the ppsrTransactionId property.
     * 
     */
    public long getPpsrTransactionId() {
        return ppsrTransactionId;
    }

    /**
     * Sets the value of the ppsrTransactionId property.
     * 
     */
    public void setPpsrTransactionId(long value) {
        this.ppsrTransactionId = value;
    }

}
