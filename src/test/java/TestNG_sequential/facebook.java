package TestNG_sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class facebook 
{
	@Test
   public void fb()
   {
	     WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 eg.manage().window().maximize();
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 eg.get("https://www.facebook.com/");
   }
}
