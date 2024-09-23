package gpspacksealdemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reports {
	
	WebDriver driver;
	
	  public Reports(WebDriver driver)
  {
	   
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
  }
	  
	  @FindBy(xpath="//*[@id=\"menu\"]/li[7]/a/div[2]")
	  WebElement onClick;
	  

	  @FindBy(xpath="//a[@href='https://gpspackseal.in/admin/reports/trip-reports']")
	  WebElement onClickTripReport;
	  
	  @FindBy(xpath="//span[@id='select2-trip_id-container']")
	  WebElement Tripdetail;
	  
	  @FindBy(xpath="//button[contains(@type,'button')]")
	  WebElement TripdetailFilterButton;
	  
	//button[contains(@type,'button')]
	  
	  //span[@id='select2-trip_id-container']
	  public void getReportDisplay()
	  {
		  onClick.click();
		  onClickTripReport.click();
		  Select objSelectReport=new Select(Tripdetail);
		  objSelectReport.selectByVisibleText("YTZYR45");
		  TripdetailFilterButton.click();
		  
	  }
	 


}
