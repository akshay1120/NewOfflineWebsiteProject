package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DashboardPgObjRepo;
import com.utility.Utility;

public class DashboardPage extends DashboardPgObjRepo
{
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{	
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/dashboard.html" ; 
		log.info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		log.info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			log.info("Actual and Expected Url matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Url not matched");
			return false ;
		}
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			log.info("Actual and Expected title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected title not matched");
			return false ;
		}
	}
	
	//3
	public boolean cornerHeading() 
	{ 	
		String actCornerHeading = Utility.getText(cornerHead);
		log.info("actual Corner Heading = " + actCornerHeading);
		
		String expCornerHeading = "Java By Kiran" ;
		log.info("expected Corner Heading = " + expCornerHeading);
		
		if(actCornerHeading.equals(expCornerHeading))
		{
			log.info("Actual and Expected Corner Heading matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Corner Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading() 
	{
		String actMainHeading = Utility.getText(mainHead);
		log.info("actual Main Heading = " + actMainHeading);
		
		String expMainHeading = "Dashboard Courses Offered" ;
		log.info("expected Main Heading = " + expMainHeading);
		
		if(actMainHeading.equals(expMainHeading))
		{
			log.info("Actual and Expected Main Heading matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Main Heading not matched");
			return false ;
		}
	}
	
	public UsersPage navigateToUsersPg() 
	{
		Utility.click(users);
		return new UsersPage(driver);
	}
	
	public OperatorsPage navigateToOperatorsPg() 
	{
		Utility.click(operators);
		return new OperatorsPage(driver);
	}
	
	public UsefulLinksPage navigateToUsefulLinksPg() 
	{
		Utility.click(usefulLinks);
		return new UsefulLinksPage(driver);
	}
	
	public DownloadsPage navigateToDownloadsPg() 
	{
		Utility.click(downloads);
		return new DownloadsPage(driver);
	}
}
