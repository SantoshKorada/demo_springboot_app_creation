package com.training.demo.service;

import java.util.List;

import com.training.demo.request.StudentRequest;
import com.training.demo.response.StudentResponse;

public interface StudentActions {

	public StudentResponse addStudent(StudentRequest studentRequest);

	public StudentResponse updateStudent(StudentRequest studentRequest, Integer id);

	public void deleteStudent(Integer id);

	public List<StudentResponse> getAllStudents();
}
