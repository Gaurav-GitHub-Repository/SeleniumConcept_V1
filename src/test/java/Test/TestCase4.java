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

public class TestCase4 extends browserconfig{


	@Description("Verify radio button2")
	@Epic("TC_04")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=2)
	public void functionaltest()
	{
		Dashboard dashbaord = new Dashboard(driver);
		dashbaord.setGender2();
		System.out.println(dashbaord.getGender2());
	}
	@Test(priority=3)
	public void logout()
	{
		driver.quit();
	} 

}
