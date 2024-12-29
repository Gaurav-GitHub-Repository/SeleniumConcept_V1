package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Dashboard4;
import configuration.browserconfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestCase27 extends browserconfig{

	
	@Description("Verify mouse hover element")
	@Epic("TC_27")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=2)
	public void functionaltest() throws InterruptedException 
	{
		//Method to call Dashboard4
		Dashboard4 dashboard4 = new Dashboard4(driver);
		dashboard4.setMouseHover();
		System.out.println(dashboard4.getMouseHover());
	}
	@Test(priority=3)
	public void logout() 
	{
		driver.quit();
	} 
}
