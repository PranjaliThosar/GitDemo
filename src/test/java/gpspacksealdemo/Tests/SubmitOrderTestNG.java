package gpspacksealdemo.Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import gpspacksealdemo.TestComponants.BaseTest;
import gpspacksealdemo.pageobjects.LandingPage;

public class SubmitOrderTestNG extends BaseTest {
	
	public void SubmitOrder() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		LandingPage landingpage=new LandingPage(driver);
		landingpage.goTo();
		landingpage.loginApplication("admin", "123456");
	
}
	
}
