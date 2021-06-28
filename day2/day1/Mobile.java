package week1.day1;

public class Mobile { 
	
 public String mobileModel ="oneplus";
 public int mobileWeight =2;
 private boolean True;
 public boolean  isFullCharge = True; 
 public int mobileCost =32000;
  public void makeCall() {
  System.out.println("make call");
}
   public void sendMsg() {
	System.out.println("send msg");
   }
	public static void main(String[] args) {
		Mobile myMobile= new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
	}

	}


