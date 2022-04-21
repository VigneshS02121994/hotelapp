package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}
	@Before
	public void before() {
		Date d = new Date();
		System.out.println("Start time :"+ d);
	}
	@After
	public void after() {
		Date d = new Date();
		System.out.println("End time :"+ d);
	}
	@Test
	public void tc1() {
		System.out.println("tc1");
	}
}
