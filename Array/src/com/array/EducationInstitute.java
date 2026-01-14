package com.array;

public record EducationInstitute(Course[] courses,Offer[] offers)
{
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		for(Course c:courses)
		{
			if(c.id()==courseId)
			{
				IO.println(studentName+" enrolled in: "+c.name());
				return;
			}
		}
		IO.println("Course with ID "+courseId+" not found.");
	}
}
