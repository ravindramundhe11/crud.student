package com.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.Repositoryinterface;

@Service
public class Serviceimpl implements Serviceinterface {

	@Autowired
	Repositoryinterface rsi;
	
	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return rsi.save(s);
	}

	@Override
	public List<Student> getall() {
		// TODO Auto-generated method stub
		List<Student> g=(List<Student>) rsi.findAll();
		return g;
	}

	@Override
	public Student update(Student s, int sid) {
		// TODO Auto-generated method stub
		Optional<Student> t=rsi.findById(sid);
		Student g=rsi.save(s);
		return g;
	}

	@Override
	public void delete(int sid) {
		// TODO Auto-generated method stub
		rsi.deleteById(sid);
		
	}

}
