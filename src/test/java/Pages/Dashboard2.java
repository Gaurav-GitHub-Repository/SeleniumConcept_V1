package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard2 {

	ResuableComponents component = new ResuableComponents();
	
	static WebDriver driver;
	
	//Constructor to assign driver
	public Dashboard2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//WebElement for static table
	private By table = By.xpath("//table[@name='BookTable']");
	//WebElement for dynamic webtable
	private By table1 = By.xpath("//table[@id='taskTable']");
	//WebElement for pagination webtable values
	private By PaginationWebtable = By.xpath("//div[@class='table-container']/table/tbody");
	
	//Method to return static webtable xpath
	public By getWebtable()
	{
		return table;
	}
	//Method to retrieve webtable values
	public void setWebtable()
	{
		int row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		int coloumn = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
		for(int r=2;r<=row;r++)
		{
			for(int c=1;c<=coloumn;c++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText());
			}
		}
	}
	//Method to return dynamic webtable xpath
	public By getDynamicWebtable()
	{
		return table1;
	}
	//Method to retrieve dynamic webtable values
	public void setDynamicWebtable()
	{
	
		int NumberofRows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr")).size();
		int NumberofColoumns = driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr[1]/th")).size();
			
		for(int r=1;r<=NumberofRows+1;r++)
		{
			for(int c=2;c<=NumberofColoumns;c++)
			{
				//System.out.println(driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr["+r+"]/td["+c+"]")).getText());
				WebElement row = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr["+r+"]/td["+c+"]"));
				//System.out.println(row.getText());
				if(r==1)
				{
					if(row.getText().contains("0.4 Mbps") || row.getText().contains("76.8 MB") || row.getText().contains("9.1%") || row.getText().contains("0.94 MB/s"))
					{
						System.out.println(row.getText());
					}
					else
					{
						System.out.println("System info does not contains");
						break;
					}
				}
				else if(r==2)
				{
					if(row.getText().contains("3.2 Mbps") || row.getText().contains("59.5 MB") || row.getText().contains("7.0%") || row.getText().contains("0.16 MB/s"))
					{
						System.out.println(row.getText());
					}
					else
					{
						System.out.println("System info does not contains in chrome");
						break;
					}
				}
				else if(r==3)
				{
					if(row.getText().contains("1.7 Mbps") || row.getText().contains("71.2 MB") || row.getText().contains("4.1%") || row.getText().contains("0.54 MB/s"))
					{
						System.out.println(row.getText());
					}
					else
					{
						System.out.println("System info does not contains in firefox");
						break;
					}
				}
				else if(r==4)
				{
					if(row.getText().contains("3.3 Mbps") || row.getText().contains("58.4 MB") || row.getText().contains("1.1%") || row.getText().contains("0.43 MB/s"))
					{
						System.out.println(row.getText());
					}
					else
					{
						System.out.println("System info does not contains in internet explorer");
						break;
					}
				}
				else
				{
					System.out.println("Invalid");
				}
			}
		}
	}
	
	//Method to scroll
	public void scroll4()
	{
		component.scroll4(driver);
	}
	//Method to scroll
	public void scroll3()
	{
		component.scroll3(driver);
	}
	//Method to return pagination webtable xpath
	public By getPaginationWebtable()
	{
		return PaginationWebtable;
	}
	//Method to retrieve pagination values and checkbox is verified
	public void setPaginationWebtable() throws InterruptedException
	{	
		for(int i=1;i<=4;i++)
		{
			WebElement ProductTable = driver.findElement(By.xpath("//div[@class='table-container']/ul/li["+i+"]/a"));
			Thread.sleep(3000);
			ProductTable.click();
			List<WebElement> ProductValue = driver.findElements(By.xpath("//div[@class='table-container']/table/tbody"));
			for(WebElement value:ProductValue)
			{
				System.out.println(value.getText());
			}
			for(int j=1;j<=5;j++)
			{
				if(ProductTable.getText().equals(i))
				{

					driver.findElement(By.xpath("//div[@class='table-container']/table/tbody/tr["+j+"]/td[4]/input")).click();
				}
			}
		}   
	} 	
	//Method to scroll
	public void scroll5()
	{
		component.scroll5(driver);
	}
}


