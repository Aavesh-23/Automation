package e_commerce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {
	
	
		@FindBy(xpath="(//span[text()='Hello, sign in'])[1]")
		private WebElement sign_in;
		
		@FindBy(id="ap_email")
		private WebElement email;
		
		@FindBy(id="ap_password")
		private WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement continue_button; 
		
		//@FindBy(xpath="//a[@class='a-button-text']                 ")
		//private WebElement create_account;
		
		@FindBy(xpath="(//a[text()='Start here.'])[2]")
		private WebElement starthere;
		
		@FindBy(id="twotabsearchtextbox")
		private WebElement search_product;
		
		@FindBy(id="nav-search-submit-button")
		private WebElement search_icon;
		
		@FindBy(xpath="(//button[text()='Add to cart'])[2]")
		private WebElement add_cart_button;
		
		@FindBy(id="nav-cart")
		private WebElement cart_view;
		
		@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[2]")
		private WebElement buy_now;
		
		@FindBy(xpath="//input[@title='Buy Now']")
		private WebElement buy_now_button;
		
		@FindBy(xpath="//span[text()='Sign Out']")
		//@FindBy(xpath="//div[@id='nav-al-your-account']//a[2]")
		private WebElement signout;
		
		@FindBy(xpath="//span[text()='Account & Lists']")
		private WebElement hover;
		
		
		
		
		//Actions act=new Actions(driver);
		
		
		public Amazon(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
		}
		
		public void Login() {
			sign_in.click();
			email.sendKeys("+918329259580");
			continue_button.click();
			
			
			password.sendKeys("Seema@23");
			continue_button.click();

		}
		public void create_acc() {
			starthere.click();
			//create_account.click();
			
		}
		
		public void open() {
			starthere.click();
		}
		
		public void Add_cart(WebDriver driver) throws InterruptedException {
			
			
			search_product.sendKeys("Boat 450 Pro");
			search_icon.click();
			add_cart_button.click();
			Actions act=new Actions(driver);
			act.moveToElement(add_cart_button).click().build().perform();
			Thread.sleep(5000);
			act.moveToElement(cart_view).click().build().perform();
		}
		public void Buy_now(WebDriver driver) {
			
			search_product.sendKeys("Boat 450 Pro");
			search_icon.click();
			Actions act=new Actions(driver);
			act.moveToElement(buy_now).click().build().perform();
			List<String> addr=new ArrayList<String>(driver.getWindowHandles());
			
			String a1=addr.get(0);
			String a2=addr.get(1);
			

			//driver.switchTo().window(a1);
			
			driver.switchTo().window(a2);
			//act.moveToElement(buy_now_button).click().build().perform();
			System.out.println(driver.getWindowHandle());
			
		}
		 public void quit(WebDriver driver) {
			driver.quit();
		}
		public void Logout(WebDriver driver)  {
			Actions act=new Actions(driver);
			act.moveToElement(hover).perform();
			act.moveToElement(signout).click().perform();
			//act.moveToElement(signout).click().build().perform();
			//act.moveToElement(hover).perform();
			//act.moveToElement(signout).pause(5).click().build().perform();

			//signout.click();
		}
		
		
		

}
