//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package _int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeHorizontalVisibilityPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeHorizontalVisibilityPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://icao.int/iwxxm/2.1}AerodromeHorizontalVisibility"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeHorizontalVisibilityPropertyType", propOrder = {
    "aerodromeHorizontalVisibility"
})
public class AerodromeHorizontalVisibilityPropertyType {

    @XmlElement(name = "AerodromeHorizontalVisibility", required = true)
    protected AerodromeHorizontalVisibilityType aerodromeHorizontalVisibility;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeHorizontalVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeHorizontalVisibilityType }
     *     
     */
    public AerodromeHorizontalVisibilityType getAerodromeHorizontalVisibility() {
        return aerodromeHorizontalVisibility;
    }

    /**
     * Sets the value of the aerodromeHorizontalVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeHorizontalVisibilityType }
     *     
     */
    public void setAerodromeHorizontalVisibility(AerodromeHorizontalVisibilityType value) {
        this.aerodromeHorizontalVisibility = value;
    }

    public boolean isSetAerodromeHorizontalVisibility() {
        return (this.aerodromeHorizontalVisibility!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}