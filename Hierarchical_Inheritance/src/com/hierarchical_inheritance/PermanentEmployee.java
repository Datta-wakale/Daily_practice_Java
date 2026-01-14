package com.hierarchical_inheritance;

 class PermanentEmployee extends Employee
{
	protected double providentfund;
	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) 
	{
		super(employeeId, employeeName, employeeSalary);
		providentfund=employeeSalary*12/100;
		
	}
	
	
	

	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentfund=" + providentfund + "]";
	}


	public void netSalary()
	{
		double netSalary = employeeSalary+providentfund;
		System.out.println("Net Salary is :"+netSalary);
	}
	
	
}
