package org.sample;

import org.testng.annotations.*;

public class AmazonTestNG {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void tc0() {
		System.out.println("Method 1");
	}
	
	@Test
	public void tc01() {
		System.out.println("Method 2");
	}
	
	@Test
	public void tco2() {
		System.out.println("Method 3");
	}

}
