package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
		
		
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade level + id
		id++; // increment class static id variable by one each time a new student created
		this.studentID = gradeYear +"" + id;
	}
	
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0 when done enrolling
		String course = "";
		Scanner in = new Scanner(System.in);
		
		while (!course.equals("q")) {
			System.out.print("Enter a course to enroll (\"q\" to quit when finished enrolling)");
			course = in.nextLine();
			
			if (course.equals("q")) break;
		
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
				
		}
//		do {
//			System.out.println("Enter a course to enroll (Q to quit when finished enrolling)");
//			Scanner in = new Scanner(System.in);
//			String course = in.nextLine();
//		
//			if (!course.equals("Q")) {
//				courses = courses + "\n" + course;
//				tuitionBalance = tuitionBalance + costOfCourse;
//			} 
//			else {break;}
//		} 
//		while (true);
			
		System.out.println("You are enrolled in: "+ courses);
		System.out.println("Your tuition balance is: $"+ tuitionBalance);
		
		}
		
		
		
		
			
			
		
		
		
	
	
	// View balance 
	
	
	
	// Pay tuition
	
	
	
	// Show status 
	
	
}
