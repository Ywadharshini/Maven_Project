package com.testng.annotations;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser_Utility implements IRetryAnalyzer {

	int starting_Point = 1;

	int ending_Point = 4;

	@Override
	public boolean retry(ITestResult result) {
		
		if (starting_Point <= ending_Point) {

			starting_Point++;
			
			return true; // It will run the failed test cases until it gets passed
		}
		return false;
	}

}
