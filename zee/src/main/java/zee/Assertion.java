package zee;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforeclass");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
		
	}
	@Test
	public void test() {
		System.out.println("Test");
		
		String actualURL="facebook/home";
		String expectedURl="faceboo/home";
		//Assert.assertEquals(actualURL, expectedURl);
		
		//Assert.assertNotEquals(actualURL, expectedURl);
		
		//boolean result=actualURL.equals(expectedURl);
		//Assert.assertFalse(result);
		//if(actualURL.equals(expectedURl)) {
		//	System.out.println("Pass");
		//}
		//else {
		//	System.out.println("Fail");
		//	Assert.fail();
		//}
		SoftAssert softAssert=new SoftAssert();
		//softAssert.assertEquals(actualURL, expectedURl);
		
		//if(actualURL.equals(expectedURl)) {
		//	System.out.println("Pass");
		//	
		//}else
		//{
		//	System.out.println("Fail");
		//	softAssert.fail();
		//}
		
		Boolean result=actualURL.equals(expectedURl);
		softAssert.assertTrue(result);
		softAssert.assertAll();
	
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("after class");
	}

}
