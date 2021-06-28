package org.student;


import org.department.Department;


public class Student extends Department{
	public void studentName() {
		System.out.println("student name is Anila");
	}
	public void studentDept() {
		System.out.println("student department is ECE");
	}
	public void studentId() {
		System.out.println("student id is syaoeec006");
	}
	public static void main(String[] args) {
		Student newStudent = new Student();
		newStudent.collegeName();
		newStudent.collegeCode();
		newStudent.collegeRank();
		newStudent.deptName();
		newStudent.studentName();
		newStudent.studentDept();
		newStudent.studentId();
		
	}
	
		
		
	}
	
		
	


