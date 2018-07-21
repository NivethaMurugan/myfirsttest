package scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.HomePage;


public class Validuser extends Base_Test
{
	@Test
	public void checkuser()
	{
		
		HomePage hp=new HomePage(driver);
		String uname=hp.verifyusername();
		Reporter.log(uname,true);
		String chkun=Excel.getCellValue(PATH, "test", 0, 3);
		Assert.assertEquals(chkun,uname);
	}
	
	
}