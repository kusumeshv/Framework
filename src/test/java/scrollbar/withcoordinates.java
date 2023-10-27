package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withcoordinates 
{
	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 eg.manage().window().maximize();
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     eg.get("https://www.amazon.in/");
	     WebElement careers=eg.findElement(By.xpath("//a[text()='Careers']"));
	     Point coOrd = careers.getLocation();
	     int x=coOrd.getX();
	     int y=coOrd.getY();
	     //downcasting
	     JavascriptExecutor js=(JavascriptExecutor)eg;
	     js.executeScript("window.scrollBy("+x+","+y+")");
	     //js.executeScript("arguments[0].scrollIntoView();", careers);
	     js.executeScript("arguments[0].click();", careers);
	}
}
