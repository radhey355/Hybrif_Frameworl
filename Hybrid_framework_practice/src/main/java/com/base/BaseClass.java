package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.Property_read;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass  {
	
	public static WebDriver driver= null;
	public static ExtentReports report=null;
	public static ExtentSparkReporter spark= null;
	public static ExtentTest test= null;
	
	Logger log = Logger.getLogger(BaseClass.class);
	
	public void inetelize() throws Exception {
		
		log.info("Reading Property file for browser");
		String browserName = Property_read.readProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		

		if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(Property_read.readProperty("url"));
	}
	public void report_Init() {
		report= new ExtentReports();
		spark= new ExtentSparkReporter(("user.dir")+"/target/ExtentReport.html");
	    report.attachReporter(spark);
	}
	

}
