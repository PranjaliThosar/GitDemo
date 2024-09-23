package gpspacksealdemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
    public LandingPage(WebDriver driver)
    {
	   
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
}
    
    
   @FindBy(id="inputEmailAddress")
	WebElement userEmail;
	
	@FindBy(id="inputChoosePassword")
	WebElement userPassword;
	
	@FindBy(css="button[type='submit']")
	WebElement submit;
	
	
	public String loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		submit.click();
	
		return null;
	}

	

	public void goTo()
	{
		driver.get("https://gpspackseal.in/admin");
	}
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}


}
