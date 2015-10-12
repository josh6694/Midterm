package com.cisc181.core;

import java.util.Date;
// exception of the person class for invalid phone number or invalid date of birth
public class PersonException extends Exception {
	
	private String phone_number;
	private Date DOB;
	
	public PersonException(Date dOB) {
		this.DOB = dOB;
	}

	public PersonException(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public Date getDOB() {
		return DOB;
	}
	
	

}
