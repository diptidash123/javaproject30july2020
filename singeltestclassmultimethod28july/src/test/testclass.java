package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Logintoactitime;
import pom.createleavetype;
import pom.createtypeofwork;

public class testclass 
{
	public WebDriver driver;//depends on method
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	
	 @Test
	 public void login()
	 {
			Logintoactitime l1=new Logintoactitime(driver);
			l1.logindetails();			
      }
	 
	 @Test(dependsOnMethods="login")
	 public void work()
	 {
			
			createtypeofwork l2=new createtypeofwork(driver);
			l2.typeofwork();
      }
	 
	 @Test(dependsOnMethods="login")
	 public void leave()
	 {
			createleavetype l3=new createleavetype(driver);
			l3.leavetype();
      }
}