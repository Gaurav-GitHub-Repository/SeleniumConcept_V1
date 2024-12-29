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

import Pages.Dashboard;
import configuration.browserconfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestCase1 extends browserconfig{


	@Description("Verify GUI Elements text is present in dashboard")
	@Epic("TC_001")
	@Severity(SeverityLevel.MINOR)
	@Test(priority=2)
	public void functionaltest()
	{
		Dashboard dashboard = new Dashboard(driver);
		dashboard.setGUIElement();
		System.out.println(dashboard.getGUIElement());
	}
	@Test(priority=3)
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
