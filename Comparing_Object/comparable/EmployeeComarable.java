package com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class EmployeeComarable 
{

	public static void main(String[] args)
	{
		
		List<Employee> emp=new Vector<>(4);
		emp.add(new Employee(5,"Datta"));
		emp.add(new Employee(6,"Sohel"));
		emp.add(new Employee(101,"Shubham"));
		emp.add(new Employee(1,"Rohit"));
		
		Collections.sort(emp);
		
		for (Employee employee : emp) 
		{
			IO.println(employee);
		}
		
	}

}
