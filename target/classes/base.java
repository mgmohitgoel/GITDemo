package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base {

	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver intilizeDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\mgoel\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		/*
		 * if(browserName==("chrome")) >> not used because we can not used value extract from properties
		 */
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_software\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\software\\selenium_software\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if (browserName.equals("ie"))
		{
			
		}

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile()); 
		FileHandler.copy(src, new File("D://" +result+ "screenshot.png"));
		
	} 
	
}






