package ecommerce2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pets {
	private WebDriver driver;
	private TestCases test;
		
	
	@BeforeClass
		public void launch() throws InterruptedException {
			System.out.println("BeforeClass");
			driver=new ChromeDriver();
			//driver=new SafariDriver();

			//driver.get("https://allpetscompany.com/");
			
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
			
			
		}
		
	@BeforeMethod
		public void login() throws InterruptedException {
			System.out.println("BM");
			

			driver.get("https://allpetscompany.com/");
			test=new TestCases(driver);
			Thread.sleep(10000);
			test.sign_in();

			//Thread.sleep(10000);
			//TestCases test=new TestCases(driver);
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//test.sign_in();
			Thread.sleep(10000);
			test.username("tonis56230@chainds.com");
			test.Password("APC@1234567890101112");
			test.remember();
			test.login(driver);
			//Thread.sleep(5000);
				
		}
		
	@Test(enabled=true,priority=1)
		public void Buynow() throws InterruptedException {
			System.out.println("TEST");

			test=new TestCases(driver);
			Thread.sleep(5000);
			//test.sign_in();
			test.Addtocart();
			Thread.sleep(5000);
			test.product(driver);
			Thread.sleep(10000);
			test.Checkout();
			
			
		}
		
	@Test(enabled=true,priority = 0)
	public void addcart() throws InterruptedException {
		System.out.println("TEST");

		test=new TestCases(driver);
		Thread.sleep(5000);
		//test.sign_in();
		test.Addtocart();
		Thread.sleep(5000);
		test.product(driver);
		Thread.sleep(5000);
		test.cart_view();
		
		
	}
	@AfterMethod()
		public void logout() throws InterruptedException {
			System.out.println("AM");

			test=new TestCases(driver);
			//test.login(driver);
			test.Logout(driver);
			Thread.sleep(5000);
			
			
		}
		
	@AfterClass
		public void afterclasses() throws InterruptedException {
			System.out.println("AC");
			
			driver.quit();
				
		}
		
	
	}
