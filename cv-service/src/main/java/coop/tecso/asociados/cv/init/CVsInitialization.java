package coop.tecso.asociados.cv.init;

import org.springframework.stereotype.Component;

/**
 * This class initializes the example database
 * 
 * @author fgarcia
 */

@Component
public class CVsInitialization {

//	@Resource(name = "curriculumService")
//	private CurriculumService curriculumService;
//
//	/*
//	 * Crea algunos cvs  
//	 */
//	@PostConstruct
//	public void init() {
//		String json = "{\"name\":\"John Smith\",\"title\":\"Software Developer\",\"summary\":\"Desarrollador semi senior con 5 años de experiencia en aplicaciones J2EE. \",\"experienceList\":[{\"company\":\"Tecso\",\"title\":\"SSr Developer\",\"fromMonth\":8,\"fromYear\":2011,\"toMonth\":3,\"toYear\":2013,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitBank\"},{\"company\":\"IBM\",\"title\":\"Junior Developer\",\"fromMonth\":1,\"fromYear\":2010,\"toMonth\":8,\"toYear\":2011,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitiBank\"}]}";
//		createCV("john_smith","json");
//			
//	}
//
//	 
//	private void createCV(String username, String json) {
//
//		Curriculum  cv = curriculumService.findUnique(CurriculumFinderFilterCallback.USERNAME, username);
//		
//		if (cv == null) {
//			cv = new Curriculum();
//			cv.setUsername(username);
//			cv.setJson(json);
//			
//			curriculumService.save(cv);
//
//		}
//
//	}

}



