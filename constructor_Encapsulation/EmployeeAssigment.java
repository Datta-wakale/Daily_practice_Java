package com.chetan.constructor_incapsulation;

public class EmployeeAssigment
{
	int id = 100;
	
	public static void main(String[] args) 
	{
		int val = 200;

		EmployeeAssigment e1 = new EmployeeAssigment();     

		e1.id = val;

		update(e1);	  
		
		System.out.println(e1.id);

        EmployeeAssigment e2 = new EmployeeAssigment(); 

		e2.id = 900;
        
		switchEmployees(e2,e1); 

		  //GC [How many objects are eligible for GC]

			System.out.println(e1.id);
		    System.out.println(e2.id);
	    } 
		
	 public static void update(EmployeeAssigment e)  
	 {
        e.id = 500;
		e = new EmployeeAssigment();
		e.id = 400;
		System.out.println(e.id);
	 }

	 public static void switchEmployees(EmployeeAssigment e1, EmployeeAssigment e2)
	  {
		 int temp = e1.id; 
		 e1.id = e2.id; 
		 e2 = new EmployeeAssigment();
		 e2.id = temp;
	  }
   }


