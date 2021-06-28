package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		String src = driver.findElementByXPath("(//img)[3]").getAttribute("src");
		driver.get(src);
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Image is Broken");
		}
	}

}
