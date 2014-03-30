
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomersUserDefinedField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomersUserDefinedField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomersUserDefinedField" type="{http://schemas.ppsr.gov.au/2011/04/data}CustomersUserDefinedField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomersUserDefinedField", propOrder = {
    "customersUserDefinedField"
})
public class ArrayOfCustomersUserDefinedFieldType {

    @XmlElement(name = "CustomersUserDefinedField", nillable = true)
    protected List<CustomersUserDefinedFieldType> customersUserDefinedField;

    /**
     * Gets the value of the customersUserDefinedField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customersUserDefinedField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomersUserDefinedField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomersUserDefinedFieldType }
     * 
     * 
     */
    public List<CustomersUserDefinedFieldType> getCustomersUserDefinedField() {
        if (customersUserDefinedField == null) {
            customersUserDefinedField = new ArrayList<CustomersUserDefinedFieldType>();
        }
        return this.customersUserDefinedField;
    }

}
