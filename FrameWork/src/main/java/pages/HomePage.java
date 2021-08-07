package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.IdeHelper;

public class HomePage {
	WebDriver driver;
	
	//this is constructor
	public HomePage(WebDriver x) {
		driver = x;
	}

	public void HomePageTesting() {
		IdeHelper.verifyElement(driver.findElement(By.id("homepagelogo")));
		IdeHelper.click(driver.findElement(By.id("categories")));
		IdeHelper.click(driver.findElements(By.id("homepage header")));
		IdeHelper.click(driver.findElements(By.xpath("")), "moga");
	}
	
	
	
	
	
	
}
