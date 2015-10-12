package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
//Creates and instance of Semester 
public class Semester {
	// create data fields 
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	// create constructor
	public Semester(UUID semesterID, Date startDate, Date endDate) {

		this.SemesterID = semesterID;
		this.StartDate = startDate;
		this.EndDate = endDate;
	}
	
	

}
