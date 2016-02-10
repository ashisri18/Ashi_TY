package com.tyss.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommanLib {
	public void waitForPageToLoad(){
		Browser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(wbXpath)));
		}
	
	public void mouseHover(WebElement xpath){
		
		Actions act = new Actions(Browser.driver);
		act.moveToElement(xpath);
		
	}
	public boolean verifyText(WebElement wb,String expectedText){
		boolean flag = false;
		String actValue = wb.getText();
		if(expectedText.equals(actValue)){
			flag = true;
			System.out.println(expectedText+",data is verified =PASS");
		}
		else{
			System.out.println(expectedText+",data is not veirfied =FAIL");
		}
		return flag;
	}

}
