package com_hierarchical_inheritancewith_abstract;

import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type: ");
		System.out.println("\t\t\t 1. Digital Product");
		System.out.println("\t\t\t 1. Physical Product");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1-> 
		  {
			System.out.println("Enter Digital product name");
			String name=sc.nextLine();
			System.out.println("Enter product price");
			double price=Double.parseDouble(sc.nextLine());
			System.out.println("product category");
			String category=sc.nextLine();
			System.out.println("License Key");
			String licnse = sc.nextLine();
			System.out.println("Enter discount per on final price");
			double disc=Double.parseDouble(sc.nextLine());
			
			Product p=new DigitalProduct(name, price, category, licnse);
			System.out.println(p);
			p.applyDiscount(disc);
			System.out.println("Tax RS: "+p.calculateTax());
		  }
		}
		
		

	}

}
