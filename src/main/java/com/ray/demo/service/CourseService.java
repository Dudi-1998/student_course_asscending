package com.ray.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.demo.entity.Course;
import com.ray.demo.repository.CourseRepository;

@Service
public class CourseService {
	
    @Autowired
    private CourseRepository courseRepository;
    
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> getAllCourse() {
		return courseRepository.findAll();
	}

	public Course updateCourse(Long id, Course course) {
		Optional<Course> findById = courseRepository.findById(id);
		if(findById.isPresent()) {
			Course savedCourse = findById.get();
			savedCourse.setCourseName(course.getCourseName());
			savedCourse.setCreditHours(course.getCreditHours());
			return courseRepository.save(savedCourse);
            
		}
		return null;
	}

	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);
	}

}
