package com.array;

public record Student(String name, EducationInstitute institute)
{
	public void viewCoursesAndFees()
	{
		Course[] courses = institute.courses();
		for(Course c:courses) 
		{
			IO.println(c.id()+" : "+c.name()+" : "+c.fee());
		}
	}
	
	public void viewOffers()
	{
		Offer[] offers = institute.offers();
		for (Offer offer : offers)
		{
			IO.println(offer);
		}
	
		
	}
	
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId,name);
	}
}
