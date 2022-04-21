package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends BaseClass  {
	
	public Pojo1() {
		PageFactory.initElements(driver,this);
	}
	//@CacheLookup
	@FindAll({
	@FindBy(id="username"),
	@FindBy(name="username")
	})
	private  WebElement txtUser;
	
	//@CacheLookup
	@FindBys({
	@FindBy(id="password"),
	@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtpass;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="login"),
	@FindBy(name="login")
	})
	private WebElement btnclick;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}
	
	
	
	

}
