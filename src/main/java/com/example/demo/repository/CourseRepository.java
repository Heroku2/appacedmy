package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

//	@Query("select  c from Course c where c.name like ?1% or c.teacher.name=?1%")
	@Query("select  c from Course c where c.name like ?1% or c.teacher.name like ?1%")
	
//	List<Course> findByCourseTexto(String name);
	Iterable<Course> findByCourseTexto(String name);
	
}
