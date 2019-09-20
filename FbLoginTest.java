package testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import selenium.fblogin.loginpage;
 
@Test
public class FbLoginTest{
	WebDriver drive;
 
 public <FbLogintest, FbLoginPage> void initElements()
 {
 loginpage loginpage = PageFactory.initElements(drive, loginpage.class);
 loginpage.setEmail();
 loginpage.setPassword();
 loginpage.clickOnLoginButton();
 
 
 }
 
}