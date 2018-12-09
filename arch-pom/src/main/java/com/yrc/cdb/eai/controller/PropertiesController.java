package com.yrc.cdb.eai.controller;



import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.yrc.cdb.eai.repository.PropertiesRepo;
import com.yrc.cdb.eai.service.PropertyService;

@RestController
public class PropertiesController {
	@Autowired
	PropertyService propertiesService;
	
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}
	
	
	@RequestMapping("/count")
	public int getCount(){
		return propertiesService.findCount();
	}


}
