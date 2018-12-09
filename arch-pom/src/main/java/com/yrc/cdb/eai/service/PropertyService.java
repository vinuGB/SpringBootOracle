package com.yrc.cdb.eai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yrc.cdb.eai.repository.PropertiesRepo;
@Service
public class PropertyService {
	
	@Autowired
	PropertiesRepo propertiesRepo;
	
	public int findCount(){
		
		return propertiesRepo.findAll().size();
	}

}
