package zee;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement Password;
	
	@FindBy(xpath="//Button[@name='login']")
	private WebElement loginbutton;
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create_Account;
	
	@FindBy(xpath="(//input[@name='firstname'])")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@name='lastname'])")
	private WebElement last_name;
	
	@FindBy(id="day")
	private WebElement days;
	
	@FindBy(id="month")
	private WebElement months;
	
	@FindBy(id="year")
	private WebElement years;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement Email;
	
	@FindBy(id="password_step_input")
	private WebElement new_Password;
	
	@FindBy(xpath="//img[@class='_8idr img']")
	WebElement cancel;
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginButton(WebDriver driver) {
		loginbutton.click();
	}
	
	public void go(WebDriver driver) {
		username.sendKeys("andrew@gmail.com");
		Password.sendKeys("8300455761");
	}
	public void create_acc(WebDriver driver) {
		create_Account.click();
	}
	public void fill_details(WebDriver driver) throws InterruptedException {
		//Alert alt=driver.switchTo().alert();

		firstname.sendKeys("andrew");
		last_name.sendKeys("dsouza");
		
		Select day=new Select(days);
		Select month=new Select(months);
		Select year=new Select(years);
		day.selectByIndex(22);
		month.selectByIndex(8);
		year.selectByValue("1997");
		gender.click();
		Email.sendKeys("andrew@gmail.com");
		new_Password.sendKeys("ALL Black");
		Thread.sleep(5000);
		cancel.click();
	}
}
