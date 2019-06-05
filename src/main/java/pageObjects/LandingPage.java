package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By popup=By.xpath("//button[text()='NO THANKS']");
	
	By title = By.cssSelector("#content > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)");
	By navBar = By.cssSelector(".navbar-collapse");
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
		
	}
	public WebElement getNavigation()
	{
		return driver.findElement(navBar);
		
	}

	public int getPopUpSize()
	{
		return driver.findElements(popup).size();
	}
	
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
		
	}
	
}



