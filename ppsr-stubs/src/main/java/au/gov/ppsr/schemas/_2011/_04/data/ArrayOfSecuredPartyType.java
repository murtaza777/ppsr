
package au.gov.ppsr.schemas._2011._04.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSecuredParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSecuredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecuredParty" type="{http://schemas.ppsr.gov.au/2011/04/data}SecuredParty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSecuredParty", propOrder = {
    "securedParty"
})
public class ArrayOfSecuredPartyType {

    @XmlElement(name = "SecuredParty", nillable = true)
    protected List<SecuredPartyType> securedParty;

    /**
     * Gets the value of the securedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecuredParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuredPartyType }
     * 
     * 
     */
    public List<SecuredPartyType> getSecuredParty() {
        if (securedParty == null) {
            securedParty = new ArrayList<SecuredPartyType>();
        }
        return this.securedParty;
    }

}
