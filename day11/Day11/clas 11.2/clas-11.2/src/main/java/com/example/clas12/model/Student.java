package com.example.clas12.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    private int id;
    private String name;
    @OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
    private StudentInformation studentInformation;


    
    
}
