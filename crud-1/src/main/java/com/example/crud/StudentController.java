package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/students")


public class StudentController {
	@Autowired
	private StudentRepository studentrepository;
	
	@GetMapping
	public List<Student> getAllStudent() {
		return studentrepository.findAll() ;
		
	}
	
	@PostMapping("/add")
	public Student createStudent(@RequestBody Student student) {
		
		return studentrepository.save(student);
	}
	
}
