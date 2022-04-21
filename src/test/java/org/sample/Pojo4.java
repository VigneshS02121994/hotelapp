package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends BaseClass {
	
	public Pojo4() {
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindAll({
	@FindBy(id="first_name"),
	@FindBy(xpath="//input[@name='first_name']")
	})
	private WebElement locateById9;
	
	@CacheLookup
	@FindAll({
	@FindBy(id="last_name"),
	@FindBy(xpath="//input[@name='last_name']")
	})
	private WebElement locateById10;
	
	@CacheLookup
	@FindAll({
	@FindBy(id="address"),
	@FindBy(xpath="//textarea[@name='address']")
	})
	private WebElement locateById11;
	
	@CacheLookup
	@FindAll({
	@FindBy(id="cc_num"),
	@FindBy(xpath="//input[@name='cc_num']")
	})
	private WebElement locateById12;
	
	@CacheLookup
	@FindAll({
	@FindBy(id="cc_type"),
	@FindBy(name="cc_type")
	})
	private WebElement locateById13;
	
	@CacheLookup
	@FindAll({
	@FindBy(id="cc_exp_month"),
	@FindBy(name="cc_exp_month")
	})
	private WebElement locateById14;
	
	@CacheLookup
	@FindBys({
	@FindBy(id="cc_exp_year"),
	@FindBy(xpath="//select[@name='cc_exp_year']")
	})
	private WebElement locateById15;
	
	@CacheLookup
	@FindBys({
	@FindBy(id="cc_cvv"),
	@FindBy(xpath="//input[@name='cc_cvv']")
	})
	private WebElement locateById16;
	
	@CacheLookup
	@FindAll({
	@FindBy(name="book_now"),
	@FindBy(id="book_now")
	})
	private WebElement locateById17;

	public WebElement getLocateById9() {
		return locateById9;
	}

	public WebElement getLocateById10() {
		return locateById10;
	}

	public WebElement getLocateById11() {
		return locateById11;
	}

	public WebElement getLocateById12() {
		return locateById12;
	}

	public WebElement getLocateById13() {
		return locateById13;
	}

	public WebElement getLocateById14() {
		return locateById14;
	}

	public WebElement getLocateById15() {
		return locateById15;
	}

	public WebElement getLocateById16() {
		return locateById16;
	}

	public WebElement getLocateById17() {
		return locateById17;
	}
	
	
	
	

}
