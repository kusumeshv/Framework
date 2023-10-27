package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotations 
{
	WebDriver driver;
	 @Test
	  public void amz()
	  {
		 driver.get("https://www.amazon.in/");
	  }
	 @Test
	  public void fb()
	  {
		 driver.get("https://www.facebook.com/");
		  
	  }
	 @BeforeMethod
	 public void opening()
	 {
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	 @AfterMethod
	 public void quit() throws Throwable
	 {
	 Thread.sleep(3000);
	 driver.close();
}
	 
}
