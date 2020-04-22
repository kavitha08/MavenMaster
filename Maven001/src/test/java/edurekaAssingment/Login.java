package edurekaAssingment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class Login {
	
	
	@FindBy(linkText="Log In") WebElement login;
	@CacheLookup
	@FindBy(how=How.ID,using="si_popup_email") WebElement username;
	@CacheLookup
	@FindBy(how=How.ID,using="si_popup_passwd") WebElement password;
	@CacheLookup
	@FindBy(how=How.XPATH,using="//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button") WebElement signin;
	@CacheLookup

	
	WebDriver driver;

	public Login(WebDriver driver1)
	{
		this.driver=driver1;
	}

	public void logle() {
		login.click();
		
	}

	public void userle(String uid) throws InterruptedException  {

		username.sendKeys(uid);
		
		username.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);	
	}

	public void paswdle(String pwd) {
	password.sendKeys(pwd);
		password.sendKeys(Keys.ENTER);
		
		
	}
	public void signle() {
		signin.click();
		
	}
}
