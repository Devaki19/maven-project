package testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testbase {
	 WebDriver drive;
		
 @BeforeTest
 public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\selenium\\chromedriver_win32\\chromedriver.exe");
	  drive = new ChromeDriver();
	  drive.get("https://www.facebook.com/");
 }
 @Test
 public void login()
 {
	  drive.findElement(By.id("email")).sendKeys("Sujikutty.kutty24@gmail.com");
	  drive.findElement(By.id("pass")).sendKeys("74013pandi");
	  drive.findElement(By.id("u_0_b")).click();
	  }
}
