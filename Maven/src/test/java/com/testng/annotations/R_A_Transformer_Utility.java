package com.testng.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

//Read analyser Transaformer Utility

public class R_A_Transformer_Utility implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		annotation.setRetryAnalyzer(RetryAnalyser_Utility.class);

		// this is suppose to be
		// @Test (retryAnalyser = RetryAnalyser_Utility.class)
	}

}
