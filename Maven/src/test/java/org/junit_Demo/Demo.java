package org.junit_Demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Demo {
	
	@AfterEach
	public  void logout() {
		System.out.println("logout");
	}
	
	@BeforeEach
	public  void login() {
		System.out.println("login");
	}
	
	@BeforeAll
	public static void url() {
		System.out.println("launch url");
	}
	
	@AfterAll
	public static void quit() {
		System.out.println("close browser");
	}

	@Test
	public void casual() {
		System.out.println("casual");
	}
	
	@Test
	public void dress() {
		System.out.println("dress");
	}
	
	@Test
	public void evening() {
		System.out.println("evening");
	}
}
