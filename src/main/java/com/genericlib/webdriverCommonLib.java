package com.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverCommonLib {
	
	
	public void waitForPageLoad()
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitForLinkpresent(String linkNmae, String linkName)
	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
	}
	public void waitForXpathpresent(String xpathName)
	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathName)));
	}


}
