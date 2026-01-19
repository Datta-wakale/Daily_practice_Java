package com_hierarchical_inheritancewith_abstract;

public class PhysicalProduct extends Product 
{
	private double shippingWeight;

	public PhysicalProduct(String name, double price, String category, double shippingWeight)
	{
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}
	
	public void applyDiscount(double percentage)
	{
		double discount=getPrice()*percentage/100;
		setPrice(getPrice()-discount);
		
	}
	
	public double calculateTax()
	{
		double tax=getPrice()*8/100;
		return tax;
		
	}
	
	public double calculateShippingCost()
	{
		return this.shippingWeight*5;
	}

	
	

	
	
	
	
}
