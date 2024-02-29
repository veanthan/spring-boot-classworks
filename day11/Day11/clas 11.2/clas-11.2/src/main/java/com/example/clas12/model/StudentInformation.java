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
public class StudentInformation {
    @Id
    private int id;
    private String name;
    private String Branch;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Student student;
    
}
