//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.15 at 05:33:55 PM CEST 
//


package demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Corps_de_fichier_par_PDL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Corps_de_fichier_par_PDL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifiant_Stable_PDL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Rang_QE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type_Client" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type_Relation_Contractuelle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Evenement_Declencheur">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Numero_Telephone_Depannage_Urgence">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Facture_Deroutee" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Source_Redressement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Motif_Redressement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Commentaire_Redressement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Date_Theorique_Prochaine_Releve" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Situation_Contrat" type="{}Situation_Contrat" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Corps_de_fichier_par_PDL", propOrder = {
    "identifiantStablePDL",
    "rangQE",
    "typeClient",
    "typeRelationContractuelle",
    "evenementDeclencheur",
    "numeroTelephoneDepannageUrgence",
    "factureDeroutee",
    "sourceRedressement",
    "motifRedressement",
    "commentaireRedressement",
    "dateTheoriqueProchaineReleve",
    "situationContrat"
})
@XmlRootElement(name="Corps_de_fichier_par_PDL")
public class CorpsDeFichierParPDL {

    @XmlElement(name = "Identifiant_Stable_PDL", required = true)
    protected String identifiantStablePDL;
    @XmlElement(name = "Rang_QE", required = true)
    protected String rangQE;
    @XmlElement(name = "Type_Client")
    protected String typeClient;
    @XmlElement(name = "Type_Relation_Contractuelle", required = true)
    protected String typeRelationContractuelle;
    @XmlElement(name = "Evenement_Declencheur", required = true)
    protected String evenementDeclencheur;
    @XmlElement(name = "Numero_Telephone_Depannage_Urgence", required = true)
    protected String numeroTelephoneDepannageUrgence;
    @XmlElement(name = "Facture_Deroutee")
    protected String factureDeroutee;
    @XmlElement(name = "Source_Redressement")
    protected String sourceRedressement;
    @XmlElement(name = "Motif_Redressement")
    protected String motifRedressement;
    @XmlElement(name = "Commentaire_Redressement")
    protected String commentaireRedressement;
    @XmlElement(name = "Date_Theorique_Prochaine_Releve")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTheoriqueProchaineReleve;
    @XmlElement(name = "Situation_Contrat", required = true)
    protected List<SituationContrat> situationContrat;

    /**
     * Gets the value of the identifiantStablePDL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiantStablePDL() {
        return identifiantStablePDL;
    }

    /**
     * Sets the value of the identifiantStablePDL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiantStablePDL(String value) {
        this.identifiantStablePDL = value;
    }

    /**
     * Gets the value of the rangQE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangQE() {
        return rangQE;
    }

    /**
     * Sets the value of the rangQE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangQE(String value) {
        this.rangQE = value;
    }

    /**
     * Gets the value of the typeClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeClient() {
        return typeClient;
    }

    /**
     * Sets the value of the typeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeClient(String value) {
        this.typeClient = value;
    }

    /**
     * Gets the value of the typeRelationContractuelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRelationContractuelle() {
        return typeRelationContractuelle;
    }

    /**
     * Sets the value of the typeRelationContractuelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRelationContractuelle(String value) {
        this.typeRelationContractuelle = value;
    }

    /**
     * Gets the value of the evenementDeclencheur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvenementDeclencheur() {
        return evenementDeclencheur;
    }

    /**
     * Sets the value of the evenementDeclencheur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvenementDeclencheur(String value) {
        this.evenementDeclencheur = value;
    }

    /**
     * Gets the value of the numeroTelephoneDepannageUrgence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelephoneDepannageUrgence() {
        return numeroTelephoneDepannageUrgence;
    }

    /**
     * Sets the value of the numeroTelephoneDepannageUrgence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelephoneDepannageUrgence(String value) {
        this.numeroTelephoneDepannageUrgence = value;
    }

    /**
     * Gets the value of the factureDeroutee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactureDeroutee() {
        return factureDeroutee;
    }

    /**
     * Sets the value of the factureDeroutee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactureDeroutee(String value) {
        this.factureDeroutee = value;
    }

    /**
     * Gets the value of the sourceRedressement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRedressement() {
        return sourceRedressement;
    }

    /**
     * Sets the value of the sourceRedressement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRedressement(String value) {
        this.sourceRedressement = value;
    }

    /**
     * Gets the value of the motifRedressement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotifRedressement() {
        return motifRedressement;
    }

    /**
     * Sets the value of the motifRedressement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotifRedressement(String value) {
        this.motifRedressement = value;
    }

    /**
     * Gets the value of the commentaireRedressement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaireRedressement() {
        return commentaireRedressement;
    }

    /**
     * Sets the value of the commentaireRedressement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaireRedressement(String value) {
        this.commentaireRedressement = value;
    }

    /**
     * Gets the value of the dateTheoriqueProchaineReleve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTheoriqueProchaineReleve() {
        return dateTheoriqueProchaineReleve;
    }

    /**
     * Sets the value of the dateTheoriqueProchaineReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTheoriqueProchaineReleve(XMLGregorianCalendar value) {
        this.dateTheoriqueProchaineReleve = value;
    }

    /**
     * Gets the value of the situationContrat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationContrat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationContrat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationContrat }
     * 
     * 
     */
    public List<SituationContrat> getSituationContrat() {
        if (situationContrat == null) {
            situationContrat = new ArrayList<SituationContrat>();
        }
        return this.situationContrat;
    }

}
