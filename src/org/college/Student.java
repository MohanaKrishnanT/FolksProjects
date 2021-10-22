package org.college;

public class Student extends HostelTwo {
	public void stdName() {
System.out.println("student name is mohan");

	}
	public void stdDepartment() {
System.out.println("MCA");
	}
public void studentIde() {
System.out.println("18cs408");
}
public static void main(String[] args) {
	Student a=new Student();
	a.stdName();
	a.stdDepartment();
	a.studentIde();
	a.collegeName();
	a.hostelName();
	a.apjHostel();
}
}
