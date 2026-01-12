package com.practice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver ldriver;
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement singupOrLogin_Link;
	
	public void click_singupOrLogin_Link()
	{
		try
		{
			singupOrLogin_Link.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}