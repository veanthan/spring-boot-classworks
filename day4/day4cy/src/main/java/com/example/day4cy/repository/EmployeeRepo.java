package com.example.day4cy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4cy.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}
