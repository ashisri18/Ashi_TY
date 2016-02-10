package com.tyss.pomRepo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.generic.WebDriverCommanLib;

public class HomePage  {

	WebDriverCommanLib comLib = new WebDriverCommanLib();
	
	WebDriver driver;
	Logger log = Logger.getLogger(HomePage.class);
	
	//@FindBy (xpath="//div/div/div/span/a[text()='log in']")
	@FindBy(xpath="//a[@href='https://stackoverflow.com/users/login?ssrc=head&returnurl=http%3a%2f%2fstackoverflow.com%2f']")
	private WebElement loginLink;
	
	
	 public HomePage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	
	public void goToLoginPage(){
		comLib.waitForPageToLoad();
		loginLink.click();
		log.info("giobiojb");
	}
}


