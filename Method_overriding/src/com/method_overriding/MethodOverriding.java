package com.method_overriding;

import java.util.Scanner;

public class MethodOverriding 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime EMployees");
		System.out.println("2) Partime Employees");
		
		System.out.println("Please select the employee type:");
		
		int choice=Integer.parseInt(sc.nextLine());
		
		
		
		switch(choice)
		{
				
		case 1: int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter fulltime emp Id:"+id);
		
		String name=sc.nextLine();
		System.out.println("Enter Fulltime emp Name:"+name);
		
		double salary=sc.nextDouble();
		System.out.println("Enter Salary:"+salary);
		
		FullTimeEmployee e=new FullTimeEmployee(id, name, salary);
		System.out.println(name+" Salary is : "+e.calculateSalary());
		break;
		
		
		case 2: int id2=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Partime emp Id:"+id2);
		
		String name2=sc.nextLine();
		System.out.println("Enter Partime emp Name:"+name2);
		
		double hRate=sc.nextDouble();
		System.out.println("Enter Salary:"+hRate);
		int hInMonth=sc.nextInt();
		System.out.println("Work hour In Month:"+hInMonth);
		PartTimeEmployee p = new PartTimeEmployee(id2, name2, hRate, hInMonth);
		System.out.println(name2+" salary is "+p.calculateSalary());;
		
		break;
		
	default:
			System.out.println("Enter valid Choice..");
		
			
		}
			
	}

}
