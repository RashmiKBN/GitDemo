package Academy;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.loginPage;
import resources.base;

// by heritance we can use the script of baseclass---extends base
public class HomePage extends base {
	
	//import TestNg annotations
	//Dataprovider name give here
	@Test(dataProvider="getData")
	
	//3values we are expecting so pass those 3arguments here
	public void basepagenavigation(String userName,String password,String text) throws IOException
	{
		// if you giv extends u can use----return type is driver(refer base class)-throws
		
		//if you comment below line ul get "NULLPointerException
		driver=initializeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		LandingPage LP=new LandingPage(driver);
		LP.getusername().sendKeys("Selenium");
		LP.getPassword().sendKeys("123XYZ");
		LP.getsignin().click();
		
		loginPage Login=new loginPage(driver);
		
		//same name as "(String userName,String password,String text)"
		Login.getusername1().sendKeys(userName);
		Login.getPassword1().sendKeys(password);
		//simply printing the text
		System.out.println(text);
		
		System.out.println("---------------------------");
		

		System.out.println("---------------------------");
		
		Login.getsubmit().click();
		
	}
	
		//Dataprovider and Parameterizing-----import tesng annotations
		@DataProvider
		
		//initialy object[][] will be return as void
		public Object[][] getData()
		{
			//1means 0 and 1 
			//2means 0,1 and 3
			Object[][] data=new Object[2][3];
			
			data[0][0]="adssxc1aa";
			data[0][1]="bbs1cb";
			data[0][2]="cwd2cc";
			
			data[1][0]="111dsc";
			data[1][1]="2xc22";
			data[1][2]="3xv33";
			
			//change to Object[][]
			return data;
		}

}
