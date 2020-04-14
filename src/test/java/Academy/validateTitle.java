package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base{
	
	
	@Test
	
		public void basepagenavigation() throws IOException
		{
			// if you giv extends u can use----return type is driver(refer base class)-throws
			
			//if you comment below line ul get "NULLPointerException
			driver=initializeDriver();
			
			//driver.get("http://www.newtours.demoaut.com/");
			driver.get(prop.getProperty("url"));
			
			LandingPage LP=new LandingPage(driver);
			
			//it prints but doesnt validates and doesnt fail the script
			//System.out.println(LP.getTitle().getText());
			
			//compare the text from broswer wuth actual text...-Error...
			//Assert.assertEquals(LP.getTitle().getText(),"Destinations");
			
			// use "import org.testng.Assert;" not import.org.framework.assert
		    Assert.assertEquals(LP.getTitle().getText(), "http://www.newtours.demoaut.com/");	
			
	}

}
