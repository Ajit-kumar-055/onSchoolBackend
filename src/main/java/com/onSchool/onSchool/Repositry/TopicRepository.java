package com.onSchool.onSchool.Repositry;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.onSchool.onSchool.Entity.TopicEntity;

@Repository
public interface TopicRepository extends MongoRepository<TopicEntity, String> {
	Optional<TopicEntity> findByTopicId(String topicId);
}
