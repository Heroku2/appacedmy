package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService implements ICourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Iterable<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public void save(Course course) {
		courseRepository.save(course);
	}

	@Override
	public Course findOne(Long id) {
		return courseRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		courseRepository.delete(id);
	}

	@Override
	public Iterable<Course> findByCourseTexto(String name) {
		return courseRepository.findByCourseTexto(name);
	}

}
