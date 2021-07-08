package assignments.week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		
		
		driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
		
		
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		driver.switchTo().defaultContent();
        Thread.sleep(2000);
        
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
		
		driver.switchTo().defaultContent();
		

		driver.switchTo().frame(0);
		
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys("Abel Tuter");
		
		
		driver.findElement(By.id("incident.short_description")).sendKeys("automation testing");
		WebElement incidentNumber = driver.findElement(By.id("incident.number"));
		
		//driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		driver.findElement(By.id("element.incident.state")).click();
	}

}
