package com.browserlaunch.java;

import org.openqa.selenium.WebDriver;
import com.Login.java.Loginpage;
import com.baseclass.java.Baseclass;

public class Broserlaunch extends Baseclass { 
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = brouserlaunch("chrome");
		geturl("http://automationpractice.com/index.php");
		Loginpage lp = new Loginpage(driver);
		mousenormalclick(lp.getSigninbuton());
		sendvalues(lp.getEmail(), "thiyagurajamani1995@gmail.com");
		sendvalues(lp.getPassword(), "T1995");
		clickonaelement(lp.getSubmitbutton());
		movemouse(lp.getWomen());
		mousenormalclick(lp.getBlouse());
		mousenormalclick(lp.getImage());
		mousenormalclick(lp.getQuantity());
		singledropdownbyvalue(lp.getSize(), "2");
		mousenormalclick(lp.getColour());
		clickonaelement(lp.getAddcart());
		clickonaelement(lp.getProceed());
		clickonaelement(lp.getProceed1());
		clickonaelement(lp.getProceed2());
		Ckeckbox(lp.getCheckbox());
		clickonaelement(lp.getShipping());
		clickonaelement(lp.getPayment());
		clickonaelement(lp.getConfirm());
		takescreenshot("C:\\Users\\Gokul Rajamani\\eclipse-workspace\\selinumWorkout\\screenshot\\shot.png");
		
		
		
	}

}
