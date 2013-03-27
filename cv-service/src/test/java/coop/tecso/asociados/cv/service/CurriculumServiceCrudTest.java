package coop.tecso.asociados.cv.service;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Assert;

import coop.tecso.core.crud.test.AbstractCrudTest;
import coop.tecso.asociados.cv.service.CurriculumService;
import coop.tecso.asociados.cv.model.*;

/**
 * Service layer tests for CurriculumService
 */
public class CurriculumServiceCrudTest extends AbstractCrudTest<Curriculum> {

    @Resource(name = "curriculumService")
    private CurriculumService curriculumService;

    @Override
    protected Curriculum createPersistentObject() {
    	Curriculum po = new Curriculum();

    //	String json = "{\"name\":\"John Smith\",\"title\":\"Software Developer\",\"summary\":\"Desarrollador semi senior con 5 años de experiencia en aplicaciones J2EE. \",\"experienceList\":[{\"company\":\"Tecso\",\"title\":\"SSr Developer\",\"fromMonth\":8,\"fromYear\":2011,\"toMonth\":3,\"toYear\":2013,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitBank\"},{\"company\":\"IBM\",\"title\":\"Junior Developer\",\"fromMonth\":1,\"fromYear\":2010,\"toMonth\":8,\"toYear\":2011,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitiBank\"}]}";
    	String json =  "1234567890";

    	po.setUsername("username");
        po.setJson(json);
          
        return po;
    }

    @Override
    protected void savePersistentObject(Curriculum po) {
        curriculumService.save(po);
    }

    @Override
    protected Curriculum getById(Long id) {
        return curriculumService.findById(id);
    }

    @Override
    protected void modifyPersistentObject(Curriculum po) {
    	
    	//TODO Modify the Persisten object attributes
          po.setUsername("Modified_username");
            po.setJson("Modified_json");
  
    }

    @Override
    protected void comparePersistentObject(Curriculum po, Curriculum po2) {
        assertEquals(po.getUsername(), po2.getUsername());
        assertEquals(po.getJson(), po2.getJson());
    }

    @Override
    protected void deletePersistentObject(Curriculum po) {
        curriculumService.delete(po);
    }

}
