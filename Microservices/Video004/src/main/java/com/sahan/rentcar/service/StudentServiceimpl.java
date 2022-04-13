package com.sahan.rentcar.service;

import java.util.Optional;

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
    
    
    public Student fetchStudentById(int id){


        Optional<Student> student=    studentRepository.findById( id);
        if(student.isPresent()){
            return student.get();
        }
        return null;

       }

}
