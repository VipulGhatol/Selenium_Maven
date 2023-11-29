package Module1_Login;
//POM Class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabLoginPage
{
    //Step 1 : Declaration
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;        //private WebElement UN = driver.finElement(By.xpath(""))
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;        //private WebElement PWD = driver.finElement(By.xpath(""))
	@FindBy(xpath = "//input[@id='login-button']") private WebElement login;  //private WebElement login = driver.finElement(By.xpath(""))
	
	
	
	//Step 2 : Initialization
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   //className.methodName("webDriverObject",this)
	}
	
	
	
	//Step 3 : Usage
	public void inpSwagLabLoginPageUN(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpSwagLabLoginPagePWD(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickSwagLabLoginPageLoginBtn()
	{
		login.click();
	}
}