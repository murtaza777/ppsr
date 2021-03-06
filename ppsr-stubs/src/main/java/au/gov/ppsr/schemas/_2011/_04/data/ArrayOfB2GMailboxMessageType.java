
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfB2GMailboxMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfB2GMailboxMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="B2GMailboxMessage" type="{http://schemas.ppsr.gov.au/2011/04/data}B2GMailboxMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfB2GMailboxMessage", propOrder = {
    "b2GMailboxMessage"
})
public class ArrayOfB2GMailboxMessageType {

    @XmlElement(name = "B2GMailboxMessage", nillable = true)
    protected List<B2GMailboxMessageType> b2GMailboxMessage;

    /**
     * Gets the value of the b2GMailboxMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b2GMailboxMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB2GMailboxMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B2GMailboxMessageType }
     * 
     * 
     */
    public List<B2GMailboxMessageType> getB2GMailboxMessage() {
        if (b2GMailboxMessage == null) {
            b2GMailboxMessage = new ArrayList<B2GMailboxMessageType>();
        }
        return this.b2GMailboxMessage;
    }

}
