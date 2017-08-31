package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Course;
import com.example.demo.entity.Teacher;
import com.example.demo.service.ICourseService;
import com.example.demo.service.ITeacherService;

@SpringBootApplication
public class AppacedmyApplication {

	private static final Logger log = Logger.getLogger(AppacedmyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppacedmyApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ITeacherService it, ICourseService ic) {
		return (args) -> {
//			Teacher t1 = new Teacher();
//			t1.setId(1L);
//			t1.setName("Pepe Pérez");
//			Teacher t2 = new Teacher();
//			t2.setId(2L);
//			t2.setName("Paco Paez");
//			it.save(t1);
//			it.save(t2);
			
			log.info("Buscar Teachers con findAll");
			for(Teacher t:it.findAll()) {
				log.info(t.toString());
			}
			
//			Course c1 = new Course();
//			c1.setId(1L);
//			c1.setName("Desarrollo Web");
//			c1.setThemes("API REST");
//			c1.setTeacher(t1);
//
//			Course c2 = new Course();
//			c2.setId(2L);
//			c2.setName("Full Stack JavaScript");
//			c2.setThemes("JavaScript");
//			c2.setTeacher(t2);
//
//			ic.save(c1);
//			ic.save(c2);
			
			log.info("Buscar Courses con findAll");
			for(Course c:ic.findAll()) {
				log.info(c.toString());
			}
			
			
		};
	}
}
