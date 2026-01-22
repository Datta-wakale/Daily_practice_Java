package com.chetan.constructor_incapsulation;

import java.util.Scanner;

class Bank{
	private String accountHolderName;
	private double principalAmount;
	private double timeInMonths;
	private double interestRate;
	
	public Bank(String accountHolderName, double principalAmount, double timeInMonths, double interestRate) {
		super();
		this.accountHolderName = accountHolderName;
		this.principalAmount = principalAmount;
		this.timeInMonths = timeInMonths;
		this.interestRate = interestRate;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public double getTimeInMonths() {
		return timeInMonths;
	}

	public void setTimeInMonths(double timeInMonths) {
		this.timeInMonths = timeInMonths;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "--- Original Account Details --- "+
				 "\n Account Holder   : " + accountHolderName + 
				 "\n Principal Amount : " + principalAmount
				+"\n Time (in months) : " + timeInMonths + 
				"\n Interest Rate     : " + interestRate + "% \n";
	}
	
}

class BankInfo{
	private String acountHolderName;
	private double principlAmount;
	private double timeInMonth;
	private double intrestRate;
	private double finalAmount;
	private double intrest;
	public BankInfo(Bank bk) {
		super();
		this.acountHolderName = bk.getAccountHolderName();
		this.principlAmount = bk.getPrincipalAmount();
		this.timeInMonth = bk.getTimeInMonths();
		this.finalAmount = finalAmount;
		this.intrestRate = bk.getInterestRate();
	}
	public double calculateInterest() {
		 intrest = (principlAmount * intrestRate * timeInMonth)/100;
		return intrest;
	}
	public double getFinalAmount() {
	    finalAmount = principlAmount + calculateInterest();
		return finalAmount;
	}
	@Override
	public String toString() {
		return "---Updated Account Details (after Interest Calculation "
				+ "\n using Copy Constructor) --- "+
				"\n Account Holder    : " + acountHolderName + 
				"\n Principal Amount  : " + principlAmount + 
				"\n time (in months)  : " + timeInMonth + 
				"\n interestRate      : " + intrestRate + 
				 "% \n intrest         : " + calculateInterest() +
				 "\n finalAmount       : " + getFinalAmount() +"";
	}
	
}
public class BankIntrest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double principal = sc.nextDouble();
        double time = sc.nextDouble();
        double interestRate = sc.nextDouble();
        
        Bank b1 = new Bank(name, principal, time, interestRate);
        BankInfo b2 = new BankInfo(b1);
        System.out.println(b1);
        System.out.println(b2);
	}
}


