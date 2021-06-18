package com.baseclass.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	
	
	public static WebDriver brouserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Gokul Rajamani\\eclipse-workspace\\selinumWorkout\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
				System.out.println("Invalid Browser");
			}
		driver.manage().window().maximize();
		return driver;
		}
//
	public static void geturl(String url) {
		driver.get(url);		
	}
	//
	public static void navigateforward() {
		driver.navigate().forward();
			}
	//
	public static void navigateback() {
		driver.navigate().back();
	}
	//
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	//
	public static void navigatRefresh(String url) {
		driver.navigate().refresh();
	}
	//
	public static void closecurrentpage() {
		driver.close();
	}
	//
	public static void closeoAllwebpage() {
		driver.quit();
	} 
	//
	public static void getAttributevalue(WebElement element,String value) {
 String attribute = element.getAttribute(value);
System.out.println("attribute value is " + attribute);
		}
	//
	public static void gettext(WebElement element) {
		 String attribute = element.getText();
		System.out.println("attribute value is " + attribute);
				}
	//
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is  " + currentUrl );
	}
	//
	public static void gettitle() {
		String pagetitle = driver.getTitle();
		System.out.println("Page title is " + pagetitle);		
	}
	//
public static void clickonaelement(WebElement element){
	element.click();
	}
//
public static void sendvalues(WebElement element,String values) {
	element.sendKeys(values);
}
//
public static void movemouse(WebElement element) {
	Actions name = new Actions(driver);
	name.moveToElement(element).build().perform();  	
} 
//
public static void rightclick(WebElement element) {
	Actions name = new Actions(driver);
	name.moveToElement(element).contextClick(element).build().perform();
}
//
public static void mousenormalclick (WebElement element) {
	Actions name = new Actions(driver);
	name.moveToElement(element).click().build().perform();
	}
//
public static void elementisDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	System.out.println("element is displayed  " + displayed);
} 
//
public static void elementisEnabled(WebElement element) {
	boolean enabled = element.isEnabled();
	System.out.println("element is Enabled  " + enabled);
} 
//
public static void elementisSelected(WebElement element) {
	boolean selected = element.isEnabled();
	System.out.println("element is selected  " + selected);
}  
//
public static void simpleAlert() {
	Alert simplealert = driver.switchTo().alert();
	simplealert.accept();	
}
//
public static void confirmAlertAccept() {
	Alert simplealert = driver.switchTo().alert();
	simplealert.accept();	
}
//
public static void confirmAlertdismiss() {
	Alert simplealert = driver.switchTo().alert();
	simplealert.dismiss();
	}
//
public static void promptAlertaccept(String value) {
	Alert simplealert = driver.switchTo().alert();
	simplealert.sendKeys(value);
	simplealert.accept();
	}
//
public static void promptAlertDismiss(String value) {
	Alert simplealert = driver.switchTo().alert();
	simplealert.sendKeys(value);
	simplealert.dismiss();
}
//
public static void singleframe(WebElement element1) {
	driver.switchTo().frame(element1);
}
//
public static void Ckeckbox(WebElement element) {
	element.click();
}
//
public static void takescreenshot (String location) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(location);
	FileUtils.copyFile(source, destination);
} 
//
public static void getallselectedoptions(Select name) {
	List<WebElement> allSelectedOptions = name.getAllSelectedOptions();
    for (WebElement allselectedoption : allSelectedOptions) {
    	System.out.println(allselectedoption.getText());	
	}
    }  
//	
public static void getfirstselected(Select name) {
		WebElement firstSelectedOption = name.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());		
	}
//
	public static void getoptionsinmultipledropedown(Select name) {
		List<WebElement> alloptions = name.getOptions();
		 for (WebElement webElement : alloptions) {
			 System.out.println(webElement.getText());
			 }
	}
	//
	public static void multipledropdown(Select name,int a,int b ,int c) {
		List<WebElement> alloptions = name.getOptions();
		 int size = alloptions.size();
			for (int i = 0; i <=size; i++) {
				if (i==a||i==b||i==c) {
					name.selectByIndex(i);					}		
			}		
	}
	///
	public static void checkelemmentismultiple(Select name) {
		boolean multiple = name.isMultiple();
		System.out.println("the element "+ multiple);
		}
	//
	public static void sizeofmultipledropdown(Select name) {
		List<WebElement> alloptions = name.getOptions();
		 int size = alloptions.size();
		 System.out.println("size of the multiple drop down is  " + size);
	}
	//
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	//
	public static void robotonekeydown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
	public static void robotonekeyup() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);	
	}
	public static void robotkeyenter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
	//
	public static void singledropdownbyvalue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	//
	public static void singledropdownbyvisibletext(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	//
	public static void singledropdownbyindex(WebElement element,int a) {
		Select s = new Select(element);
		s.selectByIndex(a);
	}	
	
	
}
	
	
	
	





