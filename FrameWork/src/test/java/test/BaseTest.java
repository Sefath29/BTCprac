package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/sefathhossain/Desktop/");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
	}

}
