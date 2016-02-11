package com.tyss.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.tyss.pomRepo.LoginPage;

public class Utility {
	
	public static Logger log;
	public static void captureScreenshot(WebDriver driver, String screenshotName){
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File ("./ScreenShot/"+screenshotName+".png"));
			System.out.println("screen shot captured");
		} catch (Exception e) {
			
			System.out.println("exception while taking screen shot");
				} 
	}

	public static String currentDate(){
		Date date = new Date();
	//	DateFormat dateFormat = new SimpleDateFormat("ddMMyy_HHmmss");
		DateFormat dateFormat = new SimpleDateFormat("dd_MM");
		String  dateValue =dateFormat.format(date);		
		System.out.println("dateValue :"+dateValue);
	//	String newDateFormat = dateValue.replace("/", "_");
	//	System.out.println("New date format : "+newDateFormat);
		return dateValue;
	}
	
	public static String currentTime(){
		Date date = new Date();
	//	DateFormat dateFormat = new SimpleDateFormat("ddMMyy_HHmmss");
		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		String  timeValue =dateFormat.format(date);		
		System.out.println("timeValue :"+timeValue);
	//	String newDateFormat = dateValue.replace("/", "_");
	//	System.out.println("New date format : "+newDateFormat);
		return timeValue;
	}
	
	public static String readConfigPropertiesFile(String key) throws IOException{
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("../Ashi/src/config.properties");
		properties.load(fis);
		String value = properties.getProperty(key);
		return value;
	}
	
	

}
