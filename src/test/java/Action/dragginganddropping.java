package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragginganddropping 
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
		 eg.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		 Thread.sleep(3000);
		 WebElement block1=eg.findElement(By.xpath("//h1[text()='Block 1']"));
		 //WebElement block4=eg.findElement(By.xpath("//h1[text()='Block 4']"));
		 WebElement block3=eg.findElement(By.xpath("//h1[text()='Block 3']"));
		 Actions a=new Actions(eg);
		 a.dragAndDrop(block1, block3).perform();
		 
	}
}
