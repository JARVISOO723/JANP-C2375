package org.practicaltest.view;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {
	static Scanner scanner=new Scanner(System.in);
	public static boolean addStudent() {
		System.out.println("Enter Number of Students to be stored ");
		int n=scanner.nextInt();
		scanner.nextLine();
		for(int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Enter below info for Student No. "+i);
		System.out.println("Enter Student Roll Number");
		int studentId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a Student Name");
		String studentName=scanner.nextLine();
		System.out.println("Enter Student Age");
		int studentAge=scanner.nextInt();
		scanner.nextLine();
		
		Student stud=new Student(studentId,studentName,studentAge);
		StudentService.addStudent(stud);
		
		}
	    return true;
	
}
		public static TreeSet<Student> displayStudents() {
			return StudentService.displayStudents();
		}
	}
