package week3.day1;

public class SmartPhone extends AndroidPhone{
	public static void connectWhatsapp() {
		System.out.println("connecting whatsapp");
	}
	public static void takeVideo() {
		System.out.println("video downloaded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SmartPhone sm = new SmartPhone();
    sm.takeVideo();
    
    
	}

}
