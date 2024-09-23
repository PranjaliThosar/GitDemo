package gpspacksealdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripManagement {
	
	WebDriver driver;
	
	  public TripManagement(WebDriver driver)
  {
	   
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
  }
	  
	  
	  @FindBy(xpath="//*[@id=\\\"menu\\\"]/li[6]/a/div[2]")
	  WebElement TripManagement;
}
