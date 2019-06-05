package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class stepDefination extends base
{

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable
	{
		driver = intilizeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable 
	{
		driver.get(arg1);  
	}

	@Given("^Click on login link in home page to land on secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable 
	{
		LandingPage l=new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		l.getLogin().click();	
	}

	
	@When("^user enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
      	lp.getLogin().click();
	}
	 @And("^close browser$")
	    public void close_browser() throws Throwable {
	     driver.quit();
	     }
	
	
	@Then("^verify user is successfully logged in$")
	public void verify_user_is_successfully_logged_in() throws Throwable 
	{
	 
		PortalHomePage p = new PortalHomePage(driver);
		Assert.assertTrue(p.getSearch().isDisplayed());
	}

	
}
