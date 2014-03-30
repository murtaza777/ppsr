
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferAllRegistrationsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAllRegistrationsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfCurrentRegistrations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "TransferAllRegistrationsResponseType", propOrder = {
    "numberOfCurrentRegistrations",
    "ppsrTransactionId"
})
public class TransferAllRegistrationsResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "NumberOfCurrentRegistrations")
    protected Integer numberOfCurrentRegistrations;
    @XmlElement(name = "PpsrTransactionId")
    protected long ppsrTransactionId;

    /**
     * Gets the value of the numberOfCurrentRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCurrentRegistrations() {
        return numberOfCurrentRegistrations;
    }

    /**
     * Sets the value of the numberOfCurrentRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCurrentRegistrations(Integer value) {
        this.numberOfCurrentRegistrations = value;
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
