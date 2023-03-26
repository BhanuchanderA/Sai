package com.jsp.service;

import java.util.List;

import com.jsp.dao.Studentdao;
import com.jsp.dto.Student;

public class StudentService {
	Studentdao dao=new Studentdao();
	
	public Student saveStudent(Student s) {
		return dao.saveStudent(s);
		}
	
	public Student getStudent(int id) {
		return  dao.getStudent(id);
	
	}
	public List<Student> getAllStudent(){
		return dao.getAllStudent();
	}
	
	public Student deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
	
	public Student updateStudent(Student s) {
		return dao.updateStudent(s);
	}

}
