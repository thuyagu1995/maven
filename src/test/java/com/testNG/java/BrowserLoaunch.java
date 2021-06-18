package com.testNG.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLoaunch {
	@BeforeSuite
private void browsersetup() {
	System.out.println("set up");
}
	@BeforeTest
private void browser() {
	System.out.println("browser");
}
	@BeforeClass
private void url() {
	System.out.println("amazon");
}
	@BeforeMethod
private void login() {
	System.out.println("login");
}
	@Test
private void iphonesearch() {
	System.out.println("search iphone");
}
	@Test
private void addtocart() {
	System.out.println("add to cart");
}
	@AfterMethod
private void logout() {
	System.out.println("logout");
}
	@AfterClass
private void close() {
	System.out.println("browser close");
}
	@AfterTest
private void verification() {
	System.out.println("verification done");
}
	@AfterSuite
private void coookies() {
	System.out.println("cookies deleted");
} 
}
