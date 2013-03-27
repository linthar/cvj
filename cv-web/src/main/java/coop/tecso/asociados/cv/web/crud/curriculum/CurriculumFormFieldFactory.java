package coop.tecso.asociados.cv.web.crud.curriculum;

import static coop.tecso.asociados.cv.callback.CurriculumFinderFilterCallback.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;

import coop.tecso.core.web.vaadin.crud.CRUDFormFieldFactory;
import coop.tecso.core.web.vaadin.field.entities.ManyEntitiesField;

import coop.tecso.asociados.cv.model.*;

/**
 * CurriculumFormFieldFactory for Curriculum edit form
 * 
 */
@Service("curriculumFormFieldFactory")
@SuppressWarnings("serial")
public class CurriculumFormFieldFactory extends CRUDFormFieldFactory {

    @Override
    public Field createFieldByType(Item item, Object propertyId, Component uiContext) {


       return super.createFieldByType(item, propertyId, uiContext);
    }

 
    

}
















