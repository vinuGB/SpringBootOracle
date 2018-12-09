package com.yrc.cdb.eai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yrc.cdb.eai.model.PropertiesModel;


public interface PropertiesRepo extends JpaRepository<PropertiesModel, String>{
	
	//List<PropertiesModel> findAll();

}
