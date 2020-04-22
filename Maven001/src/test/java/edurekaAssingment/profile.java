package edurekaAssingment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class profile {
	

	
	
	@FindBy(how=How.XPATH,using="//button[@class='dropdown-toggle']//span[@class='user_name']") WebElement prficn;
	@CacheLookup
	@FindBy(how=How.CLASS_NAME,using="dropdown-item") WebElement prfdn;
	@CacheLookup
	

	
	WebDriver driver;

	public profile(WebDriver driver1)
	{
		this.driver=driver1;
	}

	

	public void prficon() throws InterruptedException  {

		prficn.click();
		
		Thread.sleep(2000);	
	}

	public void prfdrpdwn() {
	
		prfdn.click();
		
		
	}
	
}
