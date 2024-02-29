package com.example.clas11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clas11.model.Student;
import com.example.clas11.repository.StudentRepository;

@Service
public class SudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student post( Student student)
    {
        return studentRepository.save(student);
    }
    
}
