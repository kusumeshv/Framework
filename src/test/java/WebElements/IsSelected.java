package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected 
{
	public static void main(String[] args) throws Throwable
	 {
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 //for maximizing
		 eg.manage().window().maximize();
		 //implicit
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 eg.get("https://www.facebook.com/");
	     eg.findElement(By.xpath("//a[text()='Create new account']")).click();
	     Thread.sleep(3000);
	     WebElement male=eg.findElement(By.xpath("//input[@value='2']"));
	     male.click();
	     if(male.isSelected())
	     {
	    	 System.out.println("Pass");
	     }
	     else
	     {
	    	 System.out.println("Fail");
	     }
	
	 }
}
