package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage 
{
	//declaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTf;
	@FindBy(name="pass")
	private WebElement passwordTf;
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//Initization
	public FBLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	//Utilzation
	public WebElement getEmailTf() {
		return emailTf;
	}
	public WebElement getPasswordTf()
	{
		return passwordTf;
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	public void emailTextfield(String data)
	{
		emailTf.sendKeys(data);
	}
	public void passwordTextfield(String data)
	{
		passwordTf.sendKeys(data);
	}
	public void loginButton()
	{
		loginBtn.click();
	}

}
