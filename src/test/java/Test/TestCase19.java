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

import Pages.Dashboard3;
import configuration.browserconfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestCase19 extends browserconfig{

	
	@Description("Verify link3")
	@Epic("TC_18")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=2)
	public void functionaltest() throws InterruptedException 
	{
		//Method to call Dashboard3
		Dashboard3 dashboard3 = new Dashboard3(driver);
		dashboard3.setlink3();
		dashboard3.setAjaxdownloadfile("Text");
		dashboard3.setAjaxdownloadfile1();
		dashboard3.setAjaxdownloadfile2();
		System.out.println(dashboard3.getlink3());
		System.out.println(dashboard3.getAjaxdownloadfile());
		System.out.println(dashboard3.getAjaxdownloadfile1());
		System.out.println(dashboard3.getAjaxdownloadfile2());
	}
	@Test(priority=3)
	public void logout() 
	{
		driver.quit();
	} 
}
