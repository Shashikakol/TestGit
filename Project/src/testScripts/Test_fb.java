package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_read_excel;
import pom.Login_fb;

public class Test_fb extends Base_Test{
	@Test
	public void getLogged()
	{
		String uname = Generic_read_excel.getData("Sheet1", 0, 0);
		String pwd = Generic_read_excel.getData("Sheet1", 0, 1);
		Login_fb fb=new Login_fb(driver);
		fb.setUsername(uname);
		fb.setPassword(pwd);
		fb.button1();
		Assert.fail();
	}
}
