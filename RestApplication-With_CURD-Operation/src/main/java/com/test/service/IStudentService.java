package com.test.service;

import java.util.List;

import com.test.entity.Student;

public interface IStudentService {

	  Student saveStudentDetails(Student std);
	  
	  List<Student> getAllStudent();
	  
	  Student updateStudent(Student student, Integer sid);
	  
	  void deleteStudentById(Integer sid);
	  
	  
}
