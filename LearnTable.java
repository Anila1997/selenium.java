package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		  String text = driver.findElement(By.xpath("//table[@id='table_id']//tr[3]/td[2]")).getText();
		 System.out.println(text);
		 driver.findElement(By.xpath("//table[@id='table_id']//tr[4]//td[3]/input")).click();
	}
	

}
