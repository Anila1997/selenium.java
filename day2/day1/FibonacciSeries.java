package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int count = 8, num1 = 0, num2 = 1;
		System.out.println("Fibbonacci series of "+count+"numbers:");
		 for(int i = 1; i <= count; ++i)
		 {
		 System.out.println(num1+"");
		 int sumofprevTwo = num1 + num2;
				 num1 = num2;
		         num2 = sumofprevTwo;
		 }
	
		// TODO Auto-generated method stub

	}

}
