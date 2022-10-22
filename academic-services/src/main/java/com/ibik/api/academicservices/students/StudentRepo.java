package com.ibik.api.academicservices.students;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository <Student, Integer> {
    
}