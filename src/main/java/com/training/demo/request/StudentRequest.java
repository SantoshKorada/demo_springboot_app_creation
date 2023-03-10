package com.training.demo.request;

import com.training.demo.response.StudentResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentRequest {

	private String name;
	private Integer age;
	private Long phoneNumber;
	
}
