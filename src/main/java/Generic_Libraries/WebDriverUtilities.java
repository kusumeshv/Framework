package Generic_Libraries;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities 
{
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void rightclick(WebDriver driver, WebElement ele)
	{
		 Actions a=new Actions(driver);
         a.contextClick(ele).perform();
	}
	public void dragginganddropping(WebDriver driver, WebElement ele1, WebElement ele2)
	{
		 Actions a=new Actions(driver);
		 a.dragAndDrop(ele1, ele2).perform();
	}
	public void mouseovering(WebDriver driver, WebElement ele)
	{
		 Actions a=new Actions(driver);
		 a.moveToElement(ele).perform();
	}
	public void screenshot(WebDriver driver) throws Throwable
	{
		 TakesScreenshot ts=(TakesScreenshot)driver;
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     File dest=new File("./Screenshots/mkv.bmp");
	     FileUtils.copyFile(src, dest);
	}
	public String propertyfile(String Key) throws Throwable 
	{
		 Properties p=new Properties();
		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		 p.load(fis);
		 return p.getProperty(Key);
		 }
	}