package com.example.clas12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.clas12.model.Student;
import com.example.clas12.model.StudentInformation;
import com.example.clas12.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student post(@RequestBody Student student)
    {
        return studentService.post(student);
    }
    @PostMapping("/student/inform")
    public StudentInformation post(@RequestBody StudentInformation studentInfom)
    {
        return studentService.post(studentInfom);
    }

    
}
