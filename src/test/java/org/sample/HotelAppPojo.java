package org.sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotelAppPojo extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		browserConfigChrome();
		openUrl("http://www.adactin.com/HotelApp/");
		maximizeWindow();
		implicitywait(30);
		//String prtWin = driver.getWindowHandle();
		//System.out.println(prtWin);
		
		
		Pojo1 p1 = new Pojo1();
		inputText(p1.getTxtUser(), "vickys");
	    navigateRefresh();
	    //javaScriptSetAttribute(p1.getTxtUser());
		inputText(p1.getTxtUser(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 1, 0));
		inputText(p1.getTxtpass(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 1, 1));
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\hotel.png");
		click(p1.getBtnclick());
		//Set<String> allwin = driver.getWindowHandles();
		//System.out.println(allwin);
		//List<String> li = new ArrayList<String>(allwin);
		//driver.switchTo().window(li.get(0));
		//System.out.println(driver.getCurrentUrl());
		
		Pojo2 p2 = new Pojo2();
		selectByValue(p2.getElement(), "London");
		selectByIndex(p2.getElement2(), 1);
		selectByVisibleText(p2.getElement3(), "Deluxe");
		selectByIndex(p2.getLocateById(), 2);
		inputText(p2.getLocateById2(), "22/04/2022");
		inputText(p2.getLocateById3(), "25/04/2022");
		selectByIndex(p2.getLocateById4(), 2);
		selectByValue(p2.getLocateById5(), "2");
		click(p2.getLocateById6());
		
		Pojo3 p3 = new Pojo3();
		click(p3.getLocateById7());
		click(p3.getLocateById8());
		
		Pojo4 p4 = new Pojo4();
		inputText(p4.getLocateById9(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 0));
		inputText(p4.getLocateById10(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 1));
		inputText(p4.getLocateById11(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 3, 0));
		inputText(p4.getLocateById12(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 0));
		selectByValue(p4.getLocateById13(), "VISA");
		selectByIndex(p4.getLocateById14(), 3);
		selectByIndex(p4.getLocateById15(), 3);
		inputText(p4.getLocateById16(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 1));
		click(p4.getLocateById17());
		
		Pojo5 p5 = new Pojo5();
		Thread.sleep(5000);
	    click(p5.getLocateById18());
		
	}

}
