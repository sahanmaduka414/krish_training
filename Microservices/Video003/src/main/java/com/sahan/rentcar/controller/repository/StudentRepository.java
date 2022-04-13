package com.sahan.rentcar.controller.repository;

import org.springframework.data.repository.Repository;

import com.sahan.rentcar.model.Student;

public interface StudentRepository extends Repository<Student,Integer>{
	Student save(Student student);

}
