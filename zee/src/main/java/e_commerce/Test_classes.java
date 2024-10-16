package e_commerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browse.Browser;

public class Test_classes extends Browser{
	
	private WebDriver driver;
	private Amazon amazon;
	
	@Parameters("Browser")
	@BeforeTest
	void openBrowsers(String expectedBrowser) {
	
		driver=openBrowser(expectedBrowser);
	
	
	}
	@BeforeClass(enabled=true)
	public void beforeClass(){
		
		System.out.println("beforeClass");
		
		
		//Amazon amazon=new Amazon(driver);
		//driver=new ChromeDriver();
		//driver.navigate().to("https://www.amazon.in/");
		
		
		
		
		
		//amazon.Login();
		//amazon.create_acc(driver);
		amazon=new Amazon(driver);
		
		
	}
	@BeforeMethod(enabled=true)
	void beforemethod(){
		driver.get("https://www.amazon.in/");
		
		
		//Amazon amazon=new Amazon(driver);
		//amazon.create_acc();
		//driver.navigate().to("https://www.amazon.in/");
		//amazon.open();
		amazon.Login();

		//amazon.open();
	}
	
	@Test
	void test() throws InterruptedException{
		System.out.println("test");
		//Amazon amazon=new Amazon(driver);
		//amazon.Login();
		//amazon.create_acc();
		amazon.Add_cart(driver);
		//amazon.product_name();
		
		
		
		
	
	}
	@Test
	void Buynow() {
		Amazon amazon=new Amazon(driver);
		amazon.Buy_now(driver);
		
	}
	@AfterMethod
	 void aftermethod() {
		System.out.println("aftermethod");
		//Amazon amazon=new Amazon(driver);
		amazon.Logout(driver);
		
	}
	@AfterClass
	 void afterClass() throws InterruptedException {
		System.out.println("afterClass");
		//Amazon amazon=new Amazon(driver);
		Thread.sleep(5000);
		//amazon.quit(driver);
		
	}
	@AfterTest
	void closed() {
		driver.quit();
	}
	
	
		

}
