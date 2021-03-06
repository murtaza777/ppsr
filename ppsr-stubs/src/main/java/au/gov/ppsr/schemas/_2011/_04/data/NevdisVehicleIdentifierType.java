
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NevdisVehicleIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NevdisVehicleIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentifierType" type="{http://schemas.ppsr.gov.au/2011/04/data}NevdisVehicleIdentifierType"/>
 *         &lt;element name="IdentifierValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NevdisVehicleIdentifier", propOrder = {
    "identifierType",
    "identifierValue"
})
public class NevdisVehicleIdentifierType {

    @XmlElement(name = "IdentifierType", required = true)
    protected NevdisVehicleIdentifierTypeType identifierType;
    @XmlElement(name = "IdentifierValue", required = true, nillable = true)
    protected String identifierValue;

    /**
     * Gets the value of the identifierType property.
     * 
     * @return
     *     possible object is
     *     {@link NevdisVehicleIdentifierTypeType }
     *     
     */
    public NevdisVehicleIdentifierTypeType getIdentifierType() {
        return identifierType;
    }

    /**
     * Sets the value of the identifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NevdisVehicleIdentifierTypeType }
     *     
     */
    public void setIdentifierType(NevdisVehicleIdentifierTypeType value) {
        this.identifierType = value;
    }

    /**
     * Gets the value of the identifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierValue() {
        return identifierValue;
    }

    /**
     * Sets the value of the identifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierValue(String value) {
        this.identifierValue = value;
    }

}
