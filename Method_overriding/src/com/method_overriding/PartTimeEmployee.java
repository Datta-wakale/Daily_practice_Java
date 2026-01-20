package com.method_overriding;

public class PartTimeEmployee extends Employee
{
	protected double hourlyRate;
	protected int hoursWorked;
	
	public PartTimeEmployee(int id,String name,double hourlyRate ,int hoursWorked)
	{
		super(id,name);
		
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	
	public double calculateSalary()
	{
		return this.hoursWorked*this.hourlyRate;
	}
}
