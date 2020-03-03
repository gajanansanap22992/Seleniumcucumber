package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage 
{
public WebDriver driver;

@FindBy(xpath="//a[@href='#']//span[contains(text(),'Customers')]")
WebElement CustomerMenu;

@FindBy(xpath="//a[@href='/Admin/Customer/List']//span[contains(text(),'Customers')]")
WebElement CustomerMenuItem;

@FindBy(xpath="//a[@class='btn bg-blue' ]//i")
WebElement buttonAddNew ;
@FindBy(xpath="//button[@name='save']")
WebElement buttonSave ;
@FindBy(xpath="//button[@name='save-continue']")
WebElement buttonSaveAndContinue ;

@FindBy(xpath="//input[contains(@name,'Email') and (@id='Email')]")
WebElement txtEmail; 

@FindBy(xpath="//input[contains(@name,'Password') and (@id='Password')]")
WebElement txtPassword;

@FindBy(xpath="//input[contains(@name,'FirstName') and (@id='FirstName')]")
WebElement txtFirstName;

@FindBy(xpath="//input[contains(@name,'LastName') and (@id='LastName')]")
WebElement txtLastName;

@FindBy(xpath="//input[contains(@name,'Gender') and (@id='Gender_Male')]")
WebElement rdMale;

@FindBy(xpath="//input[contains(@name,'Gender') and (@id='Gender_Female')]")
WebElement rdFemale;


@FindBy(xpath="//input[contains(@name,'DateOfBirth') and (@id='DateOfBirth')]")
WebElement selDateOfBirth;

@FindBy(xpath="//input[@id='Company']")
WebElement txtCompanyName;

@FindBy(xpath="//input[@id='IsTaxExempt']")
WebElement checkIsTaxExempt;

@FindBy(xpath="//input[@name='SelectedNewsletterSubscriptionStoreIds' and @value='1']")
WebElement checkNewsLetter1;

@FindBy(xpath="//input[@name='SelectedNewsletterSubscriptionStoreIds' and @value='2']")
WebElement checkNewsLetter2;

@FindBy(xpath="//ul[@id='SelectedCustomerRoleIds_taglist']//li//span[contains(text(),'Registered')]")
WebElement customerRoleRegistered;

@FindBy(xpath="//ul[@id='SelectedCustomerRoleIds_taglist']//li//span[contains(text(),'delete')]")
WebElement customerRoleDelete;

@FindBy(xpath="//input[@aria-owns='SelectedCustomerRoleIds_taglist SelectedCustomerRoleIds_listbox']")
WebElement customerRole;

@FindBy(xpath="//select[@id='SelectedCustomerRoleIds']")
WebElement selectCustomerRoles;

@FindBy(xpath="//select[@id='VendorId']")
WebElement selectVendor;
@FindBy(xpath="//input[@id='Active']")
WebElement checkActive;
@FindBy(xpath="//textarea[@id='AdminComment']")
WebElement txtAdminComment;

public AddCustomerPage (WebDriver rdriver)
{
	this.driver=rdriver;
	PageFactory.initElements(rdriver, this);
}


public String getTitle()
{
	return driver.getTitle();
	
}
public void clickOnCustomerMenu()
{
	CustomerMenu.click();
}
public void clickOnCustomerMenuItem()
{
	CustomerMenuItem.click();
}
public void clickOnAddNew()
{
	buttonAddNew.click();
}
public void clickOnSave()
{
	buttonSave.click();
}
public void clickOnSaveContinue()
{
	buttonSaveAndContinue.click();
}


public void enterEmail(String email)
{
	txtEmail.sendKeys(email);;
}
public void enterPassword(String password)
{
	txtPassword.sendKeys(password);;
}
public void enterFirstName(String fname)
{
	txtFirstName.sendKeys(fname);;
}
public void enterLastName(String lname)
{
	txtLastName.sendKeys(lname);;
}
public void enterCompanyName(String company)
{
	txtCompanyName.sendKeys(company);;
}
public void selectGender(String gender)
{
	if(gender.contains("female"))
	{
		rdFemale.click();
	}
	else
	{
		rdMale.click();
	}
}

public void enterDateOfBirth(String dob)
{
	selDateOfBirth.sendKeys(dob);;
}
public void selectIsTaxExempt()
{
	checkIsTaxExempt.click();
}


public void checkNewsLetter(String str)
{
	if(str.contains("2"))
	{
		checkNewsLetter2.click();
	}
	else
	checkNewsLetter1.click();
}
public void selectCustomerRole(String role) throws InterruptedException
{Thread.sleep(1000);
Actions a= new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_taglist']//li//span[contains(text(),'delete')]")))
.click().build().perform();
Thread.sleep(2000);
Select s=new Select(driver.findElement(By.xpath("//div[@class='k-widget k-multiselect k-header']")));
s.selectByVisibleText("Administrators");

//(driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"))).click();
	
	
	
	//driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']")).sendKeys("a");
	Thread.sleep(2000);
//	List<WebElement> l=driver.findElements(By.xpath("//div[@class='k-widget k-multiselect k-header']//select//option"));
//	for(WebElement e:l)
//	{
//		if(e.getText().contains(role))
//		{Thread.sleep(2000);
//			System.out.println(e.getText());
//			e.click();
//			break;
//		}
//	}
//	
}

public void selectManagerOfVender(String vendor)
{
	Select select=new Select( selectVendor);
	select.selectByVisibleText(vendor);
}

public void checkActive()
{
	checkActive.click();
}

public void enterAdminComment(String comment)
{
	txtAdminComment.sendKeys(comment);
}



 }
