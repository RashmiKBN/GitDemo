package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base{
	
	
	@Test
	
		public void basepagenavigation() throws IOException
		{
			// if you giv extends u can use----return type is driver(refer base class)-throws
			
			//if you comment below line ul get "NULLPointerException
			driver=initializeDriver();
			
			driver.get(prop.getProperty("url"));
			
			//driver.get("http://www.newtours.demoaut.com/");
			
			LandingPage LP=new LandingPage(driver);
			
			Assert.assertTrue(LP.getIsDisplayed().isDisplayed());
	}

}
