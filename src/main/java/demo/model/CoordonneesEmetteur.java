//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.15 at 05:33:55 PM CEST 
//


package demo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coordonnees_Emetteur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coordonnees_Emetteur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coordonnees_E_Ligne1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coordonnees_E_Ligne2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coordonnees_E_Ligne3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coordonnees_E_Ligne4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coordonnees_E_Ligne5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coordonnees_E_Ligne6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coordonnees_E_Ligne7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordonnees_Emetteur", propOrder = {
    "coordonneesELigne1",
    "coordonneesELigne2",
    "coordonneesELigne3",
    "coordonneesELigne4",
    "coordonneesELigne5",
    "coordonneesELigne6",
    "coordonneesELigne7"
})
public class CoordonneesEmetteur {

    @XmlElement(name = "Coordonnees_E_Ligne1", required = true)
    protected String coordonneesELigne1;
    @XmlElement(name = "Coordonnees_E_Ligne2")
    protected String coordonneesELigne2;
    @XmlElement(name = "Coordonnees_E_Ligne3")
    protected String coordonneesELigne3;
    @XmlElement(name = "Coordonnees_E_Ligne4")
    protected String coordonneesELigne4;
    @XmlElement(name = "Coordonnees_E_Ligne5")
    protected String coordonneesELigne5;
    @XmlElement(name = "Coordonnees_E_Ligne6")
    protected String coordonneesELigne6;
    @XmlElement(name = "Coordonnees_E_Ligne7")
    protected String coordonneesELigne7;

    /**
     * Gets the value of the coordonneesELigne1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne1() {
        return coordonneesELigne1;
    }

    /**
     * Sets the value of the coordonneesELigne1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne1(String value) {
        this.coordonneesELigne1 = value;
    }

    /**
     * Gets the value of the coordonneesELigne2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne2() {
        return coordonneesELigne2;
    }

    /**
     * Sets the value of the coordonneesELigne2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne2(String value) {
        this.coordonneesELigne2 = value;
    }

    /**
     * Gets the value of the coordonneesELigne3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne3() {
        return coordonneesELigne3;
    }

    /**
     * Sets the value of the coordonneesELigne3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne3(String value) {
        this.coordonneesELigne3 = value;
    }

    /**
     * Gets the value of the coordonneesELigne4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne4() {
        return coordonneesELigne4;
    }

    /**
     * Sets the value of the coordonneesELigne4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne4(String value) {
        this.coordonneesELigne4 = value;
    }

    /**
     * Gets the value of the coordonneesELigne5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne5() {
        return coordonneesELigne5;
    }

    /**
     * Sets the value of the coordonneesELigne5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne5(String value) {
        this.coordonneesELigne5 = value;
    }

    /**
     * Gets the value of the coordonneesELigne6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne6() {
        return coordonneesELigne6;
    }

    /**
     * Sets the value of the coordonneesELigne6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne6(String value) {
        this.coordonneesELigne6 = value;
    }

    /**
     * Gets the value of the coordonneesELigne7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesELigne7() {
        return coordonneesELigne7;
    }

    /**
     * Sets the value of the coordonneesELigne7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesELigne7(String value) {
        this.coordonneesELigne7 = value;
    }

}
