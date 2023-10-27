package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Search 
{
	public static void main(String[] args) throws Throwable
	 {
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver cd=new ChromeDriver();
		 cd.manage().window().maximize();
		 Thread.sleep(3000);
		 cd.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		 //cd.manage().window().maximize();
		 cd.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		 Thread.sleep(3000);
		 cd.findElement(By.id("nav-search-submit-button"));
		 Thread.sleep(3000);
		 cd.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(3000);
	 }
}
