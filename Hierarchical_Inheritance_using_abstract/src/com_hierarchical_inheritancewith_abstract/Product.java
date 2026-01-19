package com_hierarchical_inheritancewith_abstract;

public abstract class Product
{
	private String name;
	private double price;
	private String category;
	
	public Product(String name,double price,String category)
	{
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return this.price;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString()
	{
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	
}
