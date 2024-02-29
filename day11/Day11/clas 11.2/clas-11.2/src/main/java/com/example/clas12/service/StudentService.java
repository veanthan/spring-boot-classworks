package com.example.clas12.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clas12.model.Student;
import com.example.clas12.model.StudentInformation;
import com.example.clas12.repository.StudentInformationRepo;
import com.example.clas12.repository.StudentRepo;
@Service
public  class StudentService{
    @Autowired
    private StudentRepo studentRepo;
    public Student post(Student student)
    {
       return studentRepo.save(student);
    }
    @Autowired
    private StudentInformationRepo sturepo;
    public StudentInformation post(StudentInformation studentInfom)
    {
        return sturepo.save(studentInfom);
    }
}