package Module1_Login;
//POM Class 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
     
	 @FindBy(xpath = "//button[text()='Open Menu']") private WebElement menu;
	 WebDriver driver;
	 
	 
	 public SwagLabHomePage(WebDriver driver)
	 {
		 this.driver = driver;       //globalVariable = localVariable -> Assign local driver info into global driver
	     PageFactory.initElements(driver, this);
	 }
	 
	 
	 public String getSwagLabHomePageTitle()
	 {
		 String actTitle = driver.getTitle();
		 return actTitle;
	 }
	 
	 public void clickSwagLabHomePageMenuBtn()
	 {
		menu.click();
	 }
}