package gpspacksealdemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerManagement {
	
	WebDriver driver;
	
	  public CustomerManagement(WebDriver driver)
    {
	   
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
    }
	  
	  
	  @FindBy(xpath="//*[@id=\\\"menu\\\"]/li[5]/a/div[2]")
	  WebElement customerManagement;
	
    @FindBy(css="//*[@id=\\\"menu\\\"]/li[5]/ul/li[1]/a")
	  WebElement addCustomerDetails;
	  
    @FindBy(name="customer_name")
	  WebElement customerName;
    
    @FindBy(xpath="//input[@id='bsValidation2']\")")
	  WebElement customerEmail;
    
    
    @FindBy(name="secondary_email")
	  WebElement customerSecondaryEmail;
    
    @FindBy(name="//input[@placeholder='Mobile Number']")
	  WebElement customerMobileNo;
    
    
    public  void customerManagementDemo(String name,String primaryEmail,String SecondayEmail,String Mbno)
		{
			
  	  customerManagement.click();
  	  addCustomerDetails.click();
  	  customerName.sendKeys(name);
  	  customerEmail.sendKeys(primaryEmail);
  	  customerSecondaryEmail.sendKeys(SecondayEmail);
  	  customerMobileNo.sendKeys(Mbno);
			
		}


}
