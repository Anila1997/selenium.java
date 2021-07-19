package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	
	
	//@Given("Open the  browser")
//public void chromeBrowser() {
	
	
	//WebDriverManager.chromedriver().setup();
	 //driver = new ChromeDriver();
	//driver.manage().window().maximize();



//@Given("Load the application url")
//public void loadUrl() {
	//driver.get("http://leaftaps.com/opentaps/");
	
	


@Given("Enter the username as {string}")
public void enterUsername(String  UName) {
	driver.findElement(By.id("username")).sendKeys(UName);
	
}	
	
@Given("Enter the password as {string}")	
public void enterPassword(String pWord)	{
	driver.findElement(By.id("password")).sendKeys(pWord);
}


@When("Click login button")
public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
}
@Then("Homepage should be displayed")

public void verifyHomepage() {
	
	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	if(displayed) {
		System.out.println("Homepage is displayed");
	}
	else {
		System.out.println("Homepage is not displayed");
	
}

}

@But("Error message should be displayed")
public void verifyErrorMessage() {
	System.out.println("Error message is displayed");

}







}
