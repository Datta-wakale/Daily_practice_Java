package com.array;

public class StudentEnrollmentProcess {

	public static void main(String[] args) 
	{
		String stdName=IO.readln("Enter Student Name: ");
		Course [] courses= {
			new Course(1, "Java", 35000),
			new Course(2, ".net", 30000),
			new Course(3, "Python", 32000)
		};
		Offer [] offers= {
			new Offer("Special discount: Get 20% off on all courses!"),
			new Offer("Limited time offer: Enroll in any two courses and get one course free!")
		};
	
		EducationInstitute e=new EducationInstitute(courses, offers);
		Student student=new Student(stdName, e);
		student.viewCoursesAndFees();
		student.viewOffers();
	    int id=Integer.parseInt(IO.readln("Enter courseId: "));
		student.enrollInCourse(id);

	}

}
