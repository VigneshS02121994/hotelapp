package org.sample;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelAppJunit extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() throws IOException {
		browserConfigChrome();
		openUrl("http://www.adactin.com/HotelApp/");
		maximizeWindow();
		implicitywait(30);
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\login.png");
		}
	@AfterClass
	public static void afterClass() {
		Close();
	}
	
	@Test
	public void test1() throws IOException {
		Pojo1 p1 = new Pojo1();
		inputText(p1.getTxtUser(), "vickys");
	    navigateRefresh();
		inputText(p1.getTxtUser(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 1, 0));
		inputText(p1.getTxtpass(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 1, 1));
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\Test1.png");
		click(p1.getBtnclick());
		}
	
	@Test
	public void test2() throws IOException {
		Pojo2 p2 = new Pojo2();
		selectByValue(p2.getElement(), "London");
		selectByIndex(p2.getElement2(), 1);
		selectByVisibleText(p2.getElement3(), "Deluxe");
		selectByIndex(p2.getLocateById(), 2);
		inputText(p2.getLocateById2(), "22/04/2022");
		inputText(p2.getLocateById3(), "25/04/2022");
		selectByIndex(p2.getLocateById4(), 2);
		selectByValue(p2.getLocateById5(), "2");
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\Test2.png");
		click(p2.getLocateById6());
		}
	
	@Test
	public void test3() throws IOException {
		Pojo3 p3 = new Pojo3();
		click(p3.getLocateById7());
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\Test3.png");
		click(p3.getLocateById8());
		}
	
	@Test
	public void test4() throws IOException {
		Pojo4 p4 = new Pojo4();
		inputText(p4.getLocateById9(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 0));
		inputText(p4.getLocateById10(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 2, 1));
		inputText(p4.getLocateById11(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 3, 0));
		inputText(p4.getLocateById12(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 0));
		selectByValue(p4.getLocateById13(), "VISA");
		selectByIndex(p4.getLocateById14(), 3);
		selectByIndex(p4.getLocateById15(), 3);
		inputText(p4.getLocateById16(), excelRead("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\Hotelapp.xlsx", "Sheet1", 4, 1));
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\Test4.png");
		click(p4.getLocateById17());
		}
	
	@Test
	public void test5() throws InterruptedException, IOException {
		Pojo5 p5 = new Pojo5();
		Thread.sleep(5000);
		screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\Test5.png");
		 click(p5.getLocateById18());
		 screenshot("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\screenshot\\Test6.png");
	}

}
