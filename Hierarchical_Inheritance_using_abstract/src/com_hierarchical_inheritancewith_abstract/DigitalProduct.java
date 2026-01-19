package com_hierarchical_inheritancewith_abstract;

public class DigitalProduct extends Product
{
	private String licenseKey;
	
	public DigitalProduct(String name,double price,String category,String licenseKey)
	
	{
		super(name,price,category);
		this.licenseKey=licenseKey;
	}
	
	
	public void applyDiscount(double percentage)
	{
		double discount=getPrice()*percentage/100;
		setPrice(getPrice()-discount);
		
	}
	
	public double calculateTax()
	{
		double tax=getPrice()*5/100;
		return tax;
		
	}
	
	public String toString()
	{
		return "Digital Product: \nProduct Name: "+getName()+
				"Category: "+getCategory()+"\n Price: "+getPrice()+"\n LicenseKey: "+licenseKey;
	}

}
