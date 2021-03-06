
package au.gov.ppsr.schemas._2011._04.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRegistrationsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRegistrationsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ppsr.gov.au/2011/04/data}CommonResponseType">
 *       &lt;sequence>
 *         &lt;element name="Registrations" type="{http://schemas.ppsr.gov.au/2011/04/data}ArrayOfRegistrationInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRegistrationsResponseType", propOrder = {
    "registrations"
})
public class CreateRegistrationsResponseTypeType
    extends CommonResponseTypeType
{

    @XmlElement(name = "Registrations", required = true, nillable = true)
    protected ArrayOfRegistrationInfoType registrations;

    /**
     * Gets the value of the registrations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegistrationInfoType }
     *     
     */
    public ArrayOfRegistrationInfoType getRegistrations() {
        return registrations;
    }

    /**
     * Sets the value of the registrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegistrationInfoType }
     *     
     */
    public void setRegistrations(ArrayOfRegistrationInfoType value) {
        this.registrations = value;
    }

}
