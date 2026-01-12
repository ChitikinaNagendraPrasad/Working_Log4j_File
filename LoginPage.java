package com.practice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//Login To Your Account
	
	@FindBy(xpath="//div[@class='login-form']")
	WebElement loginForm;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement loginForm_EmailAddress_TextBox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement loginForm_Password_TextBox;	
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginForm_Login_Button;	
	
	public void loginToYourAccount(String email, String password)
	{
		try
		{
			loginForm_EmailAddress_TextBox.sendKeys(email);
			loginForm_Password_TextBox.sendKeys(password);
			loginForm_Login_Button.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//New User SignUp
	
	@FindBy(xpath="//div[@class='signup-form']")
	WebElement signUpForm;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement signUpForm_Name_TextBox;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement signUpForm_EmailAddress_TextBox;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement signUpForm_SignUp_Button;	
	
	public void newUserSignUp(String name, String email)
	{
		try
		{
			signUpForm_Name_TextBox.sendKeys(email);
			signUpForm_EmailAddress_TextBox.sendKeys(email);
			signUpForm_SignUp_Button.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
