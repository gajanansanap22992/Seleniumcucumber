package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage  addcust;
	public static Logger logger;
	public  Properties property;
	
	public static String randomString()
	{
		String string=RandomStringUtils.randomAlphabetic(5);
		return string;
	}
	

}
