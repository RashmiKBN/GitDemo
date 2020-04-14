package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	//Creating an object
	public WebDriver driver;
	
	//Constructor
	public LandingPage(WebDriver driver) 
	{
		//1st driver is landingPage driver and =driver is homePage driver...homepage driver is having the life so that driver is assigned to landingpage driver
		this.driver=driver;
	}
	
	//Username
	By username=By.xpath("//*[@name='userName']");
	
	//Password
	By Password=By.xpath("//*[@type='password']");
	
	//Sign-in
	By Signin=By.xpath("//*[@name='login']");
	
	//Title
	By Title=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[5]/td[1]/img");

	// is displayed
	By IsDisplayed=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[1]/td/font");
	
	// Give return type as WebElement and import it
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getsignin()
	{
		return driver.findElement(Signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	
	public WebElement getIsDisplayed()
	{
		return driver.findElement(IsDisplayed);
	}
}
