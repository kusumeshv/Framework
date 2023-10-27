package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertions 
{
	WebDriver driver;
	@Test
	public void fb()
	{
	 WebDriverManager.chromedriver().setup();
	 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 String title=driver.getTitle();
	 //Hard Assert
	 Assert.assertEquals(title , "xyze");//false 
	 //soft assert
	 SoftAssert s=new SoftAssert();
	 //s.assertEquals(title, "xyza"); //false
	 System.out.println(driver.getCurrentUrl());
	 
}
	@Test
    public void quite() throws Throwable
       {
           Thread.sleep(3000);
            driver.close();
       }
}
