package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends BaseClass {
	
	public Pojo3() {
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBys({
	@FindBy(id="radiobutton_0"),
	@FindBy(xpath="//input[@name='radiobutton_0']")
	})
	private WebElement locateById7;
	
	@CacheLookup
	@FindBys({
	@FindBy(id="continue"),
	@FindBy(xpath="//input[@type='submit']")
	})
	private WebElement locateById8;

	public WebElement getLocateById7() {
		return locateById7;
	}

	public WebElement getLocateById8() {
		return locateById8;
	} 
	
	
	

}
