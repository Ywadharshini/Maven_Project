package com.testng.annotations;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {

	@BeforeSuite
	public void property() {
		System.out.println("set property");
	}

	@BeforeTest
	public void launch() {
		System.out.println("browser launch");
	}

	@BeforeClass
	public void url_Launch() {
		System.out.println("url launch");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@Test
	public void casual_Dress() {
		System.out.println("Test 1 = causual dress");
	}

	@Test
	public void summer_Dress() {
		System.out.println("Test 2 = summer dress");
	}

	@Test
	public void evening_Dress() {
		System.out.println("Test 3 = evening dress");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void homepage() {
		System.out.println("In home page");
	}

	@AfterTest
	public void quit() {
		System.out.println("browser close");
	}

	@AfterSuite
	public void cookies() {
		System.out.println("cookies deleted");
	}

}
