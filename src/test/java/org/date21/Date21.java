package org.date21;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Date21 extends BaseClass  {
	
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
		Date d =new Date();
		System.out.println(d);
		System.out.println("before Method");
		
	}
	
	@AfterMethod
	private void afterMethod() {
		Date d =new Date();
		System.out.println(d);
		System.out.println("after method");
		
	}
	
	
	
	@Test(invocationCount = 5)
	private void test2() {
 System.out.println("test case 2");
	}
	
	
	@Test
	private void test3() {
 System.out.println("test hi case 3");
	}
	
	

}
