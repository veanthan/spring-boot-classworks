package com.example.clas11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.clas11.model.Student;

import com.example.clas11.service.SudentService;


@RestController
public class StudentController{
    @Autowired
 private SudentService studentService;

@PostMapping("/medicine")

    public Student post(@RequestBody Student student)
    {
        return studentService.post(student);
    }
}

    

