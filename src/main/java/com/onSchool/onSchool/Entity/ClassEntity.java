package com.onSchool.onSchool.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "classes")
public class ClassEntity {
    @Id
    private String id;
    private String name;
    
    
 // Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
}
