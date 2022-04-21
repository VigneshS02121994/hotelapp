package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo5 extends BaseClass {
	
	public Pojo5() {
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBys({
	@FindBy(id="logout"),
	@FindBy(xpath="(//input[@type=\"button\"])[3]")
	})
	private WebElement locateById18;

	public WebElement getLocateById18() {
		return locateById18;
	}
	
	

}
