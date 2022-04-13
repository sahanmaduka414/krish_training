package com.sahan.rentcar.controller.repository;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.sahan.rentcar.model.Student;

public interface StudentRepository extends Repository<Student,Integer>{
	Student save(Student student);

	Optional<Student> findById(int id);

}
