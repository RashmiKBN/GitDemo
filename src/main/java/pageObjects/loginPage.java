package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	public loginPage(WebDriver driver) 
	{

        this.driver=driver;
	}
	
	//Username
	By username1=By.xpath("//*[@name='userName']");
	
	//Password
	By Password1=By.xpath("//*[@type='password']");
	
	//Sign-in
	By submit=By.xpath("//*[@name='login']");


	// Give return type as WebElement and import it
	public WebElement getusername1()
	{
		return driver.findElement(username1);
	}
	
	public WebElement getPassword1()
	{
		return driver.findElement(Password1);
	}
	
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
	

}
