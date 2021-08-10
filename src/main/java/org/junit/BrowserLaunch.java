package org.junit;

import org.base.Base;
import org.locators.LoginPage;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends LoginPage{
	
	public static Base base;
	@BeforeClass
	public static void beforeClass() {
		base = new Base();
		base.getDriveer();
		base.getUrl("http://adactinhotelapp.com/");
	}
	
	@Test
	public void tco1() {
		LoginPage login = new LoginPage();
		
		WebElement txtUserName = login.getTxtUserName();
		Base.entertext(txtUserName, "Mathangi");
	}
	
	@AfterClass
	public static void afterClass() {
		//driver.close();
	}

}
