package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//protected static final int j = 0;
	public static WebDriver driver;
	public static WebDriver chromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;	
	}
	public static void urlLounch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Windows maximum and UrlLounch ");

	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("implicite wait");
		
	}
	public static void sendkeys(WebElement e, String value){
		e.sendKeys(value);
		System.out.println("senkeys value");
	
	}
	public static void sendkeysValue(WebElement e,String value, Keys pass){
		e.sendKeys(value,pass);
		System.out.printf("senkeys value");
	
	}

	
	public static void findElemenys(char i,String path) {
		List<WebElement> findElements = driver.findElements(By.xpath(path));
		WebElement webElement = findElements.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
	}
	
	public static void click(WebElement e) {
		e.click();
		System.out.println("click webelement");
		 
	 }
	public static void windowsHandling() {
	
		String windowHandle = driver.getWindowHandle();
System.out.println(windowHandle);

Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);
for (String string : windowHandles) {
	
	if(!windowHandle.equals(string)) {
		
		driver.switchTo().window(string);
		System.out.println("Windows Handling");
	}  }}
	
	
	public static void upAndDown(WebElement e,boolean Boolean) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('Boolean')", e);

		
   }
	public static void getAttribute(WebElement e,WebElement value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object A1 = js.executeScript("reture arguments[0].setAttribute('value')", e);
		String a=(String)A1;
		System.out.println(a);
	}
	
	
	public static void insertValue(WebElement e,String value,int index) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("reture arguments[index].setAttribute('value')", e);
	}

	public static void Screenshor() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		Scanner s = new Scanner(System.in);
		
		 String next = s.next();
		 File neFile = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\scnshot"+next+".png");
		FileUtils.copyFile(screenshotAs, neFile);
		s.close();
		
		System.out.println("Take ScreenShot");
		
	}
	
	public static void dropDown(WebElement e,int index) {
		
		Select s = new Select(e);
		
		s.selectByIndex(index);
		System.out.println("dropdown");
	}
	
	public static void enter() throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
public static void pressCopy() throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
}

public static void pressCut() throws AWTException {
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);
}

public static void releaseCopyAndCut() throws AWTException {
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}

	public static void action(WebElement e,WebElement value,WebElement value1) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(value).perform();
		a.contextClick().perform();
		a.doubleClick().perform();
		a.dragAndDrop(value, value1).perform();
		
		System.out.println("action");
		
	}
	
    public static void alertDismiss(WebElement e) {
    	
     Alert alert = driver.switchTo().alert();
     System.out.println(alert.getText());
     alert.dismiss();
	}
	
    public static void alertaccept(WebElement e) {
    	
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
public static void alertGetText(WebElement e) {
    	
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.getText();
	
	
}
public static void alertsendKeys(WebElement e,String WebElement) {
	
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.sendKeys(WebElement);



}
	
	}
