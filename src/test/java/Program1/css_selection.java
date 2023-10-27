package Program1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selection 
{
	 public static void main(String[] args) throws Throwable
	 {
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 //for maximizing
		 eg.manage().window().maximize();
		 Thread.sleep(3000);
		 eg.get("https://www.facebook.com/");
		 eg.findElement(By.cssSelector("input[id='email']")).sendKeys("xyz");
		 eg.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345");
		 eg.findElement(By.linkText("Forgotten password?")).click();
		 }
}
