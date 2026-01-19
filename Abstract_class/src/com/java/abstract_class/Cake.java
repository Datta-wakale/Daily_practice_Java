package com.java.abstract_class;

public abstract class Cake
{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price=400;
	
	public Cake(String shape, String flavor, int quantity)
	{
		
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}
	
	public void setShape(String shape)
	{
		this.shape=shape;
	}
	public String getShape()
	{
		return this.shape;
	}
	public void setFlavour(String flavor)
	{
		this.flavor=flavor;
	}
	public String getFlavor()
	{
		return this.flavor;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public int getQuantity()
	{
		return this.quantity;
	}


	public String toString()
	{
		return  "A " + shape + " " + flavor + " Cake of " + quantity + " is Ready @ Rs"+ quantity*price ;
	}
	
	
}
