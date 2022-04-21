package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends BaseClass {
	
	public Pojo2() {
		PageFactory.initElements(driver,this);
	}
	
	//@CacheLookup
	@FindAll({
	@FindBy(name="location"),
	@FindBy(id="location")
	})
	private WebElement element;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="hotels"),	
	@FindBy(name="hotels")	
	})
	private WebElement element2;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="room_type")	,
	@FindBy(name="room_type")
	})
	private WebElement element3;
	
	//@CacheLookup
	@FindAll({
	@FindBy(name="room_nos"),
	@FindBy(id="room_nos")
	})
	private WebElement locateById;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="datepick_in"),
	@FindBy(name="datepick_in")
	})
	private WebElement locateById2;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="datepick_out"),
	@FindBy(name="datepick_out")
	})
	private WebElement locateById3;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="adult_room"),
	@FindBy(name="adult_room")
	})
	private WebElement locateById4;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="child_room"),
	@FindBy(name="child_room")
	})
	private WebElement locateById5;
	
	//@CacheLookup
	@FindAll({
	@FindBy(id="Submit"),
	@FindBy(name="Submit")
	})
	private WebElement locateById6;

	public WebElement getElement() {
		return element;
	}

	public WebElement getElement2() {
		return element2;
	}

	public WebElement getElement3() {
		return element3;
	}

	public WebElement getLocateById() {
		return locateById;
	}

	public WebElement getLocateById2() {
		return locateById2;
	}

	public WebElement getLocateById3() {
		return locateById3;
	}

	public WebElement getLocateById4() {
		return locateById4;
	}

	public WebElement getLocateById5() {
		return locateById5;
	}

	public WebElement getLocateById6() {
		return locateById6;
	}
	
	

}
