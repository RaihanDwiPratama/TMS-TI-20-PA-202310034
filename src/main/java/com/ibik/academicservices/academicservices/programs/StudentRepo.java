package com.ibik.academicservices.academicservices.programs;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository <Student, Integer> {
    
}