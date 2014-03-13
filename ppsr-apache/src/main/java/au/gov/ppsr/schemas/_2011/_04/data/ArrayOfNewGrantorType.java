
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNewGrantor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNewGrantor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewGrantor" type="{http://schemas.ppsr.gov.au/2011/04/data}NewGrantor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNewGrantor", propOrder = {
    "newGrantor"
})
public class ArrayOfNewGrantorType {

    @XmlElement(name = "NewGrantor", nillable = true)
    protected List<NewGrantorType> newGrantor;

    /**
     * Gets the value of the newGrantor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newGrantor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewGrantor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewGrantorType }
     * 
     * 
     */
    public List<NewGrantorType> getNewGrantor() {
        if (newGrantor == null) {
            newGrantor = new ArrayList<NewGrantorType>();
        }
        return this.newGrantor;
    }

}
