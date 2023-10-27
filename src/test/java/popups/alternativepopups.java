package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alternativepopups {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 //for maximizing
		 eg.manage().window().maximize();
		 //implicit
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 eg.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		 WebElement plus=eg.findElement(By.xpath("//i[@class='fa fa-plus']"));
		 Actions a=new Actions(eg);
		 a.doubleClick(plus).perform();
		 Thread.sleep(3000);
		 eg.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		 Alert al=eg.switchTo().alert();
		 Thread.sleep(2000);
		 System.out.println(al.getText());
		 //al.dismiss();
		 al.accept();
		 

	}

}
