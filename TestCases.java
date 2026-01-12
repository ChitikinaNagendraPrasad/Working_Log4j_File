package com.practice.TestCases;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mystore.utilities.ExtentListenerClass;
import com.practice.PageObjects.HomePage;
import com.practice.PageObjects.LoginPage;
import com.practice.PageObjects.SignupPage;

public class TestCases extends BaseTestCase implements ITestListener{
	
	@Test
	public void testCase_001()
	{
		String expected_HomePage_Title="Automation Exercise";
		String actual_HomePage_Title=null;
		try
		{		
			HomePage homePage = new HomePage(driver);
			homePage.click_singupOrLogin_Link();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCase_002()
	{

		try
		{		
			HomePage homePage = new HomePage(driver);
			homePage.click_singupOrLogin_Link();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCase_003()
	{
		String expected_HomePage_Title="Automation Exercise";
		String actual_HomePage_Title=null;
		try
		{		
			HomePage homePage = new HomePage(driver);
			homePage.click_singupOrLogin_Link();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCase_004()
	{
		String expected_HomePage_Title="Automation Exercise";
		String actual_HomePage_Title=null;
		try
		{		
			HomePage homePage = new HomePage(driver);
			homePage.click_singupOrLogin_Link();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
