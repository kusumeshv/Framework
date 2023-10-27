package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdealframehandling 
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
		 eg.get("https://www.snapdeal.com/");
		 Thread.sleep(3000);
		 WebElement SignIn=eg.findElement(By.xpath("//span[text()='Sign In']"));
		 Actions a=new Actions(eg);
		 a.moveToElement(SignIn).perform();
		 Thread.sleep(3000);
		 eg.findElement(By.xpath("//a[text()='login']")).click();
		 eg.switchTo().frame("iframeLogin");
		 eg.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("XYZ");
		 Thread.sleep(3000);
		 //eg.findElement(By.id("checkUser")).click();
		 eg.findElement(By.xpath("//div[@id='close-pop']")).click();
		 eg.switchTo().defaultContent();
		 eg.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("mobiles");
		 eg.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		 
	}

}
