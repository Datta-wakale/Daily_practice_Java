package com.java.abstract_class;

public class OrderedCake extends Cake
{
	private String message;
	
	public OrderedCake()
	{
		super("Round","vanila",1);
	}

	public OrderedCake(String shape, String flavor, int quantity) 
	{
		super(shape, flavor, quantity);
		
	}

	public OrderedCake(String shape, String flavor, int quantity, String message) 
	{
		super(shape, flavor, quantity);
		
		this.message = message;
	}
	
	public String toString()
	{
		
		return  "A " + getShape() + " " + getFlavor() + " Cake of " + getQuantity() + " is Ready with Happy Birthday Message @ Rs"+ getQuantity()*price ;
	}
	
	
}
