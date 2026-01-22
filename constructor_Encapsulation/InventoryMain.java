package com.chetan.constructor_incapsulation;

import java.util.Scanner;

class InventoryItem {
	 private String itemName;
	 private double pricePerUnit ;
	 private int quantityInStock;
	 public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
	 }
	 public String getItemName() {
		 return itemName;
	 }
	 public void setItemName(String itemName) {
		 this.itemName = itemName;
	 }
	 public double getPricePerUnit() {
		 return pricePerUnit;
	 }
	 public void setPricePerUnit(double pricePerUnit) {
		 this.pricePerUnit = pricePerUnit;
	 }
	 public int getQuantityInStock() {
		 return quantityInStock;
	 }
	 public void setQuantityInStock(int quantityInStock) {
		 this.quantityInStock = quantityInStock;
	 }

    public double calculateTotalValue() {
    	    return quantityInStock * pricePerUnit;
    	   
    }
    public void display() {
    	  System.out.println("Inventory Item Details: ");
    	  System.out.println("Item Name: "+itemName);
    	  System.out.println("Price Per Unit: "+pricePerUnit);
    	  System.out.println("Quantity in Stock: "+quantityInStock);
	         System.out.println("Total Inventory Value: "+calculateTotalValue());

    }
 }
public class InventoryMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter Item Name : ");
          String itemName = sc.nextLine();
         System.out.println("Enter Price Per Unit : ");
         Double price = Double.parseDouble(sc.nextLine());
         System.out.println("Enter Quantity In Stock :");
         int quantity = Integer.parseInt(sc.nextLine());
         
         InventoryItem item = new InventoryItem(itemName, price, quantity);
         item.display();
         System.out.print("Any updation in Stock Price OR Quantity :");
         String choice = sc.nextLine();
         
		if(choice.equalsIgnoreCase("no")) {
			System.exit(0);
			
		}
		   System.out.println();
			System.out.println("Enter New Price Per Unit: ");
			double newPrice = Double.parseDouble(sc.nextLine());
			
		    System.out.println("Enter New Quantity In Stock: ");
		    int newQuantity = Integer.parseInt(sc.nextLine());
		    
		    item.setPricePerUnit(newPrice);
		    item.setQuantityInStock(newQuantity);
		    item.display();

		}
	}


