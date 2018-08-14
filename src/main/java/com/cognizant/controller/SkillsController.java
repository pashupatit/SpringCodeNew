package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Skills;
import com.cognizant.service.SkillsService;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
	
	@Autowired
	private SkillsService service;
	
	@RequestMapping(value = "/getAllSkills" , method=RequestMethod.GET)
	public List<Skills> getAllSkills() {
		return service.getAllSkills();
		
	}
	
	@RequestMapping(value = "/addSkills", method=RequestMethod.POST)
	public Skills addSkills(@RequestBody Skills skills) {
		System.out.println(skills.toString());
		return service.addSkills(skills);
	}
	
	@RequestMapping(value = "/deleteSkills", method=RequestMethod.POST)
	public void deleteSkills(@RequestBody Skills skills) {
		service.deleteSkills(skills);
	}
}
