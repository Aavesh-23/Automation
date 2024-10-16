package Browse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
	
	public static WebDriver launchChromeBrowser() {
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver launchFirefoxBrowser() {
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver launchsafariBrowser() {
		WebDriver driver=new SafariDriver();
		return driver;
	}
	public static WebDriver openBrowser(String target) {
		WebDriver driver=null;
		if(target.equals("Chrome")) {
			//driver=new ChromeDriver();
			driver=Browser.launchChromeBrowser();
			//driver=launchChromeBrowser();
			//driver=Test_classes.launchChromeBrowser();
		}
		if(target.equals("Firefox")) {
			//driver=new FirefoxDriver();
			driver=Browser.launchFirefoxBrowser();
		}
		if(target.equals("Safari"))
		{
			//driver=new SafariDriver();
			
			driver=Browser.launchsafariBrowser();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
}
}
