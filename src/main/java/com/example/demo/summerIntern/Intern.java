package com.example.demo.summerIntern;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class Intern {
	@Id
	public String _id;
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String jobId;
	private String salary;
	private String managerId;
	private String departmentId;
	
	
	
	
	
}
	
	

