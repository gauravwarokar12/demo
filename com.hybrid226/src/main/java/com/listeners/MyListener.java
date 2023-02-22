package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utility.DriverUtility;

public class MyListener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Testcase passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Testcase failed");
		String path=DriverUtility.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Testcase skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}
	

}
