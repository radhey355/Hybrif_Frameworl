package com.listnres;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utils.Screenshorts;

public class Mylistners extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Sucess With name:"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case fail with name:"+result.getName());
	String path =	Screenshorts.screen_capture(result.getName());
	test.addScreenCaptureFromPath(path)	;
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test fail with name:"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
	
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
