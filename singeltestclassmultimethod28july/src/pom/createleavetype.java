package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createleavetype 
{
	public WebDriver driver;
	
 @FindBy(xpath="(//div[@class='menu_icon'])[2]")
 private WebElement settingsbutton;
 
 @FindBy(xpath="//a[.='Leave Types']")
 private WebElement leavetypebutton;
 
 @FindBy(xpath="//span[.='Create Leave Type']")
 private WebElement createleavetypebutton;
 
 @FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
 private WebElement leavetypename;
 
 
 @FindBy(xpath="//button[@id='ext-gen16']")
 private WebElement dropdownbutton;
 
 @FindBy(xpath="(//span[.='Create Leave Type'])[2]")
 private WebElement leavetypesubmitbutton;
 
 @FindBy(xpath="(//span[.='bahubali'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
 private WebElement deletebutton;
 
 public createleavetype(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 public void leavetype()
 {
	 settingsbutton.click();
	 leavetypebutton.click();
	 createleavetypebutton.click();
	 leavetypename.sendKeys("bahubali");
	 dropdownbutton.click();
	 leavetypesubmitbutton.click();
	 deletebutton.click();
	 Alert alt=driver.switchTo().alert();
	 alt.accept(); 
 }
}