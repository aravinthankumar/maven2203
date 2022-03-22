package org.pro;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Pro {
	@BeforeClass
	private void beforeClass() {
		System.out.println("before class");
		
	}
	
	@AfterClass
	private void afterClass() {
		//driver.quit();
      System.out.println("after class");
		
	}
	
	@BeforeMethod
	private void beforeMethod() {
		
		//System.out.println(new Date(0));
		System.out.println("before Method");
		
	}
	
	@AfterMethod
	private void afterMethod() {
		
		//System.out.println(new Date(0));
		System.out.println("after method");
		
	}
	
	@Test
	private void test() {
 System.out.println(".........");
	}
	

}
