package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@Test
	public void test() {
		// set UUID's 
		UUID course1ID = UUID.randomUUID();
		UUID course2ID = UUID.randomUUID();
		UUID course3ID = UUID.randomUUID();
		UUID fallID = UUID.randomUUID();
		UUID springID = UUID.randomUUID();
		UUID Section1ID = UUID.randomUUID();
		UUID Section2ID = UUID.randomUUID();
		UUID Section3ID = UUID.randomUUID();
		UUID Section4ID = UUID.randomUUID();
		UUID Section5ID = UUID.randomUUID();
		UUID Section6ID = UUID.randomUUID();
		UUID StudentId = UUID.randomUUID();

		
// create course 		
		Course course1= new Course(course1ID, "Chem", 0, eMajor.CHEM);
		Course course2 = new Course(course2ID, "Compsi", 0, eMajor.COMPSI);
		Course course3 = new  Course(course3ID,"Business", 0 , eMajor.BUSINESS);
		// create course arraylist 
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		
	// create semester instances and arraylist 
		Semester fall = new Semester(fallID, null, null);
		Semester spring = new Semester(springID, null, null);
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);
		
		Section fallCourse1 = new Section(course1ID, fallID, Section1ID, 0);
		Section fallCourse2 = new Section(course2ID, fallID, Section2ID, 0);
		Section fallCourse3 = new Section(course3ID, fallID, Section3ID, 0);	
		Section springCourse1 = new Section(course1ID, springID, Section4ID, 0);
		Section springCourse2 = new Section(course2ID, springID, Section5ID, 0);
		Section springCourse3 = new Section(course3ID, springID, Section6ID, 0);
		
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(fallCourse1);
		sections.add(fallCourse2);
		sections.add(fallCourse3);
		sections.add(springCourse1);
		sections.add(springCourse2);
		sections.add(springCourse3);
		
		
		Student Student1 = new Student(null, null, null, null, null, null, null, null);
		Student Student2 = new Student(null, null, null, null, null, null, null, null);
		Student Student3 = new Student(null, null, null, null, null, null, null, null);
		Student Student4 = new Student(null, null, null, null, null, null, null, null);
		Student Student5 = new Student(null, null, null, null, null, null, null, null);
		Student Student6 = new Student(null, null, null, null, null, null, null, null);
		Student Student7 = new Student(null, null, null, null, null, null, null, null);
		Student Student8 = new Student(null, null, null, null, null, null, null, null);
		Student Student9 = new Student(null, null, null, null, null, null, null, null);
		Student Student10 = new Student(null, null, null, null, null, null, null, null);
		
		// create student arrayList
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(Student1);
		students.add(Student2);
		students.add(Student3);
		students.add(Student4);
		students.add(Student5);
		students.add(Student6);
		students.add(Student7);
		students.add(Student8);
		students.add(Student9);
		students.add(Student10);
		
		// create enrollment instances 
		Enrollment fallCourse1Enrolled = new Enrollment(Section1ID, null);
		Enrollment fallCourse2Enrolled = new Enrollment(Section2ID, null);
		Enrollment fallCourse3Enrolled = new Enrollment(Section3ID, null);
		Enrollment SpringCourse1Enrolled = new Enrollment(Section3ID, null);
		Enrollment SpringCourse2Enrolled = new Enrollment(Section3ID, null);
		Enrollment SpringCourse3Enrolled = new Enrollment(Section3ID, null);
		
		// enroll students for sections and test for grades
		
		for (Student student:students){
			fallCourse1Enrolled.setEnrollmentID(StudentId);
			fallCourse1Enrolled.setGrade(68);
			assertTrue(fallCourse1Enrolled.getGrade()==68);
		}
		
		for (Student student:students){
			fallCourse2Enrolled.setEnrollmentID(StudentId);
			fallCourse2Enrolled.setGrade(78);
			assertTrue(fallCourse2Enrolled.getGrade()==78);

		}
		for (Student student:students){
			fallCourse3Enrolled.setEnrollmentID(StudentId);
			fallCourse3Enrolled.setGrade(88);
			assertTrue(fallCourse3Enrolled.getGrade()==88);

		}
		for (Student student:students){
			SpringCourse1Enrolled.setEnrollmentID(StudentId);
			SpringCourse1Enrolled.setGrade(71);
			assertTrue(SpringCourse1Enrolled.getGrade()==71);

		}
		for (Student student:students){
			SpringCourse2Enrolled.setEnrollmentID(StudentId);
			SpringCourse2Enrolled.setGrade(61);
			assertTrue(SpringCourse2Enrolled.getGrade()==61);

		}
		for (Student student:students){
			SpringCourse3Enrolled.setEnrollmentID(StudentId);
			SpringCourse3Enrolled.setGrade(81);
			assertTrue(SpringCourse3Enrolled.getGrade()==81);

		}

		
		
		
		
		
		

			
			
		
			

		}
	}


