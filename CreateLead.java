package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcase.BaseClass;

public class CreateLead extends BaseClass {
	
	@Test(dataProvider = "fetchData")
	public void  runCreateLead(String company, String firstName, String lastName, String phNo) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
	}	
	
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String[][] data = new String[2][4];
		
		data[0][0] = "TestLeaf";
		data[0][1] = "Hari";
		data[0][2] = "R";
		data[0][3] = "99";
		
		

		data[1][0] = "TCS";
		data[1][1] = "Sam";
		data[1][2] = "D";
		data[1][3] = "98";
		
		return data;
		

	}
	
		
	
	

}
