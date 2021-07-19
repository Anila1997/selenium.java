package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	@When("Click on {string} link")
	public void ClickLink(String locatorValue ) {
		driver.findElement(By.linkText(locatorValue)).click();
		
		
		

	}

}
