package com.tyss.pomRepo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.generic.Constants;
import com.tyss.generic.WebDriverCommanLib;

public class LoginPage {
	
	Logger log=Logger.getLogger(LoginPage.class);
	WebDriverCommanLib comLib = new WebDriverCommanLib();
	
	public LoginPage(WebDriver driver){
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="email")
	private WebElement emailTextBox;
	
	@FindBy (id="password")
	private WebElement passwordTextBox;
	
	@FindBy (id="submit-button")
	private WebElement loginButton;
	
	public void enterEmailId(){
		PropertyConfigurator.configure("../Ashi/src/log4j.properties");
	//	BasicConfigurator.configure();
		emailTextBox.click();
		log.debug("I am in Debug");
		emailTextBox.sendKeys(Constants.Email);
		log.info("Email-ID is entered");
	}
	public void enterPassword(){
		passwordTextBox.click();
		passwordTextBox.sendKeys(Constants.Password);
		log.info("Password is entered");
	}
	public void clickLoginButton(){
		loginButton.click();
		log.fatal("clicked on Login Button.");
		log.info("Hello");
		comLib.waitForPageToLoad();
	}

}
