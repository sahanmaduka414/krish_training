package com.sahan.rentcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahan.rentcar.controller.repository.StudentRepository;
import com.sahan.rentcar.model.Student;

@Service
public class StudentServiceimpl implements StudentService{

	@Autowired
    StudentRepository studentRepository;

    public Student save(Student student) {

        return studentRepository.save(student);
    }


}
