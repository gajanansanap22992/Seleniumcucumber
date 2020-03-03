package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.WaitHelper;

public class SearchCustomerPage 
{
public WebDriver driver;
public WaitHelper waithelper;
public static boolean flag;
public SearchCustomerPage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	waithelper=new WaitHelper(driver);
}
@FindBy(xpath="//table[@id='customers-grid']/tbody/tr[1]/td[1]")
WebElement tablerecord;
@FindBy(xpath="//input[@id='SearchEmail']")
WebElement txtEmail;
@FindBy(xpath="//input[@id='SearchFirstName']")
WebElement txtFirstName;

@FindBy(xpath="//input[@id='SearchLastName']")
WebElement txtLastName;

@FindBy(xpath="//select[@id='SearchMonthOfBirth']")
WebElement selectMonth;

@FindBy(xpath="//select[@id='SearchDayOfBirth']")
WebElement selectDay;

@FindBy(xpath="//input[@id='SearchCompany']")
WebElement txtCompany;

@FindBy(xpath="//button[@id='search-customers']")
WebElement buttonSearch;

@FindBy(xpath="//table[@id='customers-grid']")
WebElement table;

@FindBy(xpath="//table[@id='customers-grid']/tbody/tr")

List<WebElement> tableRow;

@FindBy(xpath="//table[@id='customers-grid']/tbody/tr/td")

List<WebElement> tableColumn;

public void enterEmail(String email)
{   waithelper.waitForElement(txtEmail, 30);
	txtEmail.clear();
	txtEmail.sendKeys(email);
}
public void enterFirstName(String fname)
{   waithelper.waitForElement(txtFirstName, 30);
txtFirstName.clear();
	txtFirstName.sendKeys(fname);
}
public void enterLastName(String lname)
{ waithelper.waitForElement(txtLastName, 30);
    txtLastName.clear();
	txtLastName.sendKeys(lname);
}

public void selectMonth(String month)
{
	Select sel=new Select(selectMonth);
	sel.selectByVisibleText(month);
}
public void selectDay(String day)
{Select sel=new Select(selectDay);
	sel.selectByVisibleText(day);
}
public void enterMonth(String company)
{
	txtCompany.sendKeys(company);
}
public void clickOnSearch()
{
	waithelper.waitForElement(buttonSearch, 30);
	buttonSearch.click();
}


public  int getTableRow()
{
	int s=tableRow.size();
	return (s);
}
public int getTableColumn()
{
	
	return (tableColumn.size());
}

public boolean searchCustomerByEmailId(String email)
{



for(int i=1;i<=getTableRow();i++)
{
	String result=driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
	
	 if(result.equals(email))
		{
		  flag=true;
		 break;
		}	
	 else
	 {
		 flag=false;
	 }
	
}
	return flag;
}

public boolean searchCustomerByName(String ename)
{
String str[]=ename.split(" ");
String fname=str[0];
String lname=str[1];

waithelper.waitForElement(driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[1]/td[3]")), 20);
List<WebElement> l=driver.findElements(By.xpath("//table[@id='customers-grid']/tbody/tr"));

for(int i=1;i<=l.size();i++)
{
	String result=driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
	String name[]=result.split(" ");
	 if(name[0].equals(fname) && name[1].equals(lname))
		{
		  flag=true;
		 break;
		}	
	 else
	 {
		 flag=false;
	 }
	
}
	return flag;
}


}
