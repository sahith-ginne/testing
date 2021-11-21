package testNGexamples;

import org.testng.annotations.Test;


public class Testcase1 extends Baseclass{
	
//	@org.testng.annotations.BeforeTest
//	public void BeforeTest() {
//		System.out.println("before test ");
//	}
//	
//	@org.testng.annotations.BeforeMethod
//	public void BeforeMethod() {
//		System.out.println("before loan test ");
//	}
//	
	@Test(priority = 0 , description = "this is loan test")
	public void LoanTest() {
		System.out.println("inside loan test");
	}
	 
	@Test(priority = 1)
	public void criditcard( ) {
		System.out.println("inside cridit card");
	}
	
//	@org.testng.annotations.AfterMethod
//	public void AfterMethod() {
//		System.out.println("after cridit card");
//		
//	}
//	
//	@org.testng.annotations.AfterTest
//	public void AfterTest() {
//		System.out.println("after test ");
//	}
	

}
