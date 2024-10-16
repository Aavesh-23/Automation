package ecommerce2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases {
	@FindBy(xpath="//a[@data-target='login-panel']")
	private WebElement sign_in;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username_textbox;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Remember me']")
	private WebElement remember;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement Login;
	
	@FindBy(xpath="(//div//a)[15]")
	private WebElement Account;
	
	@FindBy(xpath="(//a[text()='Logout'])[1]")
	private WebElement signout;
	
	@FindBy(xpath="(//a[text()='GIFTS'])[1]")
	private WebElement Gifts;
	
	@FindBy(xpath="(//a[@rel='nofollow'])[3]")
	private WebElement card;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement add;
	
	@FindBy(xpath="(//div[@class='hamburger-box'])[5]")
	private WebElement cancel;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//a[text()='View cart']")
	private WebElement view_cart;
	
	public TestCases(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void sign_in() {
		sign_in.click();
		
	}
	public void username(String username) {
		username_textbox.sendKeys(username);
		
	}
	public void Password(String Password) {
		password.sendKeys(Password);
		
	}
	public void remember() {
		remember.click();
	}
	public void login(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(Login).click().perform();;
		//Login.click();
	}
	public void Logout(WebDriver driver) throws InterruptedException {
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		//Account.click();
		
		//signout.click();
		act.moveToElement(Account).moveToElement(signout).pause(5).click().build().perform();
		//act.moveToElement(Account).perform();
		//Thread.sleep(5000);
		//act.moveToElement(Account).perform();
		//Thread.sleep(5000);
		//act.moveToElement(signout).click().perform();
	}
	public void Addtocart() {
		Gifts.click();
		
	}
	public void product(WebDriver driver) throws InterruptedException  {
		Actions actions=new Actions(driver);
		
		actions.moveToElement(card).click().pause(5).perform();
		
		Thread.sleep(5000);
		actions.moveToElement(add).click().perform();
		
		Thread.sleep(3000);
		cancel.click();
		
	}
	public void Checkout() {
		checkout.click();
	}
	
	public void cart_view() {
		view_cart.click();
	}

}
