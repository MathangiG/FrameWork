package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver; 
	
	public void getDriveer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	public static void entertext(WebElement element,String data) {

		element.sendKeys(data);

	}
	public void btnClick(WebElement element) {
		element.click();
	}
	
}
