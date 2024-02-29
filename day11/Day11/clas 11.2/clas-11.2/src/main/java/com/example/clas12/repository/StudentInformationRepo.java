package com.example.clas12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clas12.model.StudentInformation;

public interface StudentInformationRepo extends JpaRepository<StudentInformation,Integer> {

    

    
}
