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
 * Source Class: Library <br>
 * @version generated on Thu Jun 21 13:30:55 JST 2018 by nurulfirdaus
 */

public interface Library extends POIs {

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
