package ecommerce2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClasses {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://allpetscompany.com/");
		
		TestCases test=new TestCases(driver);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		test.sign_in();
		Thread.sleep(10000);
		test.username("tonis56230@chainds.com");
		test.Password("APC@1234567890101112");
		test.remember();
		test.login(driver);
		Thread.sleep(5000);
		test.Logout(driver);
		Thread.sleep(5000);
		test.Addtocart();
		Thread.sleep(5000);
		test.product(driver);
		test.Checkout();
	}

}
