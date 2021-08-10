package org.locators;


import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome extends Base{
	
	public AmazonHome() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtSearch;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement btnClick;
	
	@FindBys
	({	
		@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])") 
	 
	})
	private List<WebElement> results;

	public List getResults() {
		return results;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	

}
