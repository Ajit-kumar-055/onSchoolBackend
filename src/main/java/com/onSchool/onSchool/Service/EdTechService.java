package com.onSchool.onSchool.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onSchool.onSchool.Entity.ChapterEntity;
import com.onSchool.onSchool.Entity.ClassEntity;
import com.onSchool.onSchool.Entity.TopicEntity;
import com.onSchool.onSchool.Repositry.ChapterRepository;
import com.onSchool.onSchool.Repositry.ClassRepository;
import com.onSchool.onSchool.Repositry.TopicRepository;

import java.util.List;

@Service
public class EdTechService {
    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private TopicRepository topicRepository;

    public List<ClassEntity> getAllClasses() {
        return classRepository.findAll();
    }

    public List<ChapterEntity> getChaptersByClassId(String classId) {
        return chapterRepository.findByClassId(classId);
    }

    public TopicEntity getTopicById(String topicId) {
        return topicRepository.findById(topicId).orElse(null);
    }
    
    public ClassEntity createClass(ClassEntity classEntity) {
        return classRepository.save(classEntity);
    }

    public ChapterEntity createChapter(ChapterEntity chapterEntity) {
        return chapterRepository.save(chapterEntity);
    }

    public TopicEntity createTopic(TopicEntity topicEntity) {
        return topicRepository.save(topicEntity);
    }

    public TopicEntity getTopicByTopicId(String topicId) {
        return topicRepository.findByTopicId(topicId).orElse(null);
    }



}
