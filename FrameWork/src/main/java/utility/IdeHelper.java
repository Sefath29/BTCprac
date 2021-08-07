package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdeHelper {
	
	
	
	public static void verifyElement(WebElement element) {
		if(element.isDisplayed()) {
			System.out.println("Yes The Element Is Displayed");
		}else{
			System.out.println("Element Is Not Displayed");
		}
	}
	
	
	public static void click(List<WebElement>elements, WebDriver driver) {
		for(int t = 0; t < elements.size(); t++) {
			elements.get(t).click();
			driver.navigate().back();
		}
	}
	
	
	public static void click(List<WebElement>elements,String text) {
		for(WebElement element  : elements) {
			if ( element.getText().equals(text)) {
				element.click();
				break;
			}
		}
	}
	
	
	
	
	
	

}
