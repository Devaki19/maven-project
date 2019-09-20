import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

@Retention(value = 0)
@Target(value = {})

public @interface loginpage {
	 WebDriver drive;
	
@Test
 public void loginpage()
{
	 @FindBy(id="//input[@type='email'][@name='email']") WebElement emailTextBox;
	 @FindBy(id="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
	 @FindBy(id="//input[@type='submit'][@id='u_0_5']") WebElement signinButton;
}
	public void setEmail()
	{
		
}
}	
}
