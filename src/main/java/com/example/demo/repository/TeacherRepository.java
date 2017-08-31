package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {

	Teacher findByName(String name);
	
	Iterable<Teacher> findByNameContaining(String name);
	
}
