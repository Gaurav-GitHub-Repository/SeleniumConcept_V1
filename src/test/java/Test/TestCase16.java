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
import Pages.Dashboard3;
import configuration.browserconfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestCase16 extends browserconfig{

	
	@Description("Verify form")
	@Epic("TC_16")
	@Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void functionaltest() throws InterruptedException
    {
    	Dashboard3 dashboard3 = new Dashboard3(driver);
    	dashboard3.setForm1("Form1");
    	dashboard3.setForm2("Form2");
    	dashboard3.setForm3("Form3");
    	System.out.println(dashboard3.getForm1());
    	System.out.println(dashboard3.getForm2());
    	System.out.println(dashboard3.getForm3());
    }
    @Test(priority = 3)
    public void logout() 
    {
        driver.quit();
    } 
}
