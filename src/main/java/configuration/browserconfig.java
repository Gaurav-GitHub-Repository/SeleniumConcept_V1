package configuration;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(utility.class)
public class browserconfig {

	protected static WebDriver driver;

	final String URL = "https://testautomationpractice.blogspot.com/";
	
	@Parameters({"browser"})
	@Test(priority=1)
	public void setup(String browser) throws MalformedURLException
	{
		if(browser.equalsIgnoreCase("GoogleChrome"))
		{
			ChromeOptions option = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse-Selenium 13-07-2024\\eclipse-java\\Selenium_Concept\\drivers\\Chrome_V131\\chromedriver.exe");
			//option.addArguments("--headless");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		if(browser.equalsIgnoreCase("MozillaFirefox"))
		{
			FirefoxOptions option = new FirefoxOptions();
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse-Selenium 13-07-2024\\eclipse-java\\Selenium_Concept\\drivers\\geckodriver.exe");
			//option.addArguments("--headless");
			driver = new FirefoxDriver(option);
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		if(browser.equalsIgnoreCase("MicrosoftEdge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Eclipse-Selenium 13-07-2024\\eclipse-java\\Selenium_Concept\\drivers\\msedgedriver.exe");
			//option.addArguments("--setHeadless");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("Browser is not launched");
		}
	}
}
