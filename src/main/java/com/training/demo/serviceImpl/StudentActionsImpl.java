package com.training.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;
import com.training.demo.request.StudentRequest;
import com.training.demo.response.StudentResponse;
import com.training.demo.service.StudentActions;

@Service
public class StudentActionsImpl implements StudentActions{

	// In memory DB
	List<StudentResponse> studentsResponseList = new ArrayList<>();
	
	
	@Override
	public StudentResponse addStudent(StudentRequest studentRequest) {
		// TODO Auto-generated method stub
		
		// Generating Random Roll No
		Random random = new Random();
		int rollNo = random.nextInt();
		
//		StudentResponse studentResponse=new StudentResponse();
//		studentResponse.setId(rollNo);
//		studentResponse.setAge(studentRequest.getAge());
//		studentResponse.setName(studentRequest.getName());
//		studentResponse.setPhoneNumber(studentRequest.getPhoneNumber());
//		
		StudentResponse studentResponse=StudentResponse.builder()
				.id(rollNo)
				.name(studentRequest.getName())
				.age(studentRequest.getAge())
				.phoneNumber(studentRequest.getPhoneNumber())
				.build();
		
		studentsResponseList.add(studentResponse);
		
		//System.out.println("Students Data :: {}"+ studentsResponseList);
		
		return studentResponse;
	}

	@Override
	public StudentResponse updateStudent(StudentRequest studentRequest, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentResponse> getAllStudents() {
		// TODO Auto-generated method stub
		System.out.println("Students Data :: "+studentsResponseList);
		return studentsResponseList ;
	}
	
	public static void main(String args[]) {
		
		//StudentActionsImpl actionsImpl= new StudentActionsImpl();
		
		StudentActions studentActions= new StudentActionsImpl();
		
		StudentRequest SantoshRequest = StudentRequest.builder()
				.name("Santosh")
				.age(21)
				.phoneNumber(90300303L)
				.build();
		
		studentActions.addStudent(SantoshRequest);
		studentActions.getAllStudents();
		
		StudentRequest nikithaRequest = StudentRequest.builder()
				.name("Nikitha")
				.age(22)
				.phoneNumber(567890L)
				.build();
		studentActions.addStudent(nikithaRequest);
		
		studentActions.getAllStudents();
		
		
		
	}

}
