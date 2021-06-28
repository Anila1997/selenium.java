package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("John");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	    String company = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']").getText();
	    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();
	    System.out.println(company);
	    Thread.sleep(2000);
	    driver.findElementByLinkText("Edit").click();
	    driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
	    driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TestLeaf");
	    driver.findElementByXPath("//input[@name='submitButton']").click();
	    String comp = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	    
	    if(comp.contains(company)) {
	    	System.out.println("Did not change");
	    }
	    else {
	    	System.out.println("company name has updated");
	    }
	    
	}

}
