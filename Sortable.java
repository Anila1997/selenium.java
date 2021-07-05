package assignments.week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement item1 = driver.findElementByXPath("//li[@class='ui-state-default ui-sortable-handle'][1]");
		WebElement item7 = driver.findElementByXPath("//li[@class='ui-state-default ui-sortable-handle'][7]");
		
		Point location = item7.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		Actions builder = new  Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
