package com.example.demo.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
