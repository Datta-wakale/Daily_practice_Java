package com.method_overriding;

public class FullTimeEmployee extends Employee
{
	
	protected double salary;
	
	public FullTimeEmployee(int id, String name, double salary)
	{
		super(id,name);
		if(salary<=0)
		{
			System.out.println("Salary must be Positive");
			return;
		}
		this.salary=salary;
	}
	
	public double calculateSalary()
	{
		return this.salary;
	}

}
