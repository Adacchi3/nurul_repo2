package servlet;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Quasiresidential_zone <br>
 * @version generated on Thu Jun 21 13:30:55 JST 2018 by nurulfirdaus
 */

public interface Quasiresidential_zone extends LandUseZones {

    /* ***************************************************
     * Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasCharacteristic
     */
     
    /**
     * Gets all property values for the hasCharacteristic property.<p>
     * 
     * @returns a collection of values for the hasCharacteristic property.
     */
    Collection<? extends WrappedIndividual> getHasCharacteristic();

    /**
     * Checks if the class has a hasCharacteristic property value.<p>
     * 
     * @return true if there is a hasCharacteristic property value.
     */
    boolean hasHasCharacteristic();

    /**
     * Adds a hasCharacteristic property value.<p>
     * 
     * @param newHasCharacteristic the hasCharacteristic property value to be added
     */
    void addHasCharacteristic(WrappedIndividual newHasCharacteristic);

    /**
     * Removes a hasCharacteristic property value.<p>
     * 
     * @param oldHasCharacteristic the hasCharacteristic property value to be removed.
     */
    void removeHasCharacteristic(WrappedIndividual oldHasCharacteristic);


    /* ***************************************************
     * Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasCityPlanningAct
     */
     
    /**
     * Gets all property values for the hasCityPlanningAct property.<p>
     * 
     * @returns a collection of values for the hasCityPlanningAct property.
     */
    Collection<? extends LandUseZones> getHasCityPlanningAct();

    /**
     * Checks if the class has a hasCityPlanningAct property value.<p>
     * 
     * @return true if there is a hasCityPlanningAct property value.
     */
    boolean hasHasCityPlanningAct();

    /**
     * Adds a hasCityPlanningAct property value.<p>
     * 
     * @param newHasCityPlanningAct the hasCityPlanningAct property value to be added
     */
    void addHasCityPlanningAct(LandUseZones newHasCityPlanningAct);

    /**
     * Removes a hasCityPlanningAct property value.<p>
     * 
     * @param oldHasCityPlanningAct the hasCityPlanningAct property value to be removed.
     */
    void removeHasCityPlanningAct(LandUseZones oldHasCityPlanningAct);


    /* ***************************************************
     * Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasRegion
     */
     
    /**
     * Gets all property values for the hasRegion property.<p>
     * 
     * @returns a collection of values for the hasRegion property.
     */
    Collection<? extends WrappedIndividual> getHasRegion();

    /**
     * Checks if the class has a hasRegion property value.<p>
     * 
     * @return true if there is a hasRegion property value.
     */
    boolean hasHasRegion();

    /**
     * Adds a hasRegion property value.<p>
     * 
     * @param newHasRegion the hasRegion property value to be added
     */
    void addHasRegion(WrappedIndividual newHasRegion);

    /**
     * Removes a hasRegion property value.<p>
     * 
     * @param oldHasRegion the hasRegion property value to be removed.
     */
    void removeHasRegion(WrappedIndividual oldHasRegion);


    /* ***************************************************
     * Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasType
     */
     
    /**
     * Gets all property values for the hasType property.<p>
     * 
     * @returns a collection of values for the hasType property.
     */
    Collection<? extends WrappedIndividual> getHasType();

    /**
     * Checks if the class has a hasType property value.<p>
     * 
     * @return true if there is a hasType property value.
     */
    boolean hasHasType();

    /**
     * Adds a hasType property value.<p>
     * 
     * @param newHasType the hasType property value to be added
     */
    void addHasType(WrappedIndividual newHasType);

    /**
     * Removes a hasType property value.<p>
     * 
     * @param oldHasType the hasType property value to be removed.
     */
    void removeHasType(WrappedIndividual oldHasType);


    /* ***************************************************
     * Property http://www.w3.org/2000/01/rdf-schema#subClassOf
     */
     
    /**
     * Gets all property values for the rdfs:subClassOf property.<p>
     * 
     * @returns a collection of values for the rdfs:subClassOf property.
     */
    Collection<? extends RealEstate> getRdfs:subClassOf();

    /**
     * Checks if the class has a rdfs:subClassOf property value.<p>
     * 
     * @return true if there is a rdfs:subClassOf property value.
     */
    boolean hasRdfs:subClassOf();

    /**
     * Adds a rdfs:subClassOf property value.<p>
     * 
     * @param newRdfs:subClassOf the rdfs:subClassOf property value to be added
     */
    void addRdfs:subClassOf(RealEstate newRdfs:subClassOf);

    /**
     * Removes a rdfs:subClassOf property value.<p>
     * 
     * @param oldRdfs:subClassOf the rdfs:subClassOf property value to be removed.
     */
    void removeRdfs:subClassOf(RealEstate oldRdfs:subClassOf);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
