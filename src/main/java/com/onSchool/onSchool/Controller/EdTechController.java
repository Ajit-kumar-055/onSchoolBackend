package com.onSchool.onSchool.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.onSchool.onSchool.Service.EdTechService;
import com.onSchool.onSchool.Entity.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EdTechController {
    @Autowired
    private EdTechService edTechService;

    @GetMapping("/classes")
    public List<ClassEntity> getAllClasses() {
        return edTechService.getAllClasses();
    }

    @GetMapping("/chapters/{classId}")
    public List<ChapterEntity> getChaptersByClassId(@PathVariable String classId) {
        return edTechService.getChaptersByClassId(classId);
    }

    @GetMapping("/topics/{topicId}")
    public ResponseEntity<TopicEntity> getTopicById(@PathVariable String topicId) {
    	TopicEntity topicDetails = edTechService.getTopicByTopicId(topicId);
        return new ResponseEntity<TopicEntity>(topicDetails, HttpStatus.OK);
    }
    
    @PostMapping("/classes")
    public ClassEntity createClass(@RequestBody ClassEntity classEntity) {
        return edTechService.createClass(classEntity);
    }

    @PostMapping("/chapters")
    public ChapterEntity createChapter(@RequestBody ChapterEntity chapterEntity) {
        return edTechService.createChapter(chapterEntity);
    }

    @PostMapping("/topics")
    public TopicEntity createTopic(@RequestBody TopicEntity topicEntity) {
        return edTechService.createTopic(topicEntity);
    }

}
