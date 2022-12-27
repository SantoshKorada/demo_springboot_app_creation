package com.training.demo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentResponse {

	private Integer id;
	private String name;
	private Integer age;
	private Long phoneNumber;
	
}
