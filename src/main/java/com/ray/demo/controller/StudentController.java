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

import com.ray.demo.entity.Student;
import com.ray.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/Studentget")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }

    @PostMapping("/Studentsame")
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/UpdatedById/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.updatedStudent(id,student); 
    }

    @DeleteMapping("/DeleteById/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }
}

