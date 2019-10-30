package com.spring.employeeregistration.model;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int emp_Id;
	private String emp_name;
	private String emp_mobileNumber;
	private String emp_mailId;
	private String password;

	private String emp_DOB;
	private String emp_gender;
	private String emp_address;

	private String emp_JDate;
	private String emp_department;
	private float emp_salary;

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_mobileNumber() {
		return emp_mobileNumber;
	}

	public void setEmp_mobileNumber(String emp_mobileNumber) {
		this.emp_mobileNumber = emp_mobileNumber;
	}

	public String getEmp_mailId() {
		return emp_mailId;
	}

	public void setEmp_mailId(String emp_mailId) {
		this.emp_mailId = emp_mailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmp_gender() {
		return emp_gender;
	}

	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public String getEmp_DOB() {
		return emp_DOB;
	}

	public void setEmp_DOB(String emp_DOB) {
		this.emp_DOB = emp_DOB;
	}

	public String getEmp_JDate() {
		return emp_JDate;
	}

	public void setEmp_JDate(String emp_JDate) {
		this.emp_JDate = emp_JDate;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

}
