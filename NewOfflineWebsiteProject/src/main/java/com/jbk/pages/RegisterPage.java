package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.RegisterPgObjRepo;
import com.utility.Utility;

public class RegisterPage extends RegisterPgObjRepo
{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/register.html" ; 
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
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual Title = " + actualTitle);
		
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
	public boolean heading() 
	{ 	
		String actualHeading = Utility.getText(head);
		log.info("Actual Heading = " + actualHeading);
		
		String expectedHeading = "Java By Kiran" ;
		log.info("Expected Heading = " + expectedHeading);
		
		if(actualHeading.equals(expectedHeading))
		{
			log.info("Actual and Expected Heading matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean alreadyMemberText() 
	{ 	
		String actualAlreadyMemberLinkText = Utility.getText(alreadyMember);
		log.info("Actual Already Member Link Text = " + actualAlreadyMemberLinkText);
		
		String expectedAlreadyMemberLinkText = "I already have a membership" ;
		log.info("Expected Already Member Link Text = " + expectedAlreadyMemberLinkText);
		
		if(actualAlreadyMemberLinkText.equals(expectedAlreadyMemberLinkText))
		{
			log.info("Actual and Expected Already Member Link Text matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Already Member Link Text not matched");
			return false ;
		}
	}
}
