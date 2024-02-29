package com.example.clas11.model;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AutoConfiguration
public class StudentInformation {
    @Id
    private int id;
    private String name;
    private String place;
    private String address;
    
}
