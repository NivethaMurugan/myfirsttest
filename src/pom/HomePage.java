package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

import org.testng.Assert;

public class HomePage extends Base_Page
{
	@FindBy(id="profile-link")
	private WebElement uname;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement about;
	
	@FindBy(xpath="//span[.='actiTIME 2014 Pro']")
	private WebElement version;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String verifyusername()
	{
		verifyElement(uname);
		return uname.getText();
	}
	
	public void clickhelp()
	{
		help.click();
	}
	
	public void clickabout()
	{
		about.click();
	}
	public void verifyhelpElement()
	{
		verifyElement(help);
	}
	public void verifyaboutElement()
	{
		verifyElement(about);
	}
	public void verifyverelement()
	{
		
		verifyElement(version);
	}
	
	public void verifyversion(String eversion)
	{
		String aversion=version.getText();
		Assert.assertEquals(aversion,eversion);
	
	}

}
