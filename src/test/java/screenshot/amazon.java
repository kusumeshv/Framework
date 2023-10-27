package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws Throwable 
	{
			 WebDriverManager.chromedriver().setup();
			 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
			 ChromeDriver eg=new ChromeDriver();
			 eg.manage().window().maximize();
			 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		     eg.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
		     //downcast
		     TakesScreenshot ts=(TakesScreenshot)eg;
		     File src=ts.getScreenshotAs(OutputType.FILE);
		     File dest=new File("./Screenshots/mkv.bmp");
		     FileUtils.copyFile(src, dest);
	}

}
