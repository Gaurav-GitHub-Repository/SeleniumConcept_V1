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

import Pages.Dashboard2;
import configuration.browserconfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class TestCase13 extends browserconfig{

	@Description("Verify static webtable")
	@Epic("TC_13")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=2)
	public void functionaltest() throws InterruptedException
	{
		Dashboard2 dashboard2 = new Dashboard2(driver);
		dashboard2.scroll3();
		dashboard2.setWebtable();
		System.out.println(dashboard2.getWebtable());
	}
	@Test(priority=3)
	public void logout()
	{
		driver.quit();
	} 
}
