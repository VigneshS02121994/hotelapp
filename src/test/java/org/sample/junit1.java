package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junit1 {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Browser configuration and launch...");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("close Browser..");
	}
	@Before
	public void before() {
		Date d = new Date();
		System.out.println("Start time:"+ d);

	}
	@After
	public void after() {
	   Date d = new Date();
	   System.out.println("End time:"+ d);
	}
	@Test
	public void tc3() {
		System.out.println("TC3....");
	}
	@Test
	public void tc1() {
		System.out.println("TC1....");
	}
	@Ignore
	@Test
	public void tc2() {
		System.out.println("TC2....");
	}
	
	
	

}
