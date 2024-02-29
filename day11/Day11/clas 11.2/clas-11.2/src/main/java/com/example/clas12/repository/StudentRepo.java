package com.example.clas12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clas12.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> 
{
    
}
