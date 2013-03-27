package coop.tecso.asociados.cv.web.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//
//import coop.tecso.asociados.cv.callback.CurriculumFinderFilterCallback;
//import coop.tecso.asociados.cv.model.Curriculum;
//import coop.tecso.asociados.cv.service.CurriculumService;

@Controller
@RequestMapping("/cv")
public class CurriculumRestController {

	private final Log log = LogFactory.getLog(getClass());
	
//	@Resource(name = "curriculumService")
//	private CurriculumService curriculumService;

	Map<String, String>    dbMock = new HashMap<String, String>();
	
	
	@PostConstruct
	public void init(){
		 String json = "{\"name\":\"John Smith\",\"title\":\"Software Developer\",\"summary\":\"Desarrollador semi senior con 5 años de experiencia en aplicaciones J2EE. \",\"experienceList\":[{\"company\":\"Tecso\",\"title\":\"SSr Developer\",\"fromMonth\":8,\"fromYear\":2011,\"toMonth\":3,\"toYear\":2013,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitBank\"},{\"company\":\"IBM\",\"title\":\"Junior Developer\",\"fromMonth\":1,\"fromYear\":2010,\"toMonth\":8,\"toYear\":2011,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitiBank\"}]}";
		 dbMock.put("john.smith", json);
		 
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST )//, headers = "Accept=application/json")
	@ResponseBody
	public String post(@RequestParam("username") String username,
			@RequestParam("json") String json) {

		log.info("/save/" +username);

//		Curriculum cv = curriculumService.findUnique(
//				CurriculumFinderFilterCallback.USERNAME, username);
//		if (cv == null) {
//			cv = new Curriculum();
//			cv.setUsername(username);
//		}
//		cv.setJson(json);
//
//		curriculumService.save(cv);
		return "ok";
	}

	 @RequestMapping(value = "/getUsers", method = RequestMethod.GET , headers = "Accept=application/json")
	    public @ResponseBody List<String> getUsers() {
	        		
			List<String>  users = new ArrayList<String>(dbMock.keySet());
	        		return users;
	    }

	
	 @RequestMapping(value = "/getJSON", method = RequestMethod.GET , headers = "Accept=application/json")
	    public @ResponseBody String getJSON() {
			String json = "{\"name\":\"John Smith\",\"title\":\"Software Developer\",\"summary\":\"Desarrollador semi senior con 5 años de experiencia en aplicaciones J2EE. \",\"experienceList\":[{\"company\":\"Tecso\",\"title\":\"SSr Developer\",\"fromMonth\":8,\"fromYear\":2011,\"toMonth\":3,\"toYear\":2013,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitBank\"},{\"company\":\"IBM\",\"title\":\"Junior Developer\",\"fromMonth\":1,\"fromYear\":2010,\"toMonth\":8,\"toYear\":2011,\"description\":\"Participe en el desarrollo de aplicaciones para el cliente CitiBank\"}]}";
	        return json;
	    }
	
	@RequestMapping(value = "/get", method = RequestMethod.GET , headers = "Accept=application/json")
	@ResponseBody
	public String get(@PathVariable("username") String username) {

//			Curriculum	cv  = curriculumService.findUnique(
//				CurriculumFinderFilterCallback.USERNAME, username);
//		return cv.getJson();
		
		log.info("/get/" +username);
		
		String json = dbMock.get(username);
		
		return json;
				
	}
 

}
