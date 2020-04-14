package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	//changing from "void" to "WebDriver" bcoz we are returning driver
	public WebDriver initializeDriver() throws IOException
	{
		//method to integrate prop file----Import
		Properties prop=new Properties();
		
		//Put double slash in java---Import and throws
		FileInputStream fis=new FileInputStream("C:\\Users\\Rashmi.KBN\\E2EProject\\src\\main\\java\\resources\\File.properties");
		
		//Method which can take fis as argument--Throws
		prop.load(fis);
		
		//Printing the value chrome
		//System.out.println(prop.getProperty("Broswer"));
		
		String BrowserName=prop.getProperty("Browser");
		
		//== if u use the "NULLPointerException will come
		if(BrowserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (BrowserName.contains("firefox"))
		{
			
		}
		
		else if (BrowserName.contains("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//public WebDriver driver;---- so give return----again from void to Webdriver we should change the return type
		return driver;
		
	}

}
