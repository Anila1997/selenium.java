package week1.day2;

public class Calculator {
	public int add(int num1,int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(10,20);
		System.out.println(result);
		
		// TODO Auto-generated method stub

	}

}
