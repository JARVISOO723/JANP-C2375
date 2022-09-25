package org.practicaltest.dao;
import java.util.TreeSet;
import org.practicaltest.model.Student;


public class StudentDAO {
	//StudentIdComparator studId=new StudentIdComparator();
	static TreeSet<Student> studs = new TreeSet<Student>();
	//Student s1 = new Student(studentEnrollNo,studentName,studentAge);
	//static Student studArray[]=new Student[10];
	public static boolean addStudent(Student stud) {
		boolean result=false;
			studs.add(stud);
			
			//if(studArray[i]==null) {
			//	studArray[i]=studs;
				result=true;
		return result;
	}
	public static TreeSet<Student> displayStudents() {
		//Collections.sort(studs, new StudentIdComparator());
		return studs;
}

}
