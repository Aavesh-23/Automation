package zee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft {
	private SoftAssert soft;

	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforeclass");
		
		soft= new SoftAssert();
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
		
	}
	@Test
	public void test() {
		System.out.println("Test");
		String actualURL="facebook.com";
		String expectedURL="facebook/home";
		
		String actualTitle="Home Page";
		String expectedTitle="Home P";
		
		String actualButtonText="Notifications";
		String expectedButtonText="Notifications";
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertEquals(actualButtonText, expectedButtonText);
		
	}
	@Test
	public void Test2() {
		String actualURL="facebook.com";
		String expectedURL="facebook/home";

		String actualTitle="Home Page";
		String expectedTitle="Home P";
		
		String actualButtonText="Notifications";
		String expectedButtonText="Notifications";
		
		soft.assertEquals(actualURL, expectedURL);
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertEquals(actualButtonText, expectedButtonText);
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
		soft.assertAll();

	}
	@AfterClass
	public void Afterclass() {
		System.out.println("after class");
	}

}
