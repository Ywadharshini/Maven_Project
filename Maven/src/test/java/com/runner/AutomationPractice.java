package com.runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\dr\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

		WebElement signIn_Btn = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		signIn_Btn.click();

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("cts@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("123456");

		WebElement signInBtn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signInBtn.click();

		Thread.sleep(3000);
		
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(dress).build().perform();

		WebElement casualDress = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[2]"));
		casualDress.click();

		Thread.sleep(2000);

		WebElement img = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		Actions b = new Actions(driver);
		b.moveToElement(img).build().perform();

		WebElement quickViewBtn = driver.findElement(By.xpath("//span[text()='Quick view']"));
		quickViewBtn.click();

		WebElement fr = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(fr);

		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qty.click();

		WebElement size = driver.findElement(By.xpath("//select[contains(@class,'select no-print')]"));
		Select s = new Select(size);
		s.selectByValue("2");

		WebElement addToCart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addToCart.click();

		WebElement proceedBtn1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedBtn1.click();

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		WebElement proceedBtn2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		proceedBtn2.click();

		Thread.sleep(2000);

		WebElement proceedbtn3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceedbtn3.click();

		Thread.sleep(2000);

		WebElement terms = driver.findElement(By.xpath("//input[@type='checkbox']"));
		terms.click();

		WebElement proceedBtn4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceedBtn4.click();

		Thread.sleep(2000);

		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank.click();

		Thread.sleep(2000);

		WebElement confrim = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confrim.click();

		WebElement text = driver.findElement(By.xpath("//p[@class='cheque-indent']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", text);

		Thread.sleep(1000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Myorder1.png");
		FileUtils.copyFile(src, des);

		Thread.sleep(2000);

		WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back.click();

		Thread.sleep(2000);

		WebElement text1 = driver.findElement(By.xpath("//h1[text()='Order history']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView()", text1);

		Thread.sleep(1000);

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Myorder2.png");
		FileUtils.copyFile(src1, des1);

		Thread.sleep(2000);

		WebElement dress1 = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(dress1).build().perform();

		WebElement eveningDress = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		eveningDress.click();

		Thread.sleep(2000);

		WebElement img1 = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		Actions b1 = new Actions(driver);
		b1.moveToElement(img1).build().perform();

		WebElement quickViewBtn1 = driver.findElement(By.xpath("//span[text()='Quick view']"));
		quickViewBtn1.click();

		WebElement fr1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(fr1);

		WebElement qty1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qty1.click();

		WebElement size1 = driver.findElement(By.xpath("//select[contains(@class,'select no-print')]"));
		Select s1 = new Select(size1);
		s1.selectByValue("2");

		WebElement addToCart1 = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addToCart1.click();

		WebElement color = driver.findElement(By.xpath("//a[@title='Pink']"));
		color.click();

		WebElement proceedBtn11 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedBtn11.click();

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		WebElement proceedBtn21 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceedBtn21.click();

		Thread.sleep(2000);

		WebElement proceedbtn31 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceedbtn31.click();

		Thread.sleep(2000);

		WebElement terms1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		terms1.click();

		WebElement proceedBtn41 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceedBtn41.click();

		Thread.sleep(2000);

		WebElement bank1 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank1.click();

		Thread.sleep(2000);

		WebElement confrim1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confrim1.click();

		WebElement text11 = driver.findElement(By.xpath("//p[@class='cheque-indent']"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].scrollIntoView()", text11);

		Thread.sleep(1000);

		TakesScreenshot ts12 = (TakesScreenshot) driver;
		File src11 = ts12.getScreenshotAs(OutputType.FILE);
		File des11 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Myorder3.png");
		FileUtils.copyFile(src11, des11);

		Thread.sleep(2000);

		WebElement back1 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back1.click();

		Thread.sleep(2000);

		WebElement text13 = driver.findElement(By.xpath("//h1[text()='Order history']"));
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("arguments[0].scrollIntoView()", text13);

		Thread.sleep(1000);

		TakesScreenshot ts14 = (TakesScreenshot) driver;
		File src12 = ts14.getScreenshotAs(OutputType.FILE);
		File des12 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Myorder4.png");
		FileUtils.copyFile(src12, des12);

		Thread.sleep(2000);

		WebElement dress2 = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(dress2).build().perform();

		WebElement summerDress = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
		summerDress.click();

		Thread.sleep(2000);
		
		WebElement img2 = driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]"));
		Actions b2 = new Actions(driver);
		b2.moveToElement(img2).build().perform();

		WebElement quickViewBtn2 = driver.findElement(By.xpath("(//span[text()='Quick view'])[1]"));
		quickViewBtn2.click();
		
		WebElement fr2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(fr2);

		WebElement qty2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qty2.click();

		WebElement size2 = driver.findElement(By.xpath("//select[contains(@class,'select no-print')]"));
		Select s2 = new Select(size2);
		s2.selectByValue("2");

		WebElement color1 = driver.findElement(By.xpath("//a[@title='Blue']"));
		color1.click();
		
		WebElement addToCart2 = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addToCart2.click();
		
		WebElement proceedBtn111 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedBtn111.click();

		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		
		WebElement proceedBtn211 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceedBtn211.click();

		Thread.sleep(2000);

		WebElement proceedbtn311 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceedbtn311.click();

		Thread.sleep(2000);

		WebElement terms11 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		terms11.click();

		WebElement proceedBtn411 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceedBtn411.click();

		Thread.sleep(2000);

		WebElement bank11 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank11.click();

		Thread.sleep(2000);
		
		WebElement confrim11 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confrim11.click();

		WebElement text111 = driver.findElement(By.xpath("//p[@class='cheque-indent']"));
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("arguments[0].scrollIntoView()", text111);

		Thread.sleep(1000);

		TakesScreenshot ts121 = (TakesScreenshot) driver;
		File src111 = ts121.getScreenshotAs(OutputType.FILE);
		File des111 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Myorder5.png");
		FileUtils.copyFile(src111, des111);

		Thread.sleep(2000);

		WebElement back11 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back11.click();

		Thread.sleep(2000);

		WebElement text131 = driver.findElement(By.xpath("//h1[text()='Order history']"));
		JavascriptExecutor js131 = (JavascriptExecutor) driver;
		js131.executeScript("arguments[0].scrollIntoView()", text131);

		Thread.sleep(1000);

		TakesScreenshot ts141 = (TakesScreenshot) driver;
		File src121 = ts141.getScreenshotAs(OutputType.FILE);
		File des121 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Myorder6.png");
		FileUtils.copyFile(src121, des121);

		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		logout.click();
		
		
		
		
		
		
	}

}
