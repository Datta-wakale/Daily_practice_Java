package com.hierarchical_inheritance;
import java.util.Scanner;
public class EmployeeSystem {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int employeeId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name:");
		String employeeName=sc.nextLine();
		System.out.println("Enter salary:");
		double employeeSalary=Double.parseDouble(sc.nextLine());
		
		
		PermanentEmployee permanentEmployee = new PermanentEmployee(employeeId, employeeName, employeeSalary);
		System.out.println(permanentEmployee);
		
		permanentEmployee.netSalary();
		
		System.out.println("----------------------------------------------------\n");
		System.out.println("Enter per Id:");
		int ContractemployeeId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter per name:");
		String ContractemployeeName=sc.nextLine();
		System.out.println("Enter salary:");
		double ContractEmployeeSalary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter contract Duration:");
		int contractDuration=Integer.parseInt(sc.nextLine());
		ContractEmployee contractEmployee = new ContractEmployee(ContractemployeeId, ContractemployeeName, ContractEmployeeSalary, contractDuration);
		System.out.println(contractEmployee);
		

	}

}
