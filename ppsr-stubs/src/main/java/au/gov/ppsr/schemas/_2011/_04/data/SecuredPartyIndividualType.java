
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuredPartyIndividual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuredPartyIndividual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GivenNames" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuredPartyIndividual", propOrder = {
    "familyName",
    "givenNames"
})
public class SecuredPartyIndividualType {

    @XmlElement(name = "FamilyName", required = true, nillable = true)
    protected String familyName;
    @XmlElement(name = "GivenNames", required = true, nillable = true)
    protected String givenNames;

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNames(String value) {
        this.givenNames = value;
    }

}
