package week3.day1;

public class Calculator {
public void add(int num1, int num2) {
	System.out.println(num1+num2);
}
public void add(int num1, int num2, int num3) {
	System.out.println(num1+num2+num3);
}
public void mul(int num1, int num2) {
	System.out.println(num1*num2);
}
public void mul(int num1, double num2) {
	System.out.println(num1*num2);
}
public void div(int num1, int num2) {
	System.out.println(num1/num2);
}
public void div(double num1, int num2) {
	System.out.println(num1/num2);
}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(5,3);
	cal.add(5,3,3);
	cal.mul(5,3);
	cal.mul(5,3698.052);
	cal.div(10,2);
	cal.div(33696.20,3);
				
	
	
}

}

