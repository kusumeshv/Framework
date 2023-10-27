package Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
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
		 eg.get("https://www.google.com/");
		 eg.findElement(By.xpath("//textarea[@type='search']")).sendKeys("k");
		 Thread.sleep(3000);
		 List<WebElement> autosuggestions=eg.findElements(By.xpath("//li[@data-view-type='1']"));
		 Thread.sleep(3000);
		 for(WebElement b:autosuggestions)
		 {
			 System.out.println(b.getText());
		 }
		 
	 }
}
