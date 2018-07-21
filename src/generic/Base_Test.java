package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import pom.LoginPage;

public class Base_Test implements Auto_const
{
	public WebDriver driver;
	
	@BeforeMethod
	//@Parameters("browser")	
	public void openAppln()
	{
		//if(browser.equalsIgnoreCase("firefox"))
			//	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		
		String un=Excel.getCellValue(PATH, "test", 0, 0);
		Reporter.log("Uname is " +un,true);
		String pwd=Excel.getCellValue(PATH, "test", 0, 1);
		Reporter.log("pwd is " +pwd,true);
		String hp_title=Excel.getCellValue(PATH, "test", 0, 2);
		Reporter.log("Homepage title is " +hp_title,true);
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(un);
		lp.setpassword(pwd);
		lp.clickLogin();
				//}
		//else if(browser.equalsIgnoreCase("chrome"))
		//{
		//	System.setProperty(CHROME_KEY, CHROME_VALUE);
			//driver=new FirefoxDriver();
		//	driver.get("http://localhost/login.do");
					//}
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
}
