package Example_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Exam_CustomAnnotation {
	WebDriver driver;
	static int linkcount=0;
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin"
	  				+ "\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		
	  	driver = new FirefoxDriver();
		
		driver.get("https://www.bankofbaroda.com");
		Thread.sleep(2*1000);
		
		for(WebElement links : driver.findElements(By.tagName("a")))
		{
			System.out.println(links.getText());
			linkcount++;
		}

		System.out.println("Total No of Links :"+linkcount);
		
	}



  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
