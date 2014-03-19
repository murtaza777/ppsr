
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Java class for DeleteMessagesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMessagesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="DeletedMessageIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong"/>
 *         &lt;element name="NotDeletedMessageIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMessagesResponseType", propOrder = {
    "deletedMessageIds",
    "notDeletedMessageIds"
})
public class DeleteMessagesResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "DeletedMessageIds", required = true, nillable = true)
    protected ArrayOflong deletedMessageIds;
    @XmlElement(name = "NotDeletedMessageIds", required = true, nillable = true)
    protected ArrayOflong notDeletedMessageIds;

    /**
     * Gets the value of the deletedMessageIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getDeletedMessageIds() {
        return deletedMessageIds;
    }

    /**
     * Sets the value of the deletedMessageIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setDeletedMessageIds(ArrayOflong value) {
        this.deletedMessageIds = value;
    }

    /**
     * Gets the value of the notDeletedMessageIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getNotDeletedMessageIds() {
        return notDeletedMessageIds;
    }

    /**
     * Sets the value of the notDeletedMessageIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setNotDeletedMessageIds(ArrayOflong value) {
        this.notDeletedMessageIds = value;
    }

}
