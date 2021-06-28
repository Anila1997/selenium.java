package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		AxisBank am = new AxisBank();
		am.deposit();
	}
}
