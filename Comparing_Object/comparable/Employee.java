package com.comparable;

public record Employee(Integer Id, String name) implements Comparable<Employee>
{

	public int compareTo(Employee e) 
	{
		return e.Id().compareTo(this.Id());
	}

}
