package selenium.plus.three;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
//	If you want to execute the METHOD only once even if you have BEFORE_METHOD and AFTER_METHOD
	@BeforeTest
	public void startServer() {
		System.out.println("\nStarting the Server\n");
	}
	
//	If I want to execute only few test case then pass the parameter "enabled=false" to disable the Test, 
//	to include the test use "enabled = true". By default it is set to true.
	@Test(priority=0,enabled=false)
	public void testcase1() {
		System.out.println("Test Annotation 1");	
	}
	
	@Test(priority=1)
	public void testcase2() {
		System.out.println("Test Annotation 2");	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
}
