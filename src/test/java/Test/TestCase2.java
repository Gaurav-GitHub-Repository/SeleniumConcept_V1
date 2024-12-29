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

public class TestCase2 extends browserconfig{

	
	@Description("Verify registration form")
	@Epic("TC_02")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=2)
	public void functionaltest()
	{
		Dashboard dashbaord = new Dashboard(driver);
		dashbaord.setName("Gaurav");
		dashbaord.setEmail("abc@gmail.com");
		dashbaord.setPhone("1234567890");
		dashbaord.setAddress("Hyd");
		System.out.println(dashbaord.getName());
		System.out.println(dashbaord.getEmail());
		System.out.println(dashbaord.getPhone());
		System.out.println(dashbaord.getAddress());
	}
	@Test(priority=3)
	public void logout()
	{
		driver.quit();
	}

}
