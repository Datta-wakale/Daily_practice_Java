package com.chetan.constructor_incapsulation;

import java.util.Scanner;

class Loan {
	 private double principal;
	 private double interestRate;
	 private int durationMonths;
	 public Loan(double principal, double interestRate, int durationMonths) {
		super();
		if(principal <= 0 || interestRate <= 0 || durationMonths <= 0) {
			System.err.println("Error");
			System.exit(0);
		}
		this.principal = principal;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
	 }
	 public double getPrincipal() {
		 return principal;
	 }
	 public void setPrincipal(double principal) {
		 this.principal = principal;
	 }
	 public double getInterestRate() {
		 return interestRate;
	 }
	 public void setInterestRate(double interestRate) {
		 this.interestRate = interestRate;
	 }
	 public int getDurationMonths() {
		 return durationMonths;
	 }
	 public void setDurationMonths(int durationMonths) {
		 this.durationMonths = durationMonths;
	 }
	 public void display() {
		 System.out.println("Principal: "+principal);
		 System.out.println("Interest Rate (Yearly %): "+interestRate);
		 System.out.println("Duration (months): "+durationMonths);
	 }
	 
 }
 
public class CheckLoanDetails {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Loan Amount : ");
         Double principal = Double.parseDouble(sc.nextLine());
         System.out.println("Enter Interest Rate : ");
         Double interest = Double.parseDouble(sc.nextLine());
         System.out.println("Enter number of months for Loan :");
         int duration = Integer.parseInt(sc.nextLine());
         
         Loan l1 = new Loan(principal,interest,duration);
         l1.display();
	}

}
