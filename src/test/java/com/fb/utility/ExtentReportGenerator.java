package com.fb.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	
	public static ExtentReports generateReport()
	{
		String path="C:\\Users\\Ganesh Dandekar\\eclipse-workspace\\B16E_Framework\\Test_Reports\\LoginFB\\Test_Reports\\LoginFB\\JenkinsIndex.html";		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Facebook WebApplication Framework");
		report.config().setReportName("LoginFBTC001");
		report.config().setTheme(Theme.DARK);		
		ExtentReports extent=new ExtentReports();		
		extent.attachReporter(report);
		extent.setSystemInfo("FacebookFW", "Automation with Selenium-Java");
		extent.setSystemInfo("QA", "XYZ");
		extent.setSystemInfo("O.S.", "Windows");
		return extent;
	}

}
