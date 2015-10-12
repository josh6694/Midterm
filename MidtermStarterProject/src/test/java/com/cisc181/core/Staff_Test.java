package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import com.cisc181.eNums.eTitle;



public class Staff_Test {
	Staff test1;
	Staff test2;
	Staff test3;
	Staff test4;
	Staff test5;
	Staff test6;
	//Date invalidDate= new Date("06061900");
	ArrayList<Staff> staff = new ArrayList<Staff>();

	@Test
	public void test() {
		
		test1 = new Staff (null, null, null, null, null, null, null, null, 0, 100000, null, null) ;
		test2 = new Staff (null, null, null, null, null, null, null, null, 0, 200000, null, null) ;
		test3 = new Staff (null, null, null, null, null, null, null, null, 0, 2000, null, null) ;
		test4 = new Staff (null, null, null, null, null, null, null, null, 0, 50000, null, null) ;
		test5 = new Staff (null, null, null, null, null, null, null, null, 0, 70000, null, null) ;
		
		staff.add(test1);
		staff.add(test2);
		staff.add(test3);
		staff.add(test4);
		staff.add(test5);
		
		double salaryAverage= (test1.getSalary()+test2.getSalary()+test3.getSalary()+test4.getSalary()+test5.getSalary())/5;
		assertTrue(salaryAverage==84400);
		
	}
// test for invalid birthdate 
	@Test(expected=PersonException.class)
	public final void setDOB() throws PersonException {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date dateRepresentation = cal.getTime();
		test1.setDOB(dateRepresentation);
		

		
	}
	// test for invalid phone number 
	@Test(expected=PersonException.class)
	public final void setPhone() throws PersonException {
		test1.setPhone("12345678");
		

		
	}
	
	

		
		
		

	}


