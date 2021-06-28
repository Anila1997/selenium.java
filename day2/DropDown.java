package week2.day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver dd=new ChromeDriver();
		
		dd.manage().window().maximize();
		
		dd.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement findElement1 = dd.findElement(By.xpath("//select[@id='dropdown1']"));//following::div[5]"));
		Select dd1=new Select(findElement1);
		dd1.selectByIndex(1);
		
		WebElement findElement2 = dd.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dd2=new Select(findElement2);
		dd2.selectByVisibleText("Appium");
		
		WebElement findElement3 = dd.findElement(By.xpath("//select[@id='dropdown3']"));
		Select dd3=new Select(findElement3);
		dd3.selectByValue("3");
		
		WebElement findElement4 = dd.findElement(By.xpath("//select[@class='dropdown']"));
		Select dd4=new Select(findElement4);
	    List <WebElement> opt=dd4.getOptions();
	    int x=opt.size();
	    
	    for ( int i=1;i<x;i++) {
	    	String options = opt.get(i).getText();
	        System.out.println(options);
	    }
		//dd.findElement(By.xpath("//section[@class='innerblock']//following::div[5]")).sendKeys("Selenium");
		
	  dd.findElement(By.xpath("//option[contains(text(),'You can also use sendKeys to select')]/following::option[1]")).click();
	//option[contains(text(),'Select your programs')]/following::option[4]
	  //dd.findElement(By.xpath("//option[contains(text(),'Select your programs')]/following::option[4]")).click();

	  WebElement findElement5=dd.findElement(By.xpath("//option[contains(text(),'Select your programs')]"));
	  Select dd5=new Select(findElement5);
		dd5.selectByVisibleText("UFT/QTP");
	}

}
