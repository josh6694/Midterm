package com.cisc181.core;

import java.util.UUID;
 // creates and instance of Section 
public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	// Public Constructor 
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		this.CourseID = courseID;
		this.SemesterID = semesterID;
		this.SectionID = sectionID;
		this.RoomID = roomID;
	}
	

}
