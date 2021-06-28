package org.student;

public class Students {
public void getStudentInfo(int Id) {
	System.out.println("student Id");
}
public void getStudentInfo(int Id ,String studentName) {
	System.out.println(Id+ "studentName");
}
public void getStudentInfo(String email,int phno) {
	System.out.println(email+ "phno");
}
public static void main(String[] args) {
	Students si = new Students();
	si.getStudentInfo(100);
	si.getStudentInfo(100,"Anila");
	si.getStudentInfo("anila12.4.1997@gmail.com",2676615);
}
}
