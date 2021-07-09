package assignments.week4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webTable = driver.findElement(By.id("table_id"));
		
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		int rowSize = tableRows.size();
		System.out.println("Row size:"+ rowSize);
		
		WebElement webElement = tableRows.get(0);
		
		String text = webElement.getText();
		System.out.println(text);
		
		List<WebElement> tableColumns = webElement.findElements(By.tagName("th"));
		
		int colSize = tableColumns.size();
		System.out.println("colSize:" + colSize);
		for(int i = 1; i< tableRows.size(); i++)
		{
			WebElement rowText = tableRows.get(i);
			
			List<WebElement> allcoloumn = rowText.findElements(By.tagName("td"));
			System.out.println(allcoloumn.get(1).getText());
		}
		
		
	}

}
