package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiselect_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 eg.manage().window().maximize();
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     eg.get("https://demoapp.skillrary.com/");
	     WebElement dD=eg.findElement(By.xpath("//select[@id='cars']"));
	     Select s=new Select(dD);
	     s.selectByIndex(0);
	     Thread.sleep(3000);
	     s.selectByValue("199");
	     Thread.sleep(3000);
	    //s.selectByVisibleText("More Than INR 500 ( 55 )  ");
	     Thread.sleep(3000);
	     System.out.println(s.isMultiple());
	     s.deselectByIndex(0);
	     Thread.sleep(3000);
	     s.deselectByValue("199");
	     Thread.sleep(3000);
	     //s.deselectByVisibleText("More Than INR 500 ( 55 )  ");
	     List<WebElement> selectedvalues = s.getAllSelectedOptions();
	     for(WebElement b:selectedvalues)
	     {
	    	 System.out.println(b.getText());
	     }

	}

}
