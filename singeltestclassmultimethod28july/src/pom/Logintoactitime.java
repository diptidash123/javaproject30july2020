package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logintoactitime 
{
 @FindBy(xpath="//input[@id='username']")
 private WebElement usernametetxfield;
 
 @FindBy(xpath="//input[@name='pwd']")
 private WebElement passwordtextfield;
 
 @FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
 private WebElement checkboxbutton;
 
 @FindBy(xpath="//a[@id='loginButton']")
 private WebElement loginbutton;
 
 @FindBy(xpath="//a[.='Forgot your password?']")
 private WebElement forgetlink;
 
 @FindBy(xpath="//a[.='actiTIME Inc.']")
 private WebElement actitimeinclink;
 
 public Logintoactitime(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public void logindetails()
 {
	 usernametetxfield.sendKeys("admin");
	 passwordtextfield.sendKeys("manager");
	 checkboxbutton.click();
	 loginbutton.click();
 }

 public void forgetlink()
 {
	forgetlink.click();  
 }
 
 public void actitimeinclink()
 {
	 actitimeinclink.click();
 }
}