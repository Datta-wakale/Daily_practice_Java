package com.method_overriding;

public class Employee
{
	protected int id;
	protected String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public double calculateSalary()
	{
		System.out.println("Generic Salary: ");
		return 0.0;
	}
	
	
}
