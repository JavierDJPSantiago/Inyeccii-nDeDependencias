package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

// aqui implementaremos la logica del studentservice, aqui definiremos el mecanismo de sus metodos
@Service
public class StudentServiceImp implements StudentService{

	//haremos una lista de estudiantes, lista porque puede crecer
	//aqui agregaremos a los estudiantes
	private final List <Student> studentList = new ArrayList<Student>();
	
	@Override
	public void add(Student student) {
		studentList.add(student);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(String id) {
		return studentList.get(Integer.parseInt(id));
	}

}
