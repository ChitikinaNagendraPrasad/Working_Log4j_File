package com.practice.TestCases;

import java.awt.Desktop;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Rough {

	@Test
	public void abcd()
	{
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("MyReportFile.html");
		extentReports.attachReporter(extentSparkReporter);
		
		ExtentTest test = null;
		
		test = extentReports.createTest("MyTest")
		.log(Status.INFO, "My Test Case First Step")
		.log(Status.INFO, MarkupHelper.createLabel("This is a label", ExtentColor.RED));	
		
		extentReports.flush();
	}
}
