package org.sample;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit2 extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserConfigChrome();
		openUrl("http://www.adactin.com/HotelApp/");
		maximizeWindow();
	}
	@AfterClass
	public static void afterClass() {
		Close();
	}
	@Before
	public void before() {
		Date d = new Date();
		System.out.println("start time:" + d);
	}
	@After
	public void after() {
		Date d = new Date();
		System.out.println("End time:" + d);
	}
	@Test
	public void tc1() throws IOException {
		WebElement txtUser = locateById("username");
		inputText(txtUser,excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx","Sheet1",1,0));
		WebElement txtPass = locateById("password");
		inputText(txtPass, excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx","Sheet1",1,1));
		WebElement btnClick = locateById("login");
		click(btnClick);	
	}
	@Test
	public void tc2() throws IOException {
		WebElement element = locateById("location");
		selectByValue(element, "London");
		WebElement element2 = locateById("hotels");
		selectByIndex(element2, 1);
		WebElement element3 = locateById("room_type");
		selectByVisibleText(element3, "Deluxe");
		WebElement locateById = locateById("room_nos");
		selectByIndex(locateById, 2);
		WebElement locateById2 = locateById("datepick_in");
		inputText(locateById2, "18/04/2022");
		WebElement locateById3 = locateById("datepick_out");
		inputText(locateById3, "28/04/2022");
		WebElement locateById4 = locateById("adult_room");
		selectByIndex(locateById4, 2);
		WebElement locateById5 = locateById("child_room");
		selectByValue(locateById5, "2");
		WebElement locateById6 = locateById("Submit");
		click(locateById6);
		}
	@Test
	public void tc3() {
		WebElement locateById7 = locateById("radiobutton_0");
		click(locateById7);
		WebElement locateById8 = locateById("continue");
		click(locateById8);
		}
	@Test
	public void tc4() throws IOException {
		WebElement locateById9 = locateById("first_name");
		inputText(locateById9, excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 0));
	    WebElement locateById10 = locateById("last_name");
		inputText(locateById10, excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 1));
		WebElement locateById11 = locateById("address");
		inputText(locateById11, excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 3, 0));
		WebElement locateById12 = locateById("cc_num");
		inputText(locateById12, excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 0));
		WebElement locateById13 = locateById("cc_type");
		selectByValue(locateById13, "VISA");
		WebElement locateById14 = locateById("cc_exp_month");
		selectByIndex(locateById14, 3);
		WebElement locateById15 = locateById("cc_exp_year");
		selectByIndex(locateById15, 3);
		WebElement locateById16 = locateById("cc_cvv");
		inputText(locateById16, excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 1));
		WebElement locateById17 = locateById("book_now");
		click(locateById17);
		
	}
	@Test
	public void tc5() throws InterruptedException {
		Thread.sleep(5000);
		WebElement locateById18 = locateById("logout");
		click(locateById18);
		}
}
