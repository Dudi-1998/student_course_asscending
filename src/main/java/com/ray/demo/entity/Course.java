package com.ray.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	     
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long Id;
	    private String courseName;
	    private int creditHours;
	    
	    public Course(Long id, String courseName, int creditHours) {
			super();
			Id = id;
			this.courseName = courseName;
			this.creditHours = creditHours;
		}
		public Course() {
			super();
		}
		public Long getId() {
	        return Id;
	   	}
	   	public void setId(Long id) {
	   		Id = id;
	   	}
	   	public String getCourseName() {
	   		return courseName;
	   	}
	   	public void setCourseName(String courseName) {
	   		this.courseName = courseName;
	   	}
	   	public int getCreditHours() {
	   		return creditHours;
	   	}
	   	public void setCreditHours(int creditHours) {
	   		this.creditHours = creditHours;
	   	}
	   	    
}
