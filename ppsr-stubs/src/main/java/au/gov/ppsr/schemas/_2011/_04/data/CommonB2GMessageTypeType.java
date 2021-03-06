
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonB2GMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonB2GMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomersRequestMessageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomersUserDefinedFields" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfCustomersUserDefinedField"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonB2GMessageType", propOrder = {
    "customersRequestMessageId",
    "customersUserDefinedFields"
})
@XmlSeeAlso({
    CommonRequestTypeType.class,
    CommonResponseTypeType.class
})
public class CommonB2GMessageTypeType {

    @XmlElement(name = "CustomersRequestMessageId", required = true, nillable = true)
    protected String customersRequestMessageId;
    @XmlElement(name = "CustomersUserDefinedFields", required = true, nillable = true)
    protected ArrayOfCustomersUserDefinedFieldType customersUserDefinedFields;

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

    /**
     * Gets the value of the customersUserDefinedFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomersUserDefinedFieldType }
     *     
     */
    public ArrayOfCustomersUserDefinedFieldType getCustomersUserDefinedFields() {
        return customersUserDefinedFields;
    }

    /**
     * Sets the value of the customersUserDefinedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomersUserDefinedFieldType }
     *     
     */
    public void setCustomersUserDefinedFields(ArrayOfCustomersUserDefinedFieldType value) {
        this.customersUserDefinedFields = value;
    }

}
