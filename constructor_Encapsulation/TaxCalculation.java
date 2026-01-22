package com.chetan.constructor_incapsulation;

import java.util.Scanner;

class EmployeeInfo{
	 private int Id ;
	 private String name;
	 private double basicSalary;
	 private double HRAPer ;
	 private double DAPer;
	 public EmployeeInfo(int employeeId, String employeeName, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.Id = employeeId;
		this.name = employeeName;
		this.basicSalary = basicSalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
	 }
	 public double calculateGrossSalary() {
		 double hRAPer = (HRAPer * basicSalary)/100;
		 double dAPer = (DAPer * basicSalary)/100;
		 double grossSalary =  basicSalary + hRAPer + dAPer ;
		 return grossSalary;
	 }
	 @Override
	 public String toString() {
		return "EmployeeInfo Data : \n Employee Id=" + Id + ", Employee Name=" + name + ", Basic Salary="
				+ basicSalary + ", HRAPer=" + HRAPer + ", DAPer=" + DAPer +"";
	 }
 }

 class Manager{
	 private EmployeeInfo emp ;
	 private double projectAllowance;
	 
	 public Manager(EmployeeInfo emp,double projectAllowance) {
		super();
		 this.emp= emp;
		 this.projectAllowance = projectAllowance;
	 }
	 public double calculateGrossSalary() {
		 double grossSalary = emp.calculateGrossSalary()+ projectAllowance;
		 return grossSalary;
	 }
	 @Override
	 public String toString() {
		return "Manager [Manager details: "+ emp +", Project Allowance=" + projectAllowance + "]";
	 } 
 }
 
 class Trainer {
	 private EmployeeInfo emp;
	 private int batchCount;
	 private double perkPerBatch;
	 public Trainer(EmployeeInfo emp, int batchCount,
			double perkPerBatch) {
		super();
		this.emp = emp;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	 }
	
	 public double calculateGrossSalary() {
		 double grossSalary = emp.calculateGrossSalary() +(batchCount * perkPerBatch);
		 return grossSalary;
	 }
	 @Override
	 public String toString() {
		return "Trainer [Trainer Details : "+emp+", Batch Count=" + batchCount + ", Perk Per Batch="
				+ perkPerBatch + "]";
	 } 
 }
 class Sourcing {
	 private EmployeeInfo emp;
	 private int enrollmentTarget;
	 private int enrollmentReached;
	 private double perkPerEnrollment;
	 public Sourcing(EmployeeInfo emp,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.emp = emp;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	 }
	 
	 public int getEnrollmentTarget() {
		 return enrollmentTarget;
	 }
	 public void setEnrollmentTarget(int enrollmentTarget) {
		 this.enrollmentTarget = enrollmentTarget;
	 }
	 public int getEnrollmentReached() {
		 return enrollmentReached;
	 }
	 public void setEnrollmentReached(int enrollmentReached) {
		 this.enrollmentReached = enrollmentReached;
	 }
	 public double getPerkPerEnrollment() {
		 return perkPerEnrollment;
	 }
	 public void setPerkPerEnrollment(double perkPerEnrollment) {
		 this.perkPerEnrollment = perkPerEnrollment;
	 }
	 public double calculateGrossSalary() {
		 double grossSalary = emp.calculateGrossSalary() +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
		 return grossSalary;
	 }
	 @Override
	 public String toString() {
		return "Sourcing [Source details :" +emp + ", Enrollment Target=" + enrollmentTarget
				+ ", Enrollment Reached=" + enrollmentReached + ", Perk Per Enrollment=" + perkPerEnrollment + "]";
	 } 
 }
 
 class TaxUtil{
	 double grosSalary ;
	double payableSalary ;

	 public double calculateTax(EmployeeInfo emp) {
		if(emp.calculateGrossSalary()>50000) {
		   grosSalary = ((emp.calculateGrossSalary()*20 )/100) ;
		   payableSalary = emp.calculateGrossSalary();
	
		}else {
			   grosSalary = (emp.calculateGrossSalary()*5 )/100;
			   payableSalary = emp.calculateGrossSalary();
	 }
      
	 return  grosSalary;
	 
	 }
	 public double calculateTax(Trainer emp) {
		 
		 if(emp.calculateGrossSalary()>50000) {
			 
			 grosSalary = ((emp.calculateGrossSalary()*20 )/100) ;
			   payableSalary = emp.calculateGrossSalary();
			 
		 }else {
			 grosSalary = (emp.calculateGrossSalary()*5 )/100;
			   payableSalary = emp.calculateGrossSalary();
		 }
		 
		 return  grosSalary;
	 }
		 public double calculateTax(Manager emp) {
			 
			 if(emp.calculateGrossSalary()>50000) {
				 
				 grosSalary = ((emp.calculateGrossSalary()*20 )/100) ;
				   payableSalary = emp.calculateGrossSalary();
				 
			 }else {
				 grosSalary = (emp.calculateGrossSalary()*5 )/100;
				   payableSalary = emp.calculateGrossSalary();
			 }
			 
			 return  grosSalary;
         }
		 public double calculateTax(Sourcing emp) {
			 
			 if(emp.calculateGrossSalary()>50000) {
				 
				 grosSalary = ((emp.calculateGrossSalary()*20 )/100) ;
				   payableSalary = emp.calculateGrossSalary();
				 
			 }else {
				 grosSalary = (emp.calculateGrossSalary()*5 )/100;
				   payableSalary = emp.calculateGrossSalary();
			 }
			 
			 return  grosSalary;
		 }
		 public void display() {
			 
			 double finalSalary= payableSalary -grosSalary;
			 System.out.println(", final Salary : "+finalSalary);

		 }		 
    }
