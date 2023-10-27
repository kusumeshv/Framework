package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseovering {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 //for maximizing
		 eg.manage().window().maximize();
		 //implicit
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 eg.get("https://www.snapdeal.com/");
		 WebElement signIn=eg.findElement(By.xpath("//span[text()='Sign In']"));
		 Actions a=new Actions(eg);
		 a.moveToElement(signIn).perform();
		 Thread.sleep(3000);
		 eg.findElement(By.xpath("//span[text()='Register']")).click();
		 
	}

}