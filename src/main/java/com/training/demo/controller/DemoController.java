package com.training.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.request.StudentRequest;
import com.training.demo.response.StudentResponse;
import com.training.demo.service.StudentActions;

import lombok.extern.slf4j.Slf4j;

@RestController
//@Controller
@RequestMapping("demo")
@Slf4j
public class DemoController {

	@Autowired
	StudentActions studentActions;

	@GetMapping("message/{input1}")
	public String message(@PathVariable("input1") String input1) {
		System.out.println("Input 1 is :: " + input1);
		return "Welcome to Spring Boot in Demo Controller !... " + input1;
	}

	// @RequestMapping(value = "message1", method = RequestMethod.GET)

	// @RequestMapping("message1")
	// @ResponseBody
	@GetMapping("message2")
	public String message2(@RequestParam String name) {
		return "Demo Conntroller ::  Message 2 :: " + name;
	}

	@GetMapping("get-students")
	public List<StudentResponse> getStudentsList() {
		List<StudentResponse> studentsList = studentActions.getAllStudents();
		return studentsList;
	}

	@PostMapping("create-student")
	public StudentResponse createStudent(@RequestBody StudentRequest studentRequest) {
		StudentResponse studentResponse = studentActions.addStudent(studentRequest);
		return studentResponse;
	}

	@PutMapping("update-student/{id}")
	public StudentResponse updateStudent(@PathVariable("id") Integer id, @RequestBody StudentRequest studentRequest) {
		log.info("*** update student ***");
		log.info("Id :: " + id);
		StudentResponse studentResponse = studentActions.updateStudent(studentRequest, id);
		return studentResponse;
	}

	@DeleteMapping("delete-student/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		studentActions.deleteStudent(id);
		return;
	}

}
