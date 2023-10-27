package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import POM.FBLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 FBLoginPage fbl=new FBLoginPage(driver);
		 fbl.emailTextfield("KUSUMESH");
		 fbl.passwordTextfield("123456");
		 fbl.loginButton(); 

	}

}
