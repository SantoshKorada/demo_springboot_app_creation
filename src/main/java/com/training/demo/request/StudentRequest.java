package com.training.demo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentRequest {

	private Integer id;
	private String name;
	private Integer age;
	private Long phoneNumber;
	
}
