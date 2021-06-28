package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
         String title = driver.getTitle();
         System.out.println("title:" + title);
		 String WelcomeText = driver.findElement(By.tagName("h2")).getText();
		 
		 if(WelcomeText.contains("Welcome"))
			 System.out.println("Login successfull");
		 else
			 System.out.println("Login failed");
		
		
		
	

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("prabha");
		driver.findElement(By.className("smallsubmit")).click();
		
		// TODO Auto-generated method stub

	}

}
