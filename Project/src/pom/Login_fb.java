package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Login_fb extends Base_Page {
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbtn;
	
	
	public Login_fb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void button1()
	{
		loginbtn.click();
	}


}
