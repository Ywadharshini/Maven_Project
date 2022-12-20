package com.utilityfiles;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_Files {

	public static WebDriver driver;

	public static WebDriver browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Project_Cucumber\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Driver\\operadriver.exe");

			driver = new OperaDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geeko.driver",
					"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Driver\\edgedriver.exe");

			driver = new FirefoxDriver();
		}

		return driver;
	}

	public static void url_Launch(String url) {
		driver.get(url);
	}

	public static void click_On_Element(WebElement element) {
		element.click();
	}

	public static void send_Keys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clear_Element(WebElement element) {
		element.clear();
	}

	public static void sleep(long millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}

	public static String get_Attribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public static String get_Title() {
		String title = driver.getTitle();
		return title;
	}

	public static String get_Currenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String get_Text(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String get_Tagname(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	public static Point get_Location(WebElement element) {
		Point location = element.getLocation();
		return location;
	}

	public static Dimension get_Size(WebElement element) {
		Dimension size = element.getSize();
		return size;
	}

	public static String pageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public static String css_Value(WebElement element, String propertyName) {
		String cssValue = element.getCssValue(propertyName);
		return cssValue;
	}

	public static void getRectangle(WebElement element) {
		Rectangle rect = element.getRect();
		System.out.println("Height of the email Element : " + rect.getHeight());
		System.out.println("Width of the email Element : " + rect.getWidth());
		System.out.println("X axis of the email Element : " + rect.getX());
		System.out.println("y axis of the email Element : " + rect.getY());
	}

	public static boolean element_Enabled(WebElement element) {
		boolean enable = element.isEnabled();
		return enable;
	}

	public static boolean element_Displayed(WebElement element) {
		boolean display = element.isDisplayed();
		return display;
	}

	public static boolean element_Selected(WebElement element) {
		boolean select = element.isSelected();
		return select;
	}

	public static boolean element_Multiple(WebElement element) {
		Select s = new Select(element);
		boolean select = s.isMultiple();
		return select;
	}

	public static void navigation_Commands(String commands) {
		if (commands.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else if (commands.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (commands.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}
	}

	public static void manage_Commands(String commands) {
		if (commands.equalsIgnoreCase("maximize")) {
			driver.manage().window().maximize();
		} else if (commands.equalsIgnoreCase("minimize")) {
			driver.manage().window().minimize();
		} else if (commands.equalsIgnoreCase("fullscreen")) {
			driver.manage().window().fullscreen();
		}
	}

	public static void action(WebElement element, String s) {
		Actions a = new Actions(driver);
		if (s.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (s.equalsIgnoreCase("context click")) {
			a.contextClick(element).build().perform();
		} else if (s.equalsIgnoreCase("double click")) {
			a.doubleClick(element).build().perform();
		} else if (s.equalsIgnoreCase("move to element")) {
			a.moveToElement(element).build().perform();
		}

	}

	public static void waits(String option, long millisec) {
		if (option.equalsIgnoreCase("implicit wait")) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(millisec));
		} else if (option.equalsIgnoreCase("explict wait")) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(millisec));
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} else if (option.equalsIgnoreCase("page Load")) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(millisec));
		} else if (option.equalsIgnoreCase("fluent wait")) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(millisec))
					.pollingEvery(Duration.ofSeconds(millisec)).ignoring(NoSuchElementException.class);

		}

	}

	public static void dragDrop(WebElement drag, WebElement drop) {
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop);
	}

	public static void dropDown(WebElement element, String option, String input) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(input);
		} else if (option.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(input);
		} else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		}

	}

	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> li = s.getOptions();

		// for loop
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}

		// for each loop
		/*
		 * for (WebElement option : li) { System.out.println(option.getText()); }
		 */
	}

	public static void allOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> li = s.getAllSelectedOptions();

		// for loop
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}

		// for each loop
		/*
		 * for (WebElement option : li) { System.out.println(option.getText()); }
		 */
	}

	public static String firstSelected(WebElement element) {
		Select s = new Select(element);
		String text = s.getFirstSelectedOption().getText();
		return text;

	}

	public static void alert(String commands) {
		if (commands.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (commands.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}

	}

	public static void frame(WebElement element, String Option) {
		if (Option.equalsIgnoreCase("frame")) {
			driver.switchTo().frame(element);
		} else if (Option.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
		} else if (Option.equalsIgnoreCase("web page")) {
			driver.switchTo().defaultContent();
		}

	}

	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void robot() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void close() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static String particular_Cell_Date(String path, int sheetIndex, int rowIndex, int cellIndex)
			throws IOException {

		String value = null;

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheetIndex);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();
			// System.out.println(value);

		} else if (type.equals(CellType.NUMERIC)) {

			double d = c.getNumericCellValue();
			// double to int
			int a = (int) d;
			// int to string
			value = String.valueOf(a);
			// System.out.println(value);
		}
		wb.close();

		return value;

	}

	public static String[][] get_All_Data(String path) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int lastRowNum = s.getLastRowNum();

		int physicalNumberOfRows = s.getPhysicalNumberOfRows();

		System.out.println(physicalNumberOfRows);

		System.out.println(lastRowNum);

		short lastCellNum = s.getRow(0).getLastCellNum();

		System.out.println(lastCellNum);

		String[][] data = new String[lastRowNum][lastCellNum];

		for (int i = 1; i <= lastRowNum; i++) {

			Row row = s.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {

				Cell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				data[i - 1][j] = value;

			}

			wb.close();
		}
		return data;
	}
	
	

}
