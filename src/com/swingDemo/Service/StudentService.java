package com.swingDemo.Service;

import java.util.List;

import com.swingDemo.Model.Student;

public interface StudentService {

	public boolean addstudent(Student s);
	
	public List<Student> getAllStudent();
	
	public boolean deletestudent(int id);
	
	public boolean updatestudent(Student s);
	
	public Student getById(int id);
}
