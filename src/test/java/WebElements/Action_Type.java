package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Type 
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
		 WebElement email=eg.findElement(By.id("email"));
		 WebElement Password=eg.findElement(By.id("pass"));
		 email.sendKeys("XYZY");
		 email.clear();
		 Thread.sleep(3000);
		 Password.sendKeys("123456");
		 Password.clear();
		 Thread.sleep(3000);
		 eg.findElement(By.xpath("//button[@type='submit']")).submit();
	 }
}
