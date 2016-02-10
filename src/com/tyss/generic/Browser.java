package com.tyss.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
public static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if(Constants.browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\MyProject\\crm\\BuildShop\\resources\\exes\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		else if(Constants.browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:\\MyProject\\crm\\BuildShop\\src\\test\\resources\\exes\\chromedriver.exe");	
				driver = new ChromeDriver();
				}
		else{
				driver = new FirefoxDriver();
			}
		return driver;
		
	}

}

