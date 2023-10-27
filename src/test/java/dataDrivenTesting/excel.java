package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class excel {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wbf=WorkbookFactory.create(fis);
		String appUrl = wbf.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		 WebDriverManager.chromedriver().setup();
		 System.setProperty("webdriver.chrome.driver","F:\\JAVA - Programme\\Program\\M11\\src\\main\\resources\\chromedriver.exe");
		 ChromeDriver eg=new ChromeDriver();
		 eg.manage().window().maximize();
		 eg.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 eg.get(appUrl);
		 String title = eg.getTitle();
		 System.out.println(title);
		 wbf.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
		 FileOutputStream fs=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		 wbf.write(fs);
	}

}
