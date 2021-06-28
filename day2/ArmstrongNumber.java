package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int orgNum = input;
		int total = 0;
		while( input > 0) {
			int rem = input % 10;
			total = total + (rem*rem*rem);
			input = input / 10;
		}
		if( total == orgNum) {
			System.out.println("given number is armstrongnumber");
		}
		else {
			System.out.println("not an armstrong number");
		}
		// TODO Auto-generated method stub

	}

}
