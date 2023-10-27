package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize 
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
		 WebElement email=eg.findElement(By.xpath("//input[@id='email']"));
		 Dimension size=email.getSize();
		 int h=size.getHeight();
		 int w=size.getWidth();
		 System.out.println(h);
		 System.out.println(w);
		 WebElement password=eg.findElement(By.xpath("//input[@id='pass']"));
		 Dimension size1=password.getSize();
		 int h1=size1.getHeight();
		 int w1=size1.getWidth();
		 System.out.println("Password");
		 System.out.println(h1);
		 System.out.println(w1);
	 }

}
