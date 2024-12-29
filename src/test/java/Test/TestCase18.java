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

public class TestCase18 extends browserconfig{


	@Description("Verify link2")
	@Epic("TC_18")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 2)
	public void functionaltest() throws InterruptedException 
	{
		//Method to call Dashboard3
		Dashboard3 dashboard3 = new Dashboard3(driver);
		dashboard3.setlink2();
		dashboard3.setlinkinputbox("inputbox1");
		dashboard3.setlinkinputbox2("inputbox2");
		dashboard3.setCheckbox1();
		dashboard3.setCheckbox2();
		dashboard3.setAjaxContent();
		System.out.println(dashboard3.getlink1());
		System.out.println(dashboard3.getlinkinputbox());
		System.out.println(dashboard3.getlinkinputbox2());
		System.out.println(dashboard3.getCheckbox1());
		System.out.println(dashboard3.getCheckbox2());
		System.out.println(dashboard3.getAjaxContent());
	}
	@Test(priority = 3)
	public void logout() 
	{
		driver.quit();
	} 
}
