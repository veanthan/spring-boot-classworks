package com.example.clas11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.clas11.model.StudentInformation;
@Repository

public interface StudentInformationRepository extends JpaRepository<StudentInformation,Integer>{

}
