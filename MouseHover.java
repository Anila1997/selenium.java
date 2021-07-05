package assignments.week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement target = driver.findElementByXPath("//a[@class='btnMouse']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(target).perform();
		System.out.println("selenium , RPA , webservices");
		
		  driver.findElementByLinkText("Selenium").click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
	}

}
