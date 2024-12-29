package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard3 {

	ResuableComponents component = new ResuableComponents();
	
	static WebDriver driver;
	
	//Constructor to assign driver
	public Dashboard3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//WebElement for form1
	private By Form1 = By.xpath("//div[@id='HTML6']/div/div/div/input[@name='input1']");
	//WebElement for form2
	private By Form2 = By.xpath("//div[@id='HTML6']/div/div/div[2]/input[@id='input2']");
	//WebElement for form3
	private By Form3 = By.xpath("//div[@id='HTML6']/div/div/div[3]/input[@id='input3']");
	//WebElement for button1
	private By Button1 = By.xpath("//div[@id='HTML6']/div/div/div[1]/button");
	//WebElement for button2
	private By Button2 = By.xpath("//div[@id='HTML6']/div/div/div[2]/button");
	//WebElement for button3
	private By Button3 = By.xpath("//div[@id='HTML6']/div/div/div[3]/button");
	//WebElement to toggle input box2
	private By button_inputbox2 = By.xpath("//button[text()='Toggle Input Box 2']");
	//WebElement for input box2
	private By inputbox2 = By.xpath("//div[@id='container']/input[2]");
	//WebElement for input box1
	private By inputbox1 = By.xpath("//div[@id='container']/input[1]");
	//WebElement for checkbox1
	private By checkbox1 = By.xpath("//input[@id='checkbox1' and @type='checkbox']");
	//WebElement for toggle checkbox2
	private By button_checkbox2 = By.xpath("//button[text()='Toggle Checkbox 2']");
	//WebElement for checkbox2
	private By checkbox2 = By.xpath("//input[@type='checkbox' and @id='checkbox2']");
	//WebElement for load ajax button
	private By button_load = By.xpath("//button[text()='Load AJAX Content']");
	//WebElement for ajax content
	private By ajaxcontent = By.xpath("//div[@id='ajaxContent']/p");
	//WebElement for footer link
	private By link1 = By.linkText("Home");
	//WebElement for hidden element link
	private By link2 = By.linkText("Hidden Elements & AJAX");
	//WebElement for download file link3
	private By link3 = By.linkText("Download Files");
	//WebElement for textbox
	private By textbox = By.xpath("//textarea[@id='inputText']/parent::div/textarea");
	//WebElement for text file button
	private By textfile_button = By.xpath("//button[text()='Generate and Download Text File']");
	//WebElement to generate textfile link
	private By textfile_link = By.linkText("Download Text File");
	//WebElement to generate pdf file button
	private By PDFfile_button = By.xpath("//button[text()='Generate and Download PDF File']");
	//WebElement for download pdf file
	private By DownloadPDF_button = By.xpath("//button[text()='Download PDF File']");
	//WebElement for download pdf file link
	private By downloadpdf_link = By.xpath("//a[@id='pdfDownloadLink']");
	
	
	//Method to return link2 xpath
	public By getlink2()
	{
		return link2;
	}
	//Method to click on link2
	public void setlink2()
	{
		WebElement FooterLink = driver.findElement(By.xpath("//div[@class='foot section']/div[2]/h2"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", FooterLink);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(link2));
		driver.findElement(link2).click();
	}	
	//Method to return inputbox1 xpath
	public By getlinkinputbox()
	{
		return inputbox1;
	}
	//Method to enter input box1
	public void setlinkinputbox(String value)
	{
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(inputbox1));
		driver.findElement(inputbox1).clear();
		driver.findElement(inputbox1).sendKeys(value);
		System.out.println("inputbox1 is verified");
	}
	//Method to return inputbox2 xpath
	public By getlinkinputbox2()
	{
		return inputbox2;
	}
	//Method to enter input box2
	public void setlinkinputbox2(String value)
	{
		driver.findElement(button_inputbox2).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(inputbox2));
		driver.findElement(inputbox2).clear();
		driver.findElement(inputbox2).sendKeys(value);
		System.out.println("inputbox2 is verified");
	}
	//Method to return checkbox1 xpath
	public By getCheckbox1()
	{
		return checkbox1;
	}
	//Method to click on checkbox1
	public void setCheckbox1()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkbox1));
		driver.findElement(checkbox1).click();
		boolean Checkbox1 = driver.findElement(checkbox1).isDisplayed();
		if(Checkbox1==true)
		{
			System.out.println("Checkbox1 is verified");
		}
		else
		{
			System.out.println("Checkbox1 is not verified");
		}
	}
	//Method to return checkbox2 xpath
	public By getCheckbox2()
	{
		return checkbox2;
	}
	//Method to click on checkbox2
	public void setCheckbox2()
	{
		driver.findElement(button_checkbox2).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkbox2));
		driver.findElement(checkbox2).click();
		boolean Checkbox2 = driver.findElement(checkbox2).isDisplayed();
		if(Checkbox2==true)
		{
			System.out.println("Checkbox2 is verified");
		}
		else
		{
			System.out.println("Checkbox2 is not verified");
		}
	}
	//Method to return ajax content xpath
	public By getAjaxContent()
	{
		return ajaxcontent;
	}
	//Method to click on load ajax button
	public void setAjaxContent()
	{
		driver.findElement(button_load).click();
		By AjaxContent = By.xpath("//div[@id='ajaxContent']/p");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AjaxContent));
		if(driver.findElement(AjaxContent).getText().contains("This is some dynamic content loaded through AJAX."))
		{
			System.out.println("Ajax content is verified");
		}
		else
		{
			System.out.println("Ajax content is not verified");
		}
	}
	//Method to return link3 xpath
	public By getlink3()
	{
		return link3;
	}
	//Method to click on download file footer link
	public void setlink3()
	{
		driver.findElement(link3).click();
	}
	//Method to return ajax download file
	public By getAjaxdownloadfile()
	{
		return textbox;
	}
	//Method to enter textbox
	public void setAjaxdownloadfile(String value)
	{
		//Enter textbox
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(textbox));
		driver.findElement(textbox).clear();
		driver.findElement(textbox).sendKeys(value);
		//Click on text file button
		driver.findElement(textfile_button).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(textfile_link));
		driver.findElement(textfile_link).click();
		System.out.println("Text file is downloaded");
	}
	//Method to return download file xpath
	public By getAjaxdownloadfile1()
	{
		return downloadpdf_link;
	}
	//Method to click on generate and download PDF file
	public void setAjaxdownloadfile1()
	{
		//Generate PDF file
		driver.findElement(PDFfile_button).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(downloadpdf_link));
		driver.findElement(downloadpdf_link).click();
		System.out.println("PDF file is downloaded");
	}
	//Method to return DownloadPDF_button xpath
	public By getAjaxdownloadfile2()
	{
		return DownloadPDF_button;
	}
	//Method to click on download pdf file with browser
	public void setAjaxdownloadfile2()
	{
		//Generate PDF file with browser
		driver.findElement(DownloadPDF_button).click();
		System.out.println("PDF file with browser");
	}
	//Method to return link1 xpath
	public By getlink1()
	{
		return link1;
	}
	//Method to click on link1
	public void setlink1() throws InterruptedException
	{
		WebElement FooterLink = driver.findElement(By.xpath("//div[@class='foot section']/div[2]/h2"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", FooterLink);
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(link1));
			driver.findElement(link1).click();
			if(driver.getTitle().equalsIgnoreCase("Automation Testing Practice"))
			{
				System.out.println("Page is verified");
			}
			else
			{
				System.out.println("Page is not verified");
			}
		}
		catch(TimeoutException e)
		{
			System.out.println("TimeoutException Occured");
		}
	}
	//Method to return form1 xpath
	public By getForm1()
	{
		return Form1;
	}
	//Method to enter form1 
	public void setForm1(String value)
	{
		WebElement Form = driver.findElement(By.xpath("//div[@class='foot section' and @id='footer-2-1']/div[1]/h2"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Form);
		
		WebElement Section1 = driver.findElement(By.xpath("//div[@class='foot section' and @id='footer-2-1']/div[1]/div/div/div[1]/h4"));		
		if(Section1.getText().equals("Section 1"))
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Form1));
			driver.findElement(Form1).clear();
			driver.findElement(Form1).sendKeys(value);
			driver.findElement(Button1).click();
			System.out.println("Form1 is entered");
		}
		else
		{
			System.out.println("Form1 is not entered");
		}		
	}
	//Method to return form2 xpath
	public By getForm2()
	{
		return Form2;
	}
	//Method to enter form2
	public void setForm2(String value)
	{
		WebElement Section2 = driver.findElement(By.xpath("//div[@class='foot section' and @id='footer-2-1']/div[1]/div/div/div[2]/h4"));
		if(Section2.getText().equals("Section 2"))
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Form2));
			driver.findElement(Form2).clear();
			driver.findElement(Form2).sendKeys(value);
			driver.findElement(Button2).click();
			System.out.println("Form2 is entered");
		}
		else
		{
			System.out.println("Form2 is not entered");
		}		
	}
	//Method to return form3 xpath
	public By getForm3()
	{
		return Form3;
	}
	//Method to enter form3
	public void setForm3(String value)
	{
		WebElement Section3 = driver.findElement(By.xpath("//div[@class='foot section' and @id='footer-2-1']/div[1]/div/div/div[3]/h4"));
		if(Section3.getText().equals("Section 3"))
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Form3));
			driver.findElement(Form2).clear();
			driver.findElement(Form3).sendKeys(value);
			driver.findElement(Button3).click();
			System.out.println("Form3 is entered");
		}
		else
		{
			System.out.println("Form3 is not entered");
		}		
	}
}
