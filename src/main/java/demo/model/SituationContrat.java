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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Situation_Contrat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Situation_Contrat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifiant_Responsable_Equilibre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Code_Tarif">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Identifiant_Situation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Mode_Redressement">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type_Redressement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Code_Calcul_Tarif" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Date_Debut_Consommation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Fin_Consommation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Libelle_Plage_Heures_Creuses" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="33"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Compteur" type="{}Compteur"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Situation_Contrat", propOrder = {
    "identifiantResponsableEquilibre",
    "codeTarif",
    "identifiantSituation",
    "modeRedressement",
    "typeRedressement",
    "codeCalculTarif",
    "dateDebutConsommation",
    "dateFinConsommation",
    "libellePlageHeuresCreuses",
    "compteur"
})
public class SituationContrat {

    @XmlElement(name = "Identifiant_Responsable_Equilibre", required = true)
    protected String identifiantResponsableEquilibre;
    @XmlElement(name = "Code_Tarif", required = true)
    protected String codeTarif;
    @XmlElement(name = "Identifiant_Situation", required = true)
    protected String identifiantSituation;
    @XmlElement(name = "Mode_Redressement", required = true)
    protected String modeRedressement;
    @XmlElement(name = "Type_Redressement")
    protected String typeRedressement;
    @XmlElement(name = "Code_Calcul_Tarif")
    protected String codeCalculTarif;
    @XmlElement(name = "Date_Debut_Consommation")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDebutConsommation;
    @XmlElement(name = "Date_Fin_Consommation")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFinConsommation;
    @XmlElement(name = "Libelle_Plage_Heures_Creuses")
    protected String libellePlageHeuresCreuses;
    @XmlElement(name = "Compteur", required = true)
    protected Compteur compteur;

    /**
     * Gets the value of the identifiantResponsableEquilibre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiantResponsableEquilibre() {
        return identifiantResponsableEquilibre;
    }

    /**
     * Sets the value of the identifiantResponsableEquilibre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiantResponsableEquilibre(String value) {
        this.identifiantResponsableEquilibre = value;
    }

    /**
     * Gets the value of the codeTarif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeTarif() {
        return codeTarif;
    }

    /**
     * Sets the value of the codeTarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeTarif(String value) {
        this.codeTarif = value;
    }

    /**
     * Gets the value of the identifiantSituation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiantSituation() {
        return identifiantSituation;
    }

    /**
     * Sets the value of the identifiantSituation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiantSituation(String value) {
        this.identifiantSituation = value;
    }

    /**
     * Gets the value of the modeRedressement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeRedressement() {
        return modeRedressement;
    }

    /**
     * Sets the value of the modeRedressement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeRedressement(String value) {
        this.modeRedressement = value;
    }

    /**
     * Gets the value of the typeRedressement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRedressement() {
        return typeRedressement;
    }

    /**
     * Sets the value of the typeRedressement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRedressement(String value) {
        this.typeRedressement = value;
    }

    /**
     * Gets the value of the codeCalculTarif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCalculTarif() {
        return codeCalculTarif;
    }

    /**
     * Sets the value of the codeCalculTarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCalculTarif(String value) {
        this.codeCalculTarif = value;
    }

    /**
     * Gets the value of the dateDebutConsommation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutConsommation() {
        return dateDebutConsommation;
    }

    /**
     * Sets the value of the dateDebutConsommation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutConsommation(XMLGregorianCalendar value) {
        this.dateDebutConsommation = value;
    }

    /**
     * Gets the value of the dateFinConsommation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinConsommation() {
        return dateFinConsommation;
    }

    /**
     * Sets the value of the dateFinConsommation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinConsommation(XMLGregorianCalendar value) {
        this.dateFinConsommation = value;
    }

    /**
     * Gets the value of the libellePlageHeuresCreuses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibellePlageHeuresCreuses() {
        return libellePlageHeuresCreuses;
    }

    /**
     * Sets the value of the libellePlageHeuresCreuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibellePlageHeuresCreuses(String value) {
        this.libellePlageHeuresCreuses = value;
    }

    /**
     * Gets the value of the compteur property.
     * 
     * @return
     *     possible object is
     *     {@link Compteur }
     *     
     */
    public Compteur getCompteur() {
        return compteur;
    }

    /**
     * Sets the value of the compteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compteur }
     *     
     */
    public void setCompteur(Compteur value) {
        this.compteur = value;
    }

}
