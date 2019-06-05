package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class ValidateTitle extends base{

	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void intilize() throws IOException
	{

		driver = intilizeDriver();
		log.info("driver is intilize");
		
		driver.get(prop.getProperty("url"));

		log.info("navigated to home page");
	}
	
	@Test

	public void basePageNavigation() throws IOException
	{
		
		driver = intilizeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");

		log.info("successfully validated title");
		
	}
		
	@AfterTest
	public void browserclose()
	{
		driver.close();
		driver = null;
	}
	
	}

