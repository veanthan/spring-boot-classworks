package com.example.clas11.model;

import org.springframework.boot.autoconfigure.AutoConfiguration;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AutoConfiguration
public class Student {
    @Id
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private StudentInformation studentInformation;

}
