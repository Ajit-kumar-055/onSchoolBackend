package com.onSchool.onSchool.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.onSchool.onSchool.Entity.ChapterEntity;

import java.util.List;

@Repository
public interface ChapterRepository extends MongoRepository<ChapterEntity, String> {
    List<ChapterEntity> findByClassId(String classId);
    
}
