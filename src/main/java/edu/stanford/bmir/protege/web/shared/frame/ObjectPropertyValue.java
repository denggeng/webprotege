package edu.stanford.bmir.protege.web.shared.frame;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 21/11/2012
 */
public abstract class ObjectPropertyValue extends PropertyValue implements ClassFramePropertyValue {


    protected ObjectPropertyValue() {
    }

    public ObjectPropertyValue(OWLObjectProperty property, OWLNamedIndividual value, PropertyValueState propertyValueState) {
        super(property, value, propertyValueState);
    }

    protected ObjectPropertyValue(OWLEntity property, OWLClass value, PropertyValueState propertyValueState) {
        super(property, value, propertyValueState);
    }

    @Override
    final public OWLObjectProperty getProperty() {
        return (OWLObjectProperty) super.getProperty();
    }
}
