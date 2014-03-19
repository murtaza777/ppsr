
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Java class for DeleteMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonRequestType">
 *       &lt;sequence>
 *         &lt;element name="ToDeleteMessageIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMessagesRequestType", propOrder = {
    "toDeleteMessageIds"
})
public class DeleteMessagesRequestTypeType
    extends CommonRequestTypeType
{

    @XmlElement(name = "ToDeleteMessageIds", required = true, nillable = true)
    protected ArrayOflong toDeleteMessageIds;

    /**
     * Gets the value of the toDeleteMessageIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getToDeleteMessageIds() {
        return toDeleteMessageIds;
    }

    /**
     * Sets the value of the toDeleteMessageIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setToDeleteMessageIds(ArrayOflong value) {
        this.toDeleteMessageIds = value;
    }

}
