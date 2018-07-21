package scripts;


import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;

import pom.LoginPage;

public class Validloginlogout extends Base_Test
{
	@Test()
	public void testValidLoginLogout()
	{
		
		String hp_title=Excel.getCellValue(PATH, "test", 0, 2);
		LoginPage lp=new LoginPage(driver);
		lp.verifyLoginPage(hp_title);
	
	}
	
	

}
		