package org.sample;

import org.base.Base;
import org.locators.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleLaunch extends Base{
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		
		LoginPage login = new LoginPage();
		
		login.getTxtUserName().sendKeys("Mathangi");
		
		login.getTxtPassword().sendKeys("Pran@9909");
		
		login.getBtnLogin().click();
		
	}

}
