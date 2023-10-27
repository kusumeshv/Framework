package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiddendivisions {

		public static void main(String[] args) throws Throwable 
		{
			 WebDriverManager.chromedriver().setup();
			 ChromeOptions options=new ChromeOptions();
			 options.addArguments("--disable-notifications"); //Notification handler
			 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
			 ChromeDriver eg=new ChromeDriver(options);
			 eg.manage().window().maximize();
			 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 eg.get("https://www.redbus.in/");
			 eg.findElement(By.xpath("//span[text()='Date']")).click();
			 Thread.sleep(3000);
			 eg.findElement(By.xpath("//div[text()='Oct']/../../..//span[text()='15']")).click(); 
		}

}
