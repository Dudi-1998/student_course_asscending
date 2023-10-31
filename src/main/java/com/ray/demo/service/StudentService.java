package com.ray.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ray.demo.entity.Student;
import com.ray.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		Sort sort = Sort.by(Sort.Direction.ASC,"birthDay");
	return studentRepository.findAll(sort);
	}

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updatedStudent(Integer id, Student student) {
		Optional<Student> findById=studentRepository.findById(id);
		if(findById.isPresent()) {
			Student savedStudent = findById.get();
			savedStudent.setStudentName(student.getStudentName());
			savedStudent.setBirthDay(student.getBirthDay());
			return studentRepository.save(savedStudent);
            
		}
		return null;
	}

	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}
}
