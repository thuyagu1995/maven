package com.Login.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	public static WebDriver driver;
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signinbuton;
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "passwd")
	private WebElement password;
	@FindBy(name = "SubmitLogin")
	private WebElement submitbutton;
	@FindBy(xpath = "(//a[@title='Women'])[1]")
	private WebElement Women;		
	@FindBy(xpath = "(//a[@title='Blouses'])[1]")
	private WebElement blouse;
	@FindBy(xpath = "(//a[@title='Blouse'])[1]")
	private WebElement image;
	@FindBy(xpath = "(//a[@data-field-qty='qty'])[2]")
	private WebElement quantity;
	@FindBy(name = "group_1")
	private WebElement size;
	@FindBy(xpath = "//a[@title='White']")
	private WebElement colour;
	@FindBy(name = "Submit")
	private WebElement addcart;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed1;
	@FindBy(name = "processAddress")
	private WebElement proceed2;
	@FindBy(name = "cgv")
	private WebElement checkbox;
	@FindBy(name = "processCarrier")
	private WebElement shipping;
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;
	public Loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
     this.driver = driver2;
     PageFactory.initElements(driver2, this);
	}
	
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSigninbuton() {
		return signinbuton;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	public WebElement getWomen() {
		return Women;
	}
	public WebElement getBlouse() {
		return blouse;
	}
	public WebElement getImage() {
		return image;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getProceed1() {
		return proceed1;
	}
	public WebElement getProceed2() {
		return proceed2;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getShipping() {
		return shipping;
	}
	public WebElement getPayment() {
		return payment;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	

}
