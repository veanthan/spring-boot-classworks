package com.example.practice_exercise_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.practice_exercise_1.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
     
     @Autowired
     public AppConfig a;
     @GetMapping("/path")
     public String getMethodName() {
         return "Student Name "+a.getStudentName() +" Student Department "+a.getStudentDepartment();
     }
     
}
