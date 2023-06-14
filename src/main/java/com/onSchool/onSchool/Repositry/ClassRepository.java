package com.onSchool.onSchool.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.onSchool.onSchool.Entity.ClassEntity;

@Repository
public interface ClassRepository extends MongoRepository<ClassEntity, String> {
    
}
