package org.junit;

import org.base.Base;
import org.locators.LoginPage;
import org.openqa.selenium.WebElement;

public class Launch extends Base{
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void tc01() {
		System.out.println("Test 01");
	}
}
