package Program1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_index 
{
	 public static void main(String[] args) throws Throwable
	 {
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 //for maximizing
		 eg.manage().window().maximize();
		 Thread.sleep(3000);
		 eg.get("https://demoapp.skillrary.com/index.php");
		 eg.manage().window().maximize();
		 eg.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]")).click();

}
}
