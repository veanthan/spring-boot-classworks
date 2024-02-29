package com.example.practice_exercise_1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AppConfig {
     @Value("${app.name}")
     private String studentName;
     @Value("${app.version}")
     private String studentDepartment;
     public AppConfig(String studentName, String studentDepartment) {
          this.studentName = studentName;
          this.studentDepartment = studentDepartment;
     }
     public AppConfig()
     {

     }
     
     public String getStudentName() {
          return studentName;
     }
     public void setStudentName(String studentName) {
          this.studentName = studentName;
     }
     public String getStudentDepartment() {
          return studentDepartment;
     }
     public void setStudentDepartment(String studentDepartment) {
          this.studentDepartment = studentDepartment;
     }

}
