package com.java.abstract_class;

public class CakeOrder 
{

	public static void main(String[] args) 
	{
		Cake c =null;
		c = new OrderedCake();
		System.out.println(c);
		
		c = new OrderedCake("Round","Chocalate",5);
		System.out.println(c);
		
		c = new OrderedCake("round","Apple",3,"Happy Birthday Message");
		System.out.println(c);


	}

}
