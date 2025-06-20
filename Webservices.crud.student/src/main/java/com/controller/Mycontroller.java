package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getall")
	public List<Student> getalldata()
	{
		List<Student> t=ssi.getall();
		return t;
	}
	
	@PutMapping("/update/{sid}")
	public Student updatedata(@RequestBody Student s,@PathVariable int sid)
	{
		Student s1=ssi.update(s, sid);
		return s1;
	}

	@DeleteMapping("/delete/{sid}")
	public String deletedata(@PathVariable int sid)
	{
		ssi.delete(sid);
		
		return "data deleted by id";
	}
}
