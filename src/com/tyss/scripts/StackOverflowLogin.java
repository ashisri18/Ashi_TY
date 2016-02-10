package com.tyss.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tyss.generic.Browser;
import com.tyss.generic.Constants;
import com.tyss.generic.Utility;
import com.tyss.pomRepo.HomePage;
import com.tyss.pomRepo.LoginPage;

public class StackOverflowLogin extends Browser {
	
	HomePage home;
	LoginPage login;
	
	@BeforeTest
	public void beforeConfig() throws IOException{
		Browser.getDriver();
		home = new HomePage(driver);
		login = new LoginPage(driver);
	    driver.get(Utility.readConfigPropertiesFile("url"));	
	}
	@Test
	public void login(){
		home.goToLoginPage();
		login.enterEmailId();
		login.enterPassword();
		login.clickLoginButton();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}

}
