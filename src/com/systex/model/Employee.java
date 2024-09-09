package com.systex.model;

public class Employee {
public String name;
public String title;
public int salary;
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\n"+title+"\n"+salary;
	}

}
