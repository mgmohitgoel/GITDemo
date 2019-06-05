package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

/*


public class HomePage extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void intilize() throws IOException
	{

		driver = intilizeDriver();
	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password, String text) throws IOException
	{
		
		/*
		 * two ways to access class
		 * first via extends(inheritence)
		 * second via creating object
		 */
/*
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
	//	lp.getEmail().sendKeys("abc@gmail.com");   not hardcoded
	//	lp.getPassword().sendKeys("1234");           not hardcoded
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
	//	System.out.println(text);
		log.info(text);
		
		
		
		lp.getLogin().click();
	}
		
	@AfterTest
	public void browserclose()
	{ 
		driver.close();
		driver = null;  // to clear memory
	}
	
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data = new Object[2][3];
			
			data[0][0] = "nonrestricteduser@gmail.com";
			data[0][1] = "11111";
			data[0][2] = "Non Restricted user";
			
			data[1][0] = "restricteduser@gmail.com";
			data[1][1] = "11111";
			data[1][2] = "Restricted user";
			
			 return data;
			
		}
		
		
	} */

public class HomePage extends base{

public static Logger log = LogManager.getLogger(HomePage.class.getName());


@BeforeTest

public void intilize() throws IOException

{

driver = intilizeDriver();

driver.get(prop.getProperty("url"));

}

@Test(dataProvider="getData")

public void validateHomePage(String Username, String Password, String text) throws IOException

{
/*
LandingPage l = new LandingPage(driver);

l.getLogin().click();

LoginPage lp = new LoginPage(driver);

// lp.getEmail().sendKeys("abc@gmail.com"); not hardcoded

// lp.getPassword().sendKeys("1234"); not hardcoded

lp.getEmail().sendKeys(Username);

lp.getPassword().sendKeys(Password);

// System.out.println(text);

log.info(text);

lp.getLogin().click(); */
//	driver.get(prop.getProperty("url"));
	LandingPage l=new LandingPage(driver);
	l.getLogin().click(); //driver.findElement(By.css()
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(Username);
	lp.getPassword().sendKeys(Password);

	log.info(text);
	
	lp.getLogin().click();
	
}

@AfterTest

public void browserclose()

{

driver.close();

driver = null; // to clear memory

}

@DataProvider

public Object[][] getData() {

Object[][] data = new Object[2][3];

data[0][0] = "nonrestricteduser@gmail.com";

data[0][1] = "11111";

data[0][2] = "Non Restricted user";


data[1][0] = "restricteduser@gmail.com";

data[1][1] = "11111";

data[1][2] = "Restricted user";

return data;

}

}

