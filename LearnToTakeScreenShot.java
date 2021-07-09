package wee4.day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToTakeScreenShot {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		System.out.println(date);
		String newDate  = date.toString().replace(":", "");
		System.out.println(newDate);
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/LG_" +newDate+" .png");
		FileUtils.copyFile(source, target);
		
	}

}
