package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 eg.manage().window().maximize();
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     eg.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");

	}

}
