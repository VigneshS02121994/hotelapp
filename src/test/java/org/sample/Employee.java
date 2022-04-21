package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("vigneshitvijay@gmail.com");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Vickys@02121994");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
