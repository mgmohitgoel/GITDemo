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

public class NavigationBar extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void intilize() throws IOException
	{

		driver = intilizeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test

	public void validateNavigation() throws IOException
	{
		
		driver = intilizeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigation().isDisplayed());
		log.info("navigation bar is displayed");
	}
	@AfterTest
	public void browserclose()
	{
		driver.close();
		driver = null;
		}
	
	}

