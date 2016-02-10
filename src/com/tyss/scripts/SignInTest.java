package com.tyss.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tyss.generic.Browser;
import com.tyss.generic.Constants;
import com.tyss.generic.ExcelLib;
import com.tyss.generic.WebDriverCommanLib;

public class SignInTest {
	WebDriverCommanLib wait;
	
	WebDriver driver ;
	
	ExcelLib elib;
	
	
	@Test()
	public void createProject() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait = PageFactory.initElements(Browser.driver, WebDriverCommanLib.class);
		driver = Browser.getDriver();
		
		elib = new ExcelLib();
	
		driver.manage().window().maximize();
		driver.get(Constants.url);
	//	build.selectSignIn();
		wait.waitForPageToLoad();
		//signin.buildshopSignIn(elib.getExcelData("Sheet1", 1, 0),elib.getExcelData("Sheet1", 1, 1));
		//wait.waitForPageToLoad();
		//dashboard.clickManageProject();

	}}
