package com.training.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.request.StudentRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
//@Controller
@RequestMapping("demo")
@Slf4j
public class DemoController {

	List<StudentRequest> studentList = new ArrayList<>();

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
	public List<StudentRequest> getStudentsList() {
		log.info("Students list :: {}", studentList);
		return studentList;
	}

	@PostMapping("create-student")
	public StudentRequest createStudent(@RequestBody StudentRequest studentRequest) {
		log.info(studentRequest.toString());
		studentList.add(studentRequest);
		return studentRequest;
	}

	@PutMapping("update-student/{id}")
	public StudentRequest updateStudent(@PathVariable("id") Integer id, @RequestBody StudentRequest studentRequest) {
		log.info("*** update student ***");
		log.info("Id :: " + id);
		for (StudentRequest studentData : studentList) {
			if (studentData.getId() == id) {
				studentData.setName(studentRequest.getName());
				studentData.setAge(studentRequest.getAge());
				studentData.setPhoneNumber(studentRequest.getPhoneNumber());
				return studentRequest;
			} else {
				log.info("Student is not present");
			}
		}
		return studentRequest;
	}



}
