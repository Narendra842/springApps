package com.test.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Student;
import com.test.repository.StudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepo repo;
	
	
	@Override
	public Student saveStudentDetails(Student std) {
		
		return repo.save(std);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student= repo.findAll();
		return student;
	}

	@Override
	public Student updateStudent(Student student, Integer sid) {
		
		Student std= repo.findById(sid).get();
		 
		if(Objects.nonNull(student.getSname()) && ! " ".equalsIgnoreCase(student.getSname()))
		{
		   std.setSname(student.getSname());	
		}
		
		if(Objects.nonNull(student.getSaddress()) && !" ".equalsIgnoreCase(student.getSaddress()))
		{
			std.setSaddress(student.getSaddress());
		}
		if(Objects.nonNull(student.getScity()) && !" ".equalsIgnoreCase(student.getScity()))
		{
			std.setScity(student.getScity());
		}
		if(Objects.nonNull(student.getScourse()) && !" ".equalsIgnoreCase(student.getScourse()))
		{
			std.setScourse(student.getScourse());
		}
		
	  return std;	
	}

	@Override
	public void deleteStudentById(Integer sid) {
		
		repo.deleteById(sid);

	}

}
