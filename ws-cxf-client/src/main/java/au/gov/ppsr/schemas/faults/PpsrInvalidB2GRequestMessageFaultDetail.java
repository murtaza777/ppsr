
package au.gov.ppsr.schemas.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PpsrInvalidB2GRequestMessageFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpsrInvalidB2GRequestMessageFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/faults}PpsrSoapFaultDetail">
 *       &lt;sequence>
 *         &lt;element name="CustomersRequestMessageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpsrInvalidB2GRequestMessageFaultDetail", propOrder = {
    "customersRequestMessageId"
})
public class PpsrInvalidB2GRequestMessageFaultDetail
    extends PpsrSoapFaultDetail
{

    @XmlElement(name = "CustomersRequestMessageId", required = true, nillable = true)
    protected String customersRequestMessageId;

    /**
     * Gets the value of the customersRequestMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomersRequestMessageId() {
        return customersRequestMessageId;
    }

    /**
     * Sets the value of the customersRequestMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomersRequestMessageId(String value) {
        this.customersRequestMessageId = value;
    }

}
