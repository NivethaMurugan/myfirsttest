package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.HomePage;


public class Validversion extends Base_Test
{
	@Test
	public void checkversion() throws InterruptedException
	{
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		hp.verifyhelpElement();
		hp.clickhelp();
		Thread.sleep(2000);
		hp.verifyaboutElement();
		hp.clickabout();
		Thread.sleep(2000);
		String eversion=Excel.getCellValue(PATH, "test", 0, 4);
		Reporter.log("Version is: " +eversion,true);
	hp.verifyverelement();
	hp.verifyversion(eversion);
	}

}
