package com.example.demo.service;

import com.example.demo.entity.Course;

public interface ICourseService {

	public Iterable<Course> findAll();

	public void save(Course course);
	
	public Course findOne(Long id);
	
	public void delete(Long id);
	
	Iterable<Course> findByCourseTexto(String name);
}
