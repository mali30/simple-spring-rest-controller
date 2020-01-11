package com.mohamedali.springdemo.rest;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedali.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public ArrayList<Student> getStudents(){
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Tim" , "T"));
		studentList.add(new Student("Bob" , "B"));
		studentList.add(new Student("Bill" , "B"));
		
		return studentList;
		
	}

}
