package dataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertyFile 
{

	public static void main(String[] args) throws Throwable 
	{
	 Properties p=new Properties();
	 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
	 p.load(fis);
	 String appUrl=p.getProperty("url");
	 String name = p.getProperty("username");
	 String password = p.getProperty("password");
	 String brw = p.getProperty("browser");
	 WebDriver eg;
	 if(brw.equals("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 eg=new ChromeDriver();	
	 }
	 else
	 {
		 WebDriverManager.edgedriver().setup();
		 eg=new EdgeDriver();
	 }
	 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
	 eg.manage().window().maximize();
	 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 eg.get(appUrl);
	 eg.findElement(By.id("email")).sendKeys(name);
	 eg.findElement(By.name("pass")).sendKeys(password);
	 
	}

}
