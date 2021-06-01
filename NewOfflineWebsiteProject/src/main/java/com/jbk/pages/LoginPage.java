package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.LoginPgObjRepo;
import com.utility.Utility;

public class LoginPage extends LoginPgObjRepo
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{	
		String expectedUrl = "file:///C:/Offline%20Website/index.html" ; 
		log.info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		log.info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			log.info("Actual and expected Url matched");
			return true ;
		}
			
		else
		{
			log.info("Actual and expected Url not matched");
			return false ;
		}	
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Log in" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual and expected Url not matched");
		
		if(actualTitle.equals(expectedTitle))
		{
			log.info("Actual and expected title matched");
			return true ;
		}
		else 
		{
			log.info("Actual and expected title not matched");
			return false ;	
		}
	}
	
	//3
	public boolean logo() 
	{ 	
		if(Utility.displayed(logo)==true)
		{
			log.info("Logo is displayed");
			return true ;
		}
		else
		{
			log.info("Logo is not displayed");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading() 
	{ 	
		String actualHeading = Utility.getText(mainHeading);
		log.info("Actual Heading = " + actualHeading);
		
		String expectedHeading = "Java By Kiran" ;
		log.info("Expected Heading = " + expectedHeading);
		
		if (actualHeading.equals(expectedHeading))
		{
			log.info("Actual and Expected Headings are matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Headings are matched");
			return false ;
		}
	}
	
	public DashboardPage navigateToDashboardPg() 
	{
		Utility.sendkeys(uname, prop.getProperty("uname"));
		Utility.sendkeys(pass, prop.getProperty("password"));
		Utility.click(lgnBtn);
		
		return new DashboardPage(driver);
	}
	
	public RegisterPage navigateToRegisterPg() 
	{
		Utility.click(registerLink);
		return new RegisterPage(driver);
	}
}
