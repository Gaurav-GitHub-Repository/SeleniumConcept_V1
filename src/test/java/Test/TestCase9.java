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

import Pages.Dashboard1;
import configuration.browserconfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestCase9 extends browserconfig{


	@Description("Verify date picker1")
	@Epic("TC_09")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=2)
	public void functionaltest() throws InterruptedException
	{
		Dashboard1 dashboard1 = new Dashboard1(driver);
		dashboard1.scroll2();
		dashboard1.setDate_Picker1();
		System.out.println(dashboard1.getDate_Picker1());
	}
	@Test(priority=3)
	public void logout()
	{
		driver.quit();
	} 

}
