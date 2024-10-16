package zee;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Book {
	
	//private Facebook facebook;
	WebDriver driver;
	//Facebook f=new Facebook(driver);
	
	
	@BeforeMethod
	
	public void beforeMethod() {
		System.out.println("PVR");
	}
	
	@Test(priority=2,enabled=false)
	public void test1233() {
		//System.out.println("setree");
		Facebook f=new Facebook(driver);
		
		f.loginButton(driver);
		
	}
	
	@Test(priority=1,enabled=false)
	public void test420() {
		Facebook f=new Facebook(driver);
		f.go(driver);
		
	}
	@Test(priority=0)
	public void create_acc() throws InterruptedException {
		Facebook f=new Facebook(driver);
		f.create_acc(driver);
		Thread.sleep(5000);
		f.fill_details(driver);
	}
	
	@BeforeClass
	public void beforesClass() {
		
		System.out.println("Capitals");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	
	}
	
	

}
