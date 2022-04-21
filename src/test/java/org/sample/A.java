package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A extends BaseClass {
	public static void main(String[] args) throws IOException {
		A a = new A();
		a.browserConfigChrome();
		a.openUrl("http://www.adactin.com/HotelApp/");
		a.maximizeWindow();
		a.implicitywait(30);
		WebElement txtUser = a.locateById("username");
		a.inputText(txtUser,a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx","Sheet1",1,0));
		//a.inputText(txtUser, "VICKYS02121994");
		WebElement txtPass = a.locateById("password");
		a.inputText(txtPass, a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx","Sheet1", 1, 1));
		WebElement btnClick = a.locateById("login");
		a.click(btnClick);
		WebElement element = a.locateById("location");
		a.selectByValue(element, "London");
		WebElement element2 = a.locateById("hotels");
		a.selectByIndex(element2, 1);
		WebElement element3 = a.locateById("room_type");
		a.selectByVisibleText(element3, "Deluxe");
		WebElement locateById = a.locateById("room_nos");
		a.selectByIndex(locateById, 2);
		WebElement locateById2 = a.locateById("datepick_in");
		a.inputText(locateById2, "15/04/2022");
		WebElement locateById3 = a.locateById("datepick_out");
		a.inputText(locateById3, "20/04/2022");
		WebElement locateById4 = a.locateById("adult_room");
		a.selectByIndex(locateById4, 2);
		WebElement locateById5 = a.locateById("child_room");
		a.selectByValue(locateById5, "2");
		WebElement locateById6 = a.locateById("Submit");
		a.click(locateById6);
		WebElement locateById7 = a.locateById("radiobutton_0");
		a.click(locateById7);
		WebElement locateById8 = a.locateById("continue");
		a.click(locateById8);
		WebElement locateById9 = a.locateById("first_name");
		a.inputText(locateById9, a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 0));
		//a.inputText(locateById9, "vignesh");
		WebElement locateById10 = a.locateById("last_name");
		a.inputText(locateById10, a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 1));
		WebElement locateById11 = a.locateById("address");
		a.inputText(locateById11, a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 3, 0));
		WebElement locateById12 = a.locateById("cc_num");
		a.inputText(locateById12, a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 0));
		WebElement locateById13 = a.locateById("cc_type");
		a.selectByValue(locateById13, "VISA");
		WebElement locateById14 = a.locateById("cc_exp_month");
		a.selectByIndex(locateById14, 3);
		WebElement locateById15 = a.locateById("cc_exp_year");
		a.selectByIndex(locateById15, 3);
		WebElement locateById16 = a.locateById("cc_cvv");
		a.inputText(locateById16, a.excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 1));
		WebElement locateById17 = a.locateById("book_now");
		a.click(locateById17);
		WebElement locateById18 = a.locateById("logout");
		a.click(locateById18);
		
		
		
		
		

}
}