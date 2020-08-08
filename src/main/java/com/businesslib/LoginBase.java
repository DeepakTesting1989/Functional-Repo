package com.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginBase {

	WebDriver driver;
	
	public LoginBase(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	By uname = By.id("txtUser");
	By pword = By.id("txtPassword");
	By getcapcha = By.id("imgCapcha");
	By writecapcha = By.id("txtRandno");
	By button = By.id("btnLogon");
//	By ApplicationForm = By.xpath("//span[@class='menu-text']");
//	By CAPApply = By.xpath("//a[contains(text(),'CAF Apply')]");

	public WebElement UserName()
	{
		return driver.findElement(uname);
		//return typeUsername;
	}
	
	public WebElement PassWord()
	{
		return driver.findElement(pword);
		//return typePassword;
	}
	
	public WebElement TakeCaptchaText()
	{
		return driver.findElement(getcapcha);
		//return typeCaptchaText;
	}
	
	public WebElement CaptchaWrite()
	{
		return driver.findElement(writecapcha);
		//return typeCaptcha;
	}
	
	public WebElement ClickLogin()
	{
		
		return driver.findElement(button);
		//return typeSignInButton;
	}
	
//	public WebElement ClickOnApplicationForm()
//	{
//		return driver.findElement(ApplicationForm);
//		//return typeSignInButton;
//	}
//	
//	public WebElement CAPApply()
//	{
//		return driver.findElement(CAPApply);
//		//return typeSignInButton;
//	}
	
	
	
}
