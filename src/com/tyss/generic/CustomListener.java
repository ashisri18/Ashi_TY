package com.tyss.generic;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener implements IInvokedMethodListener {
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation Method Name : "+method.getTestMethod().getMethodName()+" : Class Name : "+testResult.getTestClass().getName());
		
	}

	
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation Method Name : "+method.getTestMethod().getMethodName()+" : Class Name : "+testResult.getTestClass().getName());
		
	}

}
