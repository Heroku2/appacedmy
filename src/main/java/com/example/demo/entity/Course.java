package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_COURSE")
	private Long id;
	@Size(min=4, max=45, message="nombre debe tener mas de 4 letras y menos de 45")
	private String name;
	@Size(min=4, max=45, message="nombre debe tener mas de 4 letras y menos de 45")
	private String themes;

	@ManyToOne
	@JoinColumn(name = "idteacher")
	private Teacher teacher;
	
	public Course() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", themes=" + themes + ", teacher=" + teacher + "]";
	}
	
}
