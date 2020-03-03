package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

{ WebDriver ldriver;
	@FindBy(xpath="//input[@id='Email']")
	@CacheLookup
	WebElement enterEmail;
	
	@FindBy(xpath="//input[ @id='Password']")
	@CacheLookup
	WebElement enterPassword;
	
	@FindBy(xpath="//input[@class='button-1 login-button' and @type='submit']")
	@CacheLookup
	WebElement LoginButton;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement LogoutButton;
	
	
	
	public LoginPage(WebDriver rdriver)
	{    ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	public void enterEmail(String email)
	{   enterEmail.clear();
		enterEmail.sendKeys(email);
	}
	public void enterPassword(String password)
	{    enterPassword.clear();
		enterPassword.sendKeys(password);
	}
public void clickOnLogin()
{
	LoginButton.click();
}
public void clickOnLogout()
{
	LogoutButton.click();
}

}
