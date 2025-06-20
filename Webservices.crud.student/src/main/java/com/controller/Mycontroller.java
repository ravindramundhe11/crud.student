package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.Serviceinterface;

@RestController
public class Mycontroller {
	
	@Autowired
	Serviceinterface ssi;

	@PostMapping("/save")
	public Student savedata(@RequestBody Student s)
	{
	return	ssi.save(s);

	}
	
	

}
