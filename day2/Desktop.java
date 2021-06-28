package week3.day2;

public class Desktop implements SoftWare,HardWare{

	public void hardwareResourses() {
 System.out.println("memory");
		
	}

	public void softwareResources() {
		System.out.println("cloud computing");
		
	}
	
	public static void main(String[] args) {
		Desktop newDesk = new Desktop();
		newDesk.softwareResources();
		newDesk.hardwareResourses();
		
	}
}
