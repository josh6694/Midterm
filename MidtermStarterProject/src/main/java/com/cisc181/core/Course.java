package com.cisc181.core;

import com.cisc181.eNums.eMajor;
import java.util.UUID;

//this class creates and instance of Course 
public class Course{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	// Constructor
	public Course(UUID courseID, String courseName, int gradePoints,eMajor Major) {
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
		this.Major=Major;
	}
	
	
	

}
