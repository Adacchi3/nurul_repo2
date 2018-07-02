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
 * Source Class: DefaultTransaction <br>
 * @version generated on Thu Jun 21 13:30:55 JST 2018 by nurulfirdaus
 */
public class DefaultTransaction extends WrappedIndividualImpl implements Transaction {

    public DefaultTransaction(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasCharacteristic
     */
     
    public Collection<? extends WrappedIndividual> getHasCharacteristic() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASCHARACTERISTIC,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasCharacteristic() {
	   return !getHasCharacteristic().isEmpty();
    }

    public void addHasCharacteristic(WrappedIndividual newHasCharacteristic) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASCHARACTERISTIC,
                                       newHasCharacteristic);
    }

    public void removeHasCharacteristic(WrappedIndividual oldHasCharacteristic) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASCHARACTERISTIC,
                                          oldHasCharacteristic);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasCityPlanningAct
     */
     
    public Collection<? extends LandUseZones> getHasCityPlanningAct() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASCITYPLANNINGACT,
                                               DefaultLandUseZones.class);
    }

    public boolean hasHasCityPlanningAct() {
	   return !getHasCityPlanningAct().isEmpty();
    }

    public void addHasCityPlanningAct(LandUseZones newHasCityPlanningAct) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASCITYPLANNINGACT,
                                       newHasCityPlanningAct);
    }

    public void removeHasCityPlanningAct(LandUseZones oldHasCityPlanningAct) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASCITYPLANNINGACT,
                                          oldHasCityPlanningAct);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasRegion
     */
     
    public Collection<? extends WrappedIndividual> getHasRegion() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASREGION,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasRegion() {
	   return !getHasRegion().isEmpty();
    }

    public void addHasRegion(WrappedIndividual newHasRegion) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASREGION,
                                       newHasRegion);
    }

    public void removeHasRegion(WrappedIndividual oldHasRegion) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASREGION,
                                          oldHasRegion);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/nurulfirdaus/ontologies/2017/11/realestate#hasType
     */
     
    public Collection<? extends WrappedIndividual> getHasType() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASTYPE,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasType() {
	   return !getHasType().isEmpty();
    }

    public void addHasType(WrappedIndividual newHasType) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASTYPE,
                                       newHasType);
    }

    public void removeHasType(WrappedIndividual oldHasType) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASTYPE,
                                          oldHasType);
    }


}
