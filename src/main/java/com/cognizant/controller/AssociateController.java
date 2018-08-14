package com.cognizant.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cognizant.model.Associate;
import com.cognizant.model.AssociateSkills;
import com.cognizant.service.AssociateService;
import com.cognizant.service.AssociateSkillsService;

@RestController
@RequestMapping("/associate")
@CrossOrigin(origins = "http://localhost:4200")
public class AssociateController {
	
	@Autowired
	private AssociateService associateService;
	
	@Autowired
	private AssociateSkillsService associateSkillsService;
	
	private static String UPLOADED_FOLDER = "C://images//";
	
	
	@RequestMapping(value = "/getAllAssociates", method = RequestMethod.GET)
	public List<Associate> getAllAssociates() {
		return associateService.getAllAssociates();
	}
	
	@RequestMapping(value = "/addAssociate", method = RequestMethod.POST)
	public Associate addAssociate(@RequestBody Associate associate, @RequestBody List<AssociateSkills> listOfSkills) {
		return associateService.addAssociate(associate);
	}
	
	@RequestMapping(value = "/deleteAssociate", method = RequestMethod.POST)
	public void deleteAssociate(@RequestBody Associate associate) {
		associateService.deleteAssociate(associate);
	}
	
	@RequestMapping(value = "/addAssociateSkills", method = RequestMethod.POST)
	public List<AssociateSkills> addAssociateSkills(@RequestBody List<AssociateSkills> listOfSkills) {
		return associateSkillsService.addAssociateSkills(listOfSkills);
	}
	
	@RequestMapping(value = "/deleteAssociateSkills", method = RequestMethod.POST)
	public void deleteAssociateSkills(@RequestBody List<AssociateSkills> listOfSkills) {
		associateSkillsService.deleteAssociateSkills(listOfSkills);
	}
	
	@RequestMapping(value = "/getAssociateSkills", method = RequestMethod.GET)
	public List<AssociateSkills> addAssociateSkills(@RequestParam long ID) {
		return associateSkillsService.getAllAssociateSkills(ID);
	}
	
	@RequestMapping(value = "/getAssociateByID", method = RequestMethod.GET)
	public Associate getAssociateByID(@RequestParam("ID") long ID) {
		return associateService.getAssociateByID(ID);
	}
	
	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	public boolean uploadImage(@RequestParam("ID") long ID, @RequestBody MultipartFile image) {
		 byte[] bytes;
		try {
			bytes = image.getBytes();
		
         Path path = Paths.get(UPLOADED_FOLDER + image.getOriginalFilename());
         Files.write(path, bytes);
         return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@RequestMapping(value = "/downloadImage", method = RequestMethod.GET)
	public Associate downloadImage(@RequestParam("ID") long ID) {
		return associateService.getAssociateByID(ID);
	}

}
