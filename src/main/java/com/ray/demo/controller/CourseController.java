package com.ray.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ray.demo.entity.Course;
import com.ray.demo.service.CourseService;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/Courseget")
    public List<Course> getAllCourses() {
        return courseService.getAllCourse();
    }

    @PostMapping("/Coursesave")
    public Course createCourse(@RequestBody Course course) {
    	return courseService.saveCourse(course);
    }

    @PutMapping("/UpdateByCourse/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return courseService.updateCourse(id,course); 
    }

    @DeleteMapping("/DeleteByCourse/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourseById(id);
    }
}

