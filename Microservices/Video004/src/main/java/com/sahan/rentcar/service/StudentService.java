package com.sahan.rentcar.service;

import com.sahan.rentcar.model.Student;

public interface StudentService {
	
	Student save(Student student);

	Student fetchStudentById(int id);

	
}
