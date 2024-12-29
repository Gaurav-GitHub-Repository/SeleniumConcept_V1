package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dashboard {

	static WebDriver driver;

	ResuableComponents component = new ResuableComponents();

	//Constructor to assign driver
	public Dashboard(WebDriver driver)
	{
		this.driver=driver;
	}

	//WebElement for selenium, cypress & playwright
	private By Header = By.xpath("//span[text()='For Selenium, Cypress & Playwright']");
	//WebElement for GUI element text
	private By GUIElement = By.xpath("//div[@class='columns-inner']/div[1]/div/div/div/div/div/div/div/div/h3");
	//WebElement for GUI Element name
	private By Name = By.xpath("//input[@id='name']/parent::div/input");
	//WebElement for email
	private By Email_id = By.xpath("//input[@id='email']/parent::div/input[2]");
	//WebElement for phone
	private By Phone = By.xpath("//input[@id='phone']/parent::div/input[3]"); 
	//WebElement for address
	private By Address = By.xpath("//textarea[@id='textarea']/parent::div/textarea");
	//WebElemnt for male radio button1
	private By Gender1 = By.xpath("//input[@id='male' and @name='gender']");
	//WebElemnt for male radio button2
	private By Gender2 = By.xpath("//input[@id='female' and @name='gender']");
	//WebElement for checkbox
	private By NumberOfCheckbox = By.xpath("//div[@class='columns-inner']/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div[1]/label");
	//WebElement for country
	private By Country = By.xpath("//select[@id='country']");
	//WebElement for Colors
	private By Colors = By.xpath("//select[@id='colors']");
	//WebElement for link
	private By link = By.xpath("//a[text()='Posts (Atom)']");
	
	
	//Method to verify header text
	public void setHeader()
	{
		String HeaderText = "For Selenium, Cypress &amp; Playwright']";
		if(driver.findElement(Header).getText().contains(HeaderText))
		{
			System.out.println("Header Text is verified");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Header text is not verified");
			Assert.assertTrue(false);
		}
	}
	//Method to return GUI Element xpath 
	public By getGUIElement()
	{
		return GUIElement;
	}
	//Method to verify GUI element text
	public void setGUIElement()
	{
		String element = driver.findElement(By.xpath("//div[@class='columns-inner']/div[1]/div/div/div/div/div/div/div/div/h3")).getText();
		String expected_value = "GUI Elements"; 

		if(element.equalsIgnoreCase(expected_value))
		{
			System.out.println("GUI Element text is verified");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("GUI Element text is not verified");
			Assert.assertTrue(false);
		}
	}
	//Method to return name xpath
	public By getName()
	{
		return Name;
	}
	//Method to enter name
	public void setName(String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Name));
		driver.findElement(Name).clear();
		driver.findElement(Name).sendKeys(value);
		System.out.println("Name is entered");
	}
	//Method to return email xpath
	public By getEmail()
	{
		return Email_id;
	}
	//Method to enter email
	public void setEmail(String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Email_id));
		driver.findElement(Email_id).clear();
		driver.findElement(Email_id).sendKeys(value);
		System.out.println("Email id is entered");
	}
	//Method to return phone xpath
	public By getPhone()
	{
		return Phone;
	}
	//Method to enter phone
	public void setPhone(String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Phone));
		driver.findElement(Phone).clear();
		driver.findElement(Phone).sendKeys(value);
		System.out.println("Phone number is entered");
	}
	//Method to return address xpath
	public By getAddress()
	{
		return Address;
	}
	//Method to enter address
	public void setAddress(String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Address));
		driver.findElement(Address).clear();
		driver.findElement(Address).sendKeys(value);
	}
	public By getGender1()
	{
		return Gender1;
	}
	public void setGender1()
	{
		boolean button1 = driver.findElement(Gender1).isDisplayed();
		if(button1==true)
		{
			driver.findElement(Gender1).click();
			System.out.println("Radio button1 is selected");
		}
		else
		{
			System.out.println("Radio button1 is not selected");
		}
	}
	public By getGender2()
	{
		return Gender2;
	}
	public void setGender2()
	{
		boolean button1 = driver.findElement(Gender2).isDisplayed();
		if(button1==true)
		{
			driver.findElement(Gender2).click();
			System.out.println("Radio button2 is selected");
		}
		else
		{
			System.out.println("Radio button2 is not selected");
		}
	}
	//Method to scroll
	public void scroll()
	{
		component.scroll(driver);
	}
	//Method to return checkbox xpath
	public By getNumberOfCheckbox()
	{
		return NumberOfCheckbox;
	}
	//Method to select checkbox
	public void setNumberOfCheckbox()
	{
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='columns-inner']/div/div/div/div/div/div/div/div/div/div[2]/div[4]"));
		for(int i=1; i<=7; i++)
		{
			//driver.findElement(By.xpath("//div[@class='columns-inner']/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div["+i+"]/input")).click();
			driver.findElement(By.xpath("//div[@class='columns-inner']/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div["+i+"]/label")).click();
			if(i==7)
			{
				System.out.println("Checkbox is selected");
				break;
			}
		}
	}
	//Method to return dropdown xpath
	public By getCountry()
	{
		return Country;
	}
	//Method to select country dropdown
	public void setCountry()
	{
		//WebElement for country
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(dropdown);
		List<WebElement> var = select.getOptions();
		for(WebElement value:var)
		{
			if(value.getText().contains("India"))
			{
				select.selectByVisibleText("India");
				System.out.println("Dropdown is selected and verified");
				break;
			}
		}
	}
	//Method to return color xpath
	public By getColors()
	{
		return Colors;
	}
	//Method to select form colour
	public void setColors()
	{
		WebElement color = driver.findElement(By.xpath("//select[@id='colors']")); 
		Select select = new Select(color);
		List<WebElement> var = select.getOptions();
		for(WebElement value:var)
		{
			System.out.println(value.getText());
			break;
		}
	}
	public void scroll2()
	{
		component.scroll2(driver);
	}
	//Method to return link xpath
	public By getlink()
	{
		return link;
	}
	//Method to click on link
	public void setlink()
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(link));
			driver.findElement(link).click();
		}
		catch(TimeoutException e)
		{
			System.out.println("Timeout Exception Occured");
		}
	}

}
