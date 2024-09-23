package gpspacksealdemo.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import gpspacksealdemo.TestComponants.BaseTest;
import gpspacksealdemo.pageobjects.LandingPage;

public class ErrorValidation extends BaseTest{

	
	    @Test(groups= {"ErrorHandling"})
		public void loginErrorValidation() throws IOException, InterruptedException
		{
	        landingPage.loginApplication("admin", "12345");
	        Assert.assertEquals("Incorrect email password",landingPage.getErrorMessage());

		}

	
	
}
