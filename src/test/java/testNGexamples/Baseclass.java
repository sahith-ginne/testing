package testNGexamples;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class Baseclass {
	
	
	@BeforeGroups("sanity")
	public void BeforeGroup() {
		System.out.println("inside before group");
	}
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("before test ");
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("before loan test ");
	}
	
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("after cridit card");
		
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("after test ");
	}
	
	
	@AfterGroups("sanity")
	public void afterGroup () {
		System.out.println("inside after group");
	}

}
