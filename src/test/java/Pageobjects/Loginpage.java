package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	@CacheLookup
	WebElement txtsubmit;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement txtlogout;
	
	public void setusername(String uname) {
		txtemail.clear();
		txtemail.sendKeys(uname);
		
	}
	
	public void setpassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		
	}
	
	public void Clicklogin() {
		txtsubmit.click();
	}
	
	public void Clicklogout() {
		txtlogout.click();
	}
	
	
	
	

}
