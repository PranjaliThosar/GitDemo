package gpspacksealdemo.Tests;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {
	
	 WebDriver driver;
	   
		
	   @Test
	    public void Login() throws InterruptedException
	    {
      driver=new ChromeDriver();
		driver.get("https://gpspackseal.in/admin");
		driver.findElement(By.id("inputEmailAddress")).sendKeys("Admin");
		driver.findElement(By.id("inputChoosePassword")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.manage().window().maximize();
		
		
	    
	// Device Management
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//a[@href='https://gpspackseal.in/admin/device/import']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		
		File uploadFile = new File("D:\\Selenium\\PackSeal\\test-output");
		WebElement fileInput=driver.findElement(By.cssSelector("input[type$='file']"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());
		//driver.findElement(By.cssSelector("button[class='btn btn-primary px-4']")).click();
	
	    
		
		// Add Customer
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[5]/a/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("customer_name")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='bsValidation2']")).sendKeys("test@gmail.com");
		driver.findElement(By.name("secondary_email")).sendKeys("test2@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9359021167");
		
		
		//Add CustomerRole Dropdown
		Select objSelect=new Select(driver.findElement(By.cssSelector("select[id='bsValidation4']")));
		objSelect.selectByVisibleText("Customer");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Related Company']")).sendKeys("Codepix");
		driver.findElement(By.xpath("//input[@id='bsValidation6']")).sendKeys("5678dh212");
		driver.findElement(By.id("bsValidation7")).sendKeys("demo");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.name("confirm_password")).sendKeys("123456");
		
		
		//Date calender
		
		driver.findElement(By.id("bsValidation10")).click();
		
		// this will find all matching nodes in calendar		
		List<WebElement> allDates=driver.findElements(By.name("start_date"));
		
		//now we will iterate all values and will capture the text. We will select when date is 28
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/span[29]")).click();
		
		
		driver.findElement(By.id("bsValidation12")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/select/option[3]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/span[11]")).click();
		
		driver.findElement(By.name("address")).sendKeys("Fursungi,Pune");
		driver.findElement(By.name("license_number")).sendKeys("2345698765");
		driver.findElement(By.id("bsValidation15")).sendKeys("Welcome to PackSeal");
		//driver.findElement(By.cssSelector("button[class='btn btn-primary px-4']")).click();
		
		// Add Location

		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[3]/a")).click();
		driver.findElement(By.name("location_port_id")).sendKeys("AB34D9");
		driver.findElement(By.name("location_port_name")).sendKeys("Fursungi");
		
		
	    WebElement e=driver.findElement(By.id("location_address"));
	    e.sendKeys("Fursungi,Pune,Maharashtra,India");
		Actions Act=new Actions(driver);
		Act.click().perform();
		Thread.sleep(1000);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.TAB);
		e.sendKeys(Keys.TAB);
		
		Select objSelect1=new Select(driver.findElement(By.cssSelector("select[id='bsValidation7']")));
		objSelect1.selectByVisibleText("Port");
		
		//Select objSelect2=new Select(driver.findElement(By.xpath("//*[@id=\"roleform\"]/div[7]/span/span[1]/span/span/textarea")));
		//objSelect.selectByVisibleText("Pratik");
		
		
		
		
		//trip management
		//img[@title='Edit Trip']
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[6]/a/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//img[@title='Edit Trip']")).click();
	
	    }

}

