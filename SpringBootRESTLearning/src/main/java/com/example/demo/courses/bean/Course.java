package com.example.demo.courses.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
    private long id;
    private String name;
    //@Column(name="course_name")
    private String title;
    
    public Course() {
    	
    }
	public Course(long id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	
	public long getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	

	public String getTitle() {
		return title;
	}

	

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", title=" + title + "]";
	}
	

}
