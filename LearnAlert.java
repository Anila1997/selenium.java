package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	 Alert alert1 = driver.switchTo().alert();
	 String textAlert1 = alert1.getText();
	 System.out.println("textAlert1:" + textAlert1);
	 alert1.accept();
	 
	 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	 Alert alert2 = driver.switchTo().alert();
	 String textAlert2 = alert2.getText();
	 System.out.println("textAlert:2" + textAlert2);
	 alert2.accept();
	 
	 
	 driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	 Alert alert3 = driver.switchTo().alert();
	 String textAlert3 = alert3.getText();
	 
	 alert3.sendKeys("Qeagle");
	 Thread.sleep(3000);
	 alert3.accept();
	 System.out.println("textAlert:3" + textAlert3);
	 
	 driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[text()='ok']")).click();
	 
	
	 
	}

}
