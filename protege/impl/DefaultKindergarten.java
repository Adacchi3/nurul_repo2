package servlet.impl;

import servlet.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultKindergarten <br>
 * @version generated on Thu Jun 21 13:30:55 JST 2018 by nurulfirdaus
 */
public class DefaultKindergarten extends WrappedIndividualImpl implements Kindergarten {

    public DefaultKindergarten(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.w3.org/2000/01/rdf-schema#subClassOf
     */
     
    public Collection<? extends RealEstate> getRdfs:subClassOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_RDFS:SUBCLASSOF,
                                               DefaultRealEstate.class);
    }

    public boolean hasRdfs:subClassOf() {
	   return !getRdfs:subClassOf().isEmpty();
    }

    public void addRdfs:subClassOf(RealEstate newRdfs:subClassOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_RDFS:SUBCLASSOF,
                                       newRdfs:subClassOf);
    }

    public void removeRdfs:subClassOf(RealEstate oldRdfs:subClassOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_RDFS:SUBCLASSOF,
                                          oldRdfs:subClassOf);
    }


}
