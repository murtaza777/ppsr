//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.23 at 05:12:29 PM EST 
//


package au.gov.ppsr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeDetails" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfChangeDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeHistory", propOrder = {
    "changeDetails"
})
public class ChangeHistoryType {

    @XmlElement(name = "ChangeDetails", required = true, nillable = true)
    protected ArrayOfChangeDetailType changeDetails;

    /**
     * Gets the value of the changeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChangeDetailType }
     *     
     */
    public ArrayOfChangeDetailType getChangeDetails() {
        return changeDetails;
    }

    /**
     * Sets the value of the changeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChangeDetailType }
     *     
     */
    public void setChangeDetails(ArrayOfChangeDetailType value) {
        this.changeDetails = value;
    }

}