public class TaxCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employeeId :");
        int Id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter employeeName :");
		String Name = sc.nextLine();
		System.out.println("Enter basic Salary :");
		double basicSalary = Double.parseDouble(sc.nextLine());
		System.out.println("Enter HRAPer :");
		double HRAPer = Double.parseDouble(sc.nextLine());
		System.out.println("Enter DAPer :");
		double DAPer = Double.parseDouble(sc.nextLine());
	       TaxUtil tax = new TaxUtil();
			System.out.println("Enter your choice :");
	       String choice = sc.nextLine().toLowerCase();
			 EmployeeInfo e1 = new EmployeeInfo(Id, Name, basicSalary, HRAPer,DAPer);

		switch(choice) {
		case "employee" : {
       System.out.print( e1 + " grocerray salary :" +tax.calculateTax(e1) );
       tax.display(); 
		}
		break;
		case "manager" : {
			  System.out.println("Enter manager project Allowance  :");
		       double projectAllowance = Double.parseDouble(sc.nextLine());
		     
			Manager m1 = new Manager(e1, projectAllowance);
		       System.out.print( m1 + " grocerray salary :" +tax.calculateTax(m1) );
		       tax.display(); 
		}
		break;
		case "trainer" : {
			 int batchCount = Integer.parseInt(sc.nextLine());
			   System.out.println("Enter Trainer perk per Batch  :");
			   double perkPerBatch = Double.parseDouble(sc.nextLine());
			   
			   Trainer t1 = new Trainer(e1, batchCount, perkPerBatch);
			   System.out.print( t1 +" grocerray salary :" +tax.calculateTax(t1) );
		       tax.display(); 
			  
		}
		break;
		case "sourcing" :{
			  System.out.println("Enter Sourcing enrollment Target  :");
			   int enrollmentTarget = Integer.parseInt(sc.nextLine());
			   System.out.println("Enter sourcing Enrollment Reached  :");
			   int enrollmentReached = Integer.parseInt(sc.nextLine());
			   System.out.println("Enter sourcing perk per Enrollment  :");
			   double perkPerEnrollment = Double.parseDouble(sc.nextLine());
			   
			   Sourcing s1 = new Sourcing(e1, enrollmentTarget, enrollmentReached, perkPerEnrollment);
			   System.out.print( s1 + " grocerray salary :" +tax.calculateTax(s1) );
		       tax.display(); 
		}
		break;
		default : System.out.println("No type match ");
		break;
		}
	}

}
