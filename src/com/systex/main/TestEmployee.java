package com.systex.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.systex.model.Employee;

public class TestEmployee {
public static void main(String[] args) {
	Employee emp= new Employee();
	emp.name = "陳永福";
	emp.salary = 85000;
	emp.title = "經理";
	System.out.println(emp);
	GregorianCalendar gregorianCalendar=new GregorianCalendar();
	System.out.println(gregorianCalendar.getTimeInMillis());
}
	
}
