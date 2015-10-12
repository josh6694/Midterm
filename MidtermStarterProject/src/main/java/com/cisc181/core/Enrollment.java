package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	// set data field 
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	// no arg constructor 
	private Enrollment(){
		
	}
	
	
	// two arg constructor 
	public Enrollment(UUID sectionID, UUID studentID) {
		this.SectionID = sectionID;
		this.StudentID = studentID;
		this.EnrollmentID = EnrollmentID;
	}

	


// setters and getters 
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}


	public double getGrade() {
		return Grade;
	}
	}

