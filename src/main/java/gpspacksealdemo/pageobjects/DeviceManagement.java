package gpspacksealdemo.pageobjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviceManagement {
	
	 WebDriver driver;
		
     public DeviceManagement(WebDriver driver)
     {
	   
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
     }
     
     
     @FindBy(xpath="(//div[normalize-space()='Device Management'])[1]")
 	  WebElement deviceManagement;
 	
     @FindBy(xpath="//a[@href='https://gpspackseal.in/admin/device/import']")
 	  WebElement importDevice;
     
     @FindBy(xpath="input[type$='file']")
 	  WebElement fileInput;
     
     
     @FindBy(css="button[class='btn btn-primary px-4']")
 	  WebElement upload;
     
     
     
		//WebElement fileInput=driver.findElement(By.cssSelector("input[type$='file']"));
		//fileInput.sendKeys(uploadFile.getAbsolutePath());
 	
     public  void deviceManagementDemo()
		{
   	    
			deviceManagement.click();
			importDevice.click();
			File uploadFile = new File("D:\\Selenium\\PackSeal\\test-output");
			
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			upload.click();
			
		}
			


}
