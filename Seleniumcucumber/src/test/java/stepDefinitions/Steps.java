package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass
{
  public WebDriver driver;
  public  LoginPage loginpage;
  public AddCustomerPage addcust;
  public SearchCustomerPage spage;
	
  
  @Before
  public void setUp() throws IOException
  {
	  property=new Properties();
	  FileInputStream fis= new FileInputStream("./config.properties");
	  property.load(fis);
	  logger=Logger.getLogger("nonCommerce");
	  PropertyConfigurator.configure("log4j.properties");
	 
	  String browser=property.getProperty("browser");
	  if(browser.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver",  property.getProperty("chromepath"));
	  driver=new ChromeDriver();
	  }
	  else if(browser.equals("firefox"))
	  {
	  System.setProperty("webdriver.chrome.driver",  property.getProperty("firefoxpath"));
	  driver=new FirefoxDriver();
	  }
	  loginpage=new LoginPage(driver);
	  addcust=new AddCustomerPage(driver);
	  spage=new SearchCustomerPage(driver); 
  }
  
  
  @Given("User launch browser")	
	public void user_launch_browser() 
	{  
	   logger.info("****Launching Browser****");	 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  
	 
	}

	@When("user open Url {string}")
	public void user_open_Url(String url) 
	{   logger.info("****Opening browser****");
		driver.get(url);
	   
	}

	@When("user enter Email as {string} and password as {string}")
	public void user_enter_Email_as_and_password_as(String email, String password)
	{logger.info("****Entering logging details****");
		loginpage.enterEmail(email);
	  loginpage.enterPassword(password);
	}

	@When("click on login")
	public void click_on_login()
	{
		logger.info("****Clicking on logging Button****");
	  loginpage.clickOnLogin();
		
	}

	@Then("pageTitle should be {string}")
	public void pagetitle_should_be(String expected) 
	{
		
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
			Assert.assertTrue(false);
			logger.info("****Loggin Faied****");
		}
		else {
			
		
	   String str=driver.getTitle();
	  Assert.assertEquals("Dashboard / nopCommerce administration", str);
	  logger.info("**** Loggin passed ****");
		}
	}

	@When("user click on log out page")
	public void user_click_on_log_out_page()
	{
		
		logger.info("**** CLicking on logout Button ****");
	  loginpage.clickOnLogout();
	}

	@Then("Page Title shoub be {string}")
	public void page_Title_shoub_be(String string)
	{
		 logger.info("**** Loggin passed ****");
		String str=driver.getTitle();
		  Assert.assertEquals(string, str);
	}

	@Then("close browser")
	public void close_browser() {
		 logger.info("**** Closing Browser ****");
	   driver.quit();
	}
	
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
		 logger.info("**** Verifying page Title ****");
	  Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getTitle());		
	   	}
	

	@When("user click on customer menu")
	public void user_click_on_customer_menu() throws InterruptedException
	{Thread.sleep(2000);
	 logger.info("**** Clicking on customer menu ****");
	 addcust.clickOnCustomerMenu();
	 //Assert.assertEquals(expected, addcust.getTitle());
	}

	@When("click on customer menu item")
	public void click_on_customer_menu_item() throws InterruptedException {
		Thread.sleep(2000);
		 logger.info("**** Clicking on customer menu item ****");
	   addcust.clickOnCustomerMenuItem();
	   Assert.assertEquals("Customers / nopCommerce administration", addcust.getTitle());
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		Thread.sleep(2000);
		 logger.info("**** Clicking on add new button ****");
	   addcust.clickOnAddNew();
	   Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() throws InterruptedException {
		Thread.sleep(2000);
		 logger.info("**** Viewing add new customer page ****");
		 Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());

	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		Thread.sleep(2000);
		 logger.info("**** Entering Customer information ****");
		addcust.enterEmail(randomString()+"@gmail.com");
		addcust.enterPassword(randomString());
		addcust.enterFirstName("gajanan");
		addcust.enterLastName("sanap");
		addcust.selectGender("male");
		addcust.enterDateOfBirth("9/22/1992");
		addcust.enterCompanyName("microsoft");
		addcust.selectIsTaxExempt();
		addcust.checkNewsLetter("2");
		//addcust.selectCustomerRole("Guests");
		addcust.selectManagerOfVender("Vendor 2");
		addcust.checkActive();
		addcust.enterAdminComment("ok data is successfully entered");
		
	    
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		 logger.info("**** Clicking on save button ****");
	  addcust.clickOnSave();
	  Thread.sleep(2000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		 logger.info("**** Viewing confirmation message whether data added or not ****");
		if(driver.getPageSource().contains(string))
		{
			 logger.info("**** Verify passed ****");
	  Assert.assertTrue(true);
		}
		else
		{ 
			 logger.info("**** verify Failed ****");
			
			Assert.assertTrue(false);}
	}

	

	
	@When("user enter emailId")
	public void user_enter_emailId() 
	{ logger.info("**** Entering email Address ****");
	   spage.enterEmail("victoria_victoria@nopCommerce.com");
	}

	@When("click on search button")
	public void click_on_search_button() {
		 logger.info("**** Clicking on search Button ****");
	  spage.clickOnSearch();
	  
	}

	@Then("user should find email in the search table")
	public void user_should_find_email_in_the_search_table()
	{
		 logger.info("**** Verifying result by searching email in result ****");
	  boolean actual= spage.searchCustomerByEmailId("victoria_victoria@nopCommerce.com");
	  Assert.assertTrue(actual);
	}
	@When("user enter firstName")
	public void user_enter_firstName()
	{
		 logger.info("**** Entering first name ****");
	   spage.enterFirstName("Brenda");
	}

	@When("user enter lastName")
	public void user_enter_lastName() {
		 logger.info("**** Entering last name ****");
	   spage.enterLastName("Lindgren");
	}

	@Then("user should find first and last in the search table")
	public void user_should_find_first_and_last_in_the_search_table() {
		 logger.info("**** Verifying result by finding first and last name in result ****");
	   boolean status=spage.searchCustomerByName("Brenda Lindgren");
	   Assert.assertEquals(true, status);
	}






}
