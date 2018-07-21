package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;


public class LoginPage extends Base_Page
{
	@FindBy(id="username")
	private WebElement untbox;
	
	@FindBy(name="pwd")
	private WebElement pwdtbox;
	
	@FindBy (xpath="//div[.='Login ']")
	private WebElement Login;
	
	@FindBy (xpath="//span[contains(.='invalid')")
	private WebElement errormsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		Login.click();
	}
	public void verifyerrormsg()
	{
		verifyElement(errormsg);
	}
	public void verifyLoginPage(String hp_title)
	{
		verifyTitle(hp_title);
	}
}
