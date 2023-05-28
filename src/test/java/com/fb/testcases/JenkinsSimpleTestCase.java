package com.fb.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JenkinsSimpleTestCase {

	@BeforeSuite

	public void browserLaunch() {
		System.out.println("Launched browser");
	}

	@Test

	public void test1() {
		
		System.out.println("test1");

	}

	@AfterSuite

	public void browserClose() {
		System.out.println("close browser");
	}

}
