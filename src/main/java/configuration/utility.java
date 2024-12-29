package configuration;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class utility implements ITestListener{

	WebDriver driver;

	public void onTestStart(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.STARTED)
		{
			System.out.println("onTestStart success");
		}
		else
		{
			System.out.println("onTestStart failed");
		}
	}
	//@Attachment
	public void onTestFailure(ITestResult result, WebDriver driver1) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("onTestFailure success");
		}
		else
		{
			System.out.println("onTestFailure failed");
		}	
	}
	public void onTestSkipped(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.SKIP)
		{
			System.out.println("onTestSkipped success");
		}
		else
		{
			System.out.println("onTestSkipped failed");
		}
	}	
}
