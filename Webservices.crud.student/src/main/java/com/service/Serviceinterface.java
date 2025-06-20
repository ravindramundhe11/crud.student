package com.service;

import java.util.List;

import com.model.Student;

public interface Serviceinterface {
	
	public Student save(Student s);
	
	public List<Student> getall();
	
	public Student update(Student s,int sid);
	
	public void delete(int sid);
	
	
	
	

}
