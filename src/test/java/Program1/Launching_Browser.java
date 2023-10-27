package Program1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser 
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
	 //eg.navigate().to("https://twitter.com/login");
	 System.out.println(eg.getTitle());
	 System.out.println(eg.toString());
	 System.out.println(eg.getCurrentUrl());
	 Thread.sleep(3000);
	 eg.navigate().refresh();
	 Thread.sleep(3000);
	 eg.navigate().back();
	 Thread.sleep(3000);
	 eg.navigate().forward();
	 Thread.sleep(3000);
	 eg.manage().window().maximize();
	 Thread.sleep(3000);
	 //Locator for Email ID
	 eg.findElement(By.id("email")).sendKeys("kusumeshv"); 
	 Thread.sleep(5000);
	 eg.findElement(By.id("pass")).sendKeys("123456");
	 eg.findElement(By.linkText("Forgotten password?")).click();
	 //eg.findElement(By.id("identify_email")).sendKeys("xyz@gmail.com");
	 //eg.findElement(By.name("did_submit")).click();
	 List<WebElement> allLinks=eg.findElements(By.tagName("a"));
	 Thread.sleep(4000);
	 for(WebElement b:allLinks)
	 {
		 System.out.println(b.getText());
	 }
	 //eg.close(); 
 }

}
