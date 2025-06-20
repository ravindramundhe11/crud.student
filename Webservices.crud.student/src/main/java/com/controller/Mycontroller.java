package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.service.Serviceinterface;

@RestController
public class Mycontroller {
	
	@Autowired
	Serviceinterface ssi;

	@PostMapping("/save")
	public Student savedata(@RequestBody Student s)
	{
		ssi.save(s);

	}
	
	

}
