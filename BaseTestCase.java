package com.practice.TestCases;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.practice.Utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestCase {

	public static WebDriver driver;
	public static Logger logger = LogManager.getLogger("MyFrameWorkPractice.class");

	ConfigReader configReader = new ConfigReader();

	@BeforeClass
	public void setUp() {
		try {
			switch (configReader.getBrowser().toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				logger.info("Chrome Driver Initiated");
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				logger.info("Edge Driver Initiated");
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				logger.info("Firefox Driver Initiated");
				break;
			}

			driver.manage().window().maximize();
			logger.info("Window Maximized");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			logger.info("Implicit Timeout Set To 5 Seconds");
			driver.get(configReader.getBaseURL());
			String expected_HomePage_Title = "Automation Exercise";
			String actual_HomePage_Title = null;
			actual_HomePage_Title = driver.getTitle();
			Assert.assertEquals(actual_HomePage_Title, expected_HomePage_Title);
			Reporter.log("<BR>Expected Title = " + expected_HomePage_Title);
			Reporter.log("<BR>Actual Title = " + actual_HomePage_Title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		try {
			driver.close();
			logger.info("Driver Closed");
			if (driver != null) {
				driver.quit();
				logger.info("Driver Quit");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void captureScreenshot(WebDriver driver, String fileName) {
		try {
			// C:\SeleniumWorkspace\MyFrameWorkPractice\Screenshots
			String path = System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".png";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File(path);
			FileUtils.copyFile(sourceFile, destinationFile);
		} catch (Exception e) {

		}
	}
}
