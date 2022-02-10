package com.example.demo.courses.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.courses.bean.Course;
import com.example.demo.courses.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository repository;
	
	@GetMapping("/courses")
	public List<Course> GetAllCourses(){
		return repository.findAll();
		//return Arrays.asList(new Course(1,"sankha","Learn microservices"),new Course(2,"sankha","Fullstack"));
	}
	
	@GetMapping("/courses/{id}")
	public Course GetCourseDetails(@PathVariable long id){
		Optional<Course> course = repository.findById(id);
		if(course.isEmpty()) {
			throw new RuntimeException("course not found with id "+id);
		}
		return course.get();
		//return new Course(1,"sankha","Learn microservices 1");
	}

}
