package com.example.clas11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clas11.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    
    
}
