package coop.tecso.asociados.cv.web.crud.curriculum;

import static coop.tecso.asociados.cv.callback.CurriculumFinderFilterCallback.*;
import static coop.tecso.core.web.vaadin.searchresult.SearchCriteriaFieldFactory.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import coop.tecso.asociados.cv.service.CurriculumService;
import coop.tecso.asociados.cv.model.*;
import coop.tecso.asociados.cv.web.menu.MenuApp;

import com.vaadin.data.Item;

import coop.tecso.core.persistence.model.PersistentObject;
import coop.tecso.core.security.Roles;
import coop.tecso.core.service.Service;
import coop.tecso.core.web.vaadin.crud.AbstractCRUDListWindowComponent;
import coop.tecso.core.web.vaadin.crud.CRUDFormFieldFactory;
import coop.tecso.core.web.vaadin.crud.SearchCriteriaFieldData;
import coop.tecso.core.web.vaadin.menu.support.MenuItemComponent;
import coop.tecso.core.web.vaadin.util.DateHelper;
import coop.tecso.core.web.vaadin.util.EntitiesListHelper;

/**
 * List window component for Curriculum entity
 *
 */
@SuppressWarnings("serial")
@MenuItemComponent(parent=MenuApp.MENU_CRUDS, roles = { Roles.ANY_ROLE })
public class ListCurriculum extends AbstractCRUDListWindowComponent {

    @Resource(name = "curriculumService")
    private CurriculumService curriculumService;

    @Resource(name = "curriculumFormFieldFactory")
    private CurriculumFormFieldFactory curriculumFormFieldFactory;

    @Override
    @SuppressWarnings("rawtypes")
    protected Service getCRUDService() {
        return curriculumService;
    }

    @Override
    protected String getI18nPrefix() {
        return "Curriculum";
    }


    @Override
    protected PersistentObject getNewObject() {
        return new Curriculum();
    }



 

    // //////////////////// ITEMS LIST //////////////////

    @Override
    protected String[] getVisibleColumns() {
        return new String[] {  USERNAME,  JSON,  };
        
    }

    @Override
    protected void setTableItemProperties(PersistentObject e, Item item) {
        Curriculum curriculum = (Curriculum) e;
    
        item.getItemProperty(USERNAME).setValue(curriculum.getUsername());
        item.getItemProperty(JSON).setValue(curriculum.getJson());
    }

 
    // ///////////////////////// SEARCH CRITERIA /////////////

    @Override
    protected List<SearchCriteriaFieldData> createSearchCriteriaFieldData() {

        List<SearchCriteriaFieldData> list = new ArrayList<SearchCriteriaFieldData>();

          list.add(new SearchCriteriaFieldData(createTextField(), USERNAME));
          list.add(new SearchCriteriaFieldData(createTextField(), JSON));
        
      
        return list;
    }

    

    // //////////////////////////// EDIT WINDOW /////////////////////////

    @Override
    protected List<String> getEditWindowVisibleItemProperties() {

        return Arrays.asList(new String[] {  USERNAME,  JSON,  });
    }

    @Override
    protected CRUDFormFieldFactory getFormFieldFactory() {
        return curriculumFormFieldFactory;
    }

}

