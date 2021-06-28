package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TXpath.javaODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement( By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement( By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement( By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement( By.xpath("//input[@id='label']")).click();
		
        
		
		
	

		
		
	}

}
