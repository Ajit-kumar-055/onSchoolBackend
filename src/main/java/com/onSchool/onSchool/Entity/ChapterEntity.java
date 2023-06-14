package com.onSchool.onSchool.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chapters")
public class ChapterEntity {
    @Id
    private String id;
    private String classId;
    private String name;
    
 // Getters and Setters
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
}
