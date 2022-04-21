package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	static Actions actions;
	static Robot robot;
	static Alert alert;
	JavascriptExecutor executor;
	WebDriverWait driverwait;
	Select select;
	Workbook workbook;
	FileInputStream stream;
	Sheet sheet;
	Cell cell;
	Row row;

	public static void browserConfigChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}

	public static WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}

	public static WebElement locateByClass(String className) {
		WebElement findElement = driver.findElement(By.className(className));
		return findElement;
	}

	public static WebElement locateByXpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
	}

	public static WebElement locateName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}

	public static String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		return attribute;
	}

	public static void mouseOverActions(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public static void rightClick(WebElement target) {
		Actions actions = new Actions(driver);
		actions.contextClick(target).perform();
	}

	public static void keyPress(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForeward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	 public static void keyUp(CharSequence key) {
		 Actions actions = new Actions(driver);
	     actions.keyUp(key);
	 }
	 public static void keyDown(CharSequence key) {
		 Actions actions = new Actions(driver);
	     actions.keyDown(key);
	 }
	public static void doubleClick(WebElement target) {
		Actions action = new Actions(driver);
		action.doubleClick(target).perform();
	}

	public static void screenshot(String pathname) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		File d = new File(pathname);
		FileUtils.copyFile(s, d);		
		
		
	}

	public static void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void confirmAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void promptAlert(String keysToSend) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(keysToSend);
		alert.accept();
	}

	public static String getText() {
		String text = alert.getText();
		return text;
	}
	 public static void javaScriptSetAttribute(WebElement element) {
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].setAttribute('value'.' ')",element);
	 }
	 
	 public static void javaScriptGetAttribute(WebElement element) {
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 Object script = executor.executeScript("returnarguments[0].getAttribute('value')", element);
		 System.out.println(script);
		
	}
	 public static void scrollIntowiewUp(WebElement up) {
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", up);
		
	}
	 public static void scrollIntowiewdown(WebElement down) {
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", down);
		
	}
     public static void implicitywait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	
	public static void windowsHandle() {
		String prtWinId = driver.getWindowHandle();
		System.out.println(prtWinId);
	}

	public static void windowHandles() {
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println(allWinId);
	}

	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
	}

	public static void getFirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
	}

	public static void getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	}

	public static void isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
	}

	public static void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public static void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public static void deSelectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public static void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);
	}

	public static void frameId(String Id) {
		driver.switchTo().frame(Id);
	}

	public static void frameWeb(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static void frameParent() {
		driver.switchTo().parentFrame();
	}

	public static void frameDefault() {
		driver.switchTo().defaultContent();
	}

	public static void findElements(String tagName) {
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void getPageSource() {
		driver.getPageSource();
	}

	public static void Close() {
		driver.close();
	}

	public static void Quit() {
		driver.quit();
	}

	public static void switchTo() {
		driver.switchTo();
	}

	public  static String excelRead(String path, String sheet, int rowIndex, int cellindex) throws IOException {
		String value = null;
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet s = workbook.getSheet(sheet);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellindex);
		CellType cellType = c.getCellType();
		System.out.println("celltype :" + cellType);
		switch (cellType) {
		case STRING:
			value = c.getStringCellValue();
			System.out.println(value);
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yy");
				String format = date.format(dateCellValue);
				System.out.println(format);
			} else {
				double d = c.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				value = b.toString();
				System.out.println(value);
			}
			break;
		default:

		}
		return value;

	}

	public static void excelWrite(String path, String sheet, int rowIndex, int cellindex, String value) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet s = workbook.getSheet(sheet);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellindex);
		c.setCellValue(value);
		FileOutputStream fileOut = new FileOutputStream(f);
		workbook.write(fileOut);
	}
}
