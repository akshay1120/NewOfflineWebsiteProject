package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DashboardPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;
import com.utility.WindowHandlingUtility;

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

	//5
	public boolean userImage() 
	{	
		if(Utility.displayed(userImg)==true)
		{
			log.info("User Image is displayed");
			return true ;
		}
		else
		{
			log.info("User Image is not displayed");
			return false ;
		}
	}
	
	//6
	public boolean userName () 
	{
		String actUserName = Utility.getText(userName);
		log.info("actual User Name = " + actUserName);
		
		String expUserName = "Kiran" ;
		log.info("expected User Name = " + expUserName);
		
		if(actUserName.equals(expUserName))
		{
			log.info("Actual and Expected User Name matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected User Name not matched");
			return false ;
		}
	}
	
	//7
	public boolean userStatus () 
	{
		String actUserStatus  = Utility.getText(userStatus);
		log.info("actual User Status = " + actUserStatus);
		
		String expUserStatus  = "Online" ;
		log.info("expected User Status = " + expUserStatus);
		
		if(actUserStatus.equals(expUserStatus))
		{
			log.info("Actual and Expected User Status matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected User Status not matched");
			return false ;
		}
	}
	
	//8
	public boolean navigationMenuText() 
	{	
		ArrayList <String> actNavigationMenuText = Utility.getListOfElements(navMenu);
		log.info("actual Navigation Menu Texts = " + actNavigationMenuText);
		
		ArrayList <String>expNavigationMenuText =  Utility.dashboardPgNavMenu();
		log.info("expected Navigation Menu Text = " + expNavigationMenuText);
		
		if(actNavigationMenuText.equals(expNavigationMenuText))
		{
			log.info("Actual and Expected Navigation Menu Text matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Navigation Menu Text not matched");
			return false ;
		}
	}
	
	//9
	public boolean usersMenu() 
	{
		Utility.click(users);
		
		String actTitle = Utility.getTitle(driver);
		log.info("actual users Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | User" ;
		log.info("expected users Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected users Menu Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected users Menu Title not matched");
			return false ;
		}
	}
	
	//10
	public boolean operatorsMenu () 
	{
		Utility.click(operators);
		
		String actTitle = Utility.getTitle(driver);
		log.info("actual operators Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Operators" ;
		log.info("expected operators Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected operators Menu Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected operators Menu Title not matched");
			return false ;
		}
	}
	
	//11
	public boolean usefulLinksMenu() 
	{
		Utility.click(usefulLinks);
		
		String actTitle =  Utility.getTitle(driver);
		log.info("actual useful Links Menu Title " + actTitle);
		
		String expTitle = "JavaByKiran | Useful Links" ;
		log.info("expected useful Links Menu Title " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected useful Links Menu Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected useful Links Menu Title not matched");
			return false ;
		}
	}
	
	
	//12
	public boolean downloadsMenu () 
	{
		Utility.click(downloads);
		
		String actTitle = Utility.getTitle(driver);
		log.info("actual downloads Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Downloads" ;
		log.info("expected downloads Menu Title = " + expTitle);
		
		Utility.click(dashboard);
		
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected downloads Menu Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected downloads Menu Title not matched");
			return false ;
		}
	}
	
	//13
	public boolean leftCornerLogOutMenu() 
	{
		Utility.click(leftLgOut);
		
		String actTitle = Utility.getTitle(driver);
		log.info("actual left Corner LogOut Menu Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Log in" ;
		log.info("actual left Corner LogOut Menu Title = " + expTitle);
		
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected left Corner LogOut Menu Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected left Corner LogOut Menu Title not matched");
			return false ;
		}
	}
	
	//14
	public boolean rightCornerLogOutLink() 
	{
		Utility.click(rightLgOut);
		
		String actTitle = Utility.getTitle(driver);
		log.info("actual Right Corner LogOut Link Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Log in" ;
		log.info("expected Right Corner LogOut Link Title = " + expTitle);
				
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected Right Corner LogOut Link Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Right Corner LogOut Link Title not matched");
			return false ;
		}
	}
	
	//15
	public boolean coursesHeading () 
	{
		ArrayList <String>actCoursesHeadings  = Utility.getListOfElements(courseHeading);
		log.info("actual Courses Headings = " + actCoursesHeadings);
		
		ArrayList <String>expCoursesHeadings = new ArrayList <String>();
		expCoursesHeadings.add("Selenium");
		expCoursesHeadings.add("Java / J2EE");		
		expCoursesHeadings.add("Python");
		expCoursesHeadings.add("Php");
		log.info("actual Courses Headings = " + expCoursesHeadings);
		
		if(actCoursesHeadings.equals(expCoursesHeadings))
		{
			log.info("Actual and Expected Courses Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Courses Headings not matched");
			return false ;
		}
	}
	
	//16
	public boolean coursesSubHeading () 
	{	
		ArrayList <String>actCoursesSubHeadings  = Utility.getListOfElements(courseSubHeading);
		log.info("actual Courses Sub Headings = " + actCoursesSubHeadings);
		
		ArrayList <String>expCoursesSubHeadings = new ArrayList <String>();
		expCoursesSubHeadings.add("Automation Testing");
		expCoursesSubHeadings.add("Software Development");		
		expCoursesSubHeadings.add("Data Science");
		expCoursesSubHeadings.add("Web Development");
		log.info("expected Courses Sub Headings = " + expCoursesSubHeadings);
		
		if(actCoursesSubHeadings.equals(expCoursesSubHeadings))
		{
			log.info("Actual and Expected Courses Sub Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Courses Sub Headings not matched");
			return false ;
		}
	 }
	
	//17
	public boolean coursesMoreInfo() 
	{	
		ArrayList <String>actMoreInfoTags  = Utility.getListOfElements(moreInfo);
		log.info("actual MoreInfo Tags = " + actMoreInfoTags);
		
		ArrayList <String>expMoreInfoTags = new ArrayList <String>();
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");		
		expMoreInfoTags.add("More info");
		expMoreInfoTags.add("More info");
		log.info("actual MoreInfo Tags = " + expMoreInfoTags);
		
		if(actMoreInfoTags.equals(expMoreInfoTags))
		{
			log.info("Actual and Expected MoreInfo Tags matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected MoreInfo Tags not matched");
			return false ;
		}
	}
	
	//18
	public boolean moreInfoNewWindow () throws Exception 
	{	
		ArrayList <String> expNewWindowUrls = new ArrayList <String>();
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/examples/dashboard.html#");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/python-syllabus.pdf");		
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/java-j2ee-syllabus-jbk.pdf");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/selenium-testing-syllabus-jbk.pdf");
		log.info("expected New Window Urls = " + expNewWindowUrls);
		
		ArrayList <String> actNewWindowUrls  = WindowHandlingUtility.getWindowsUrls(driver ,moreInfo);
		log.info("actual New Window Urls = " + actNewWindowUrls);
		
		if(actNewWindowUrls.equals(expNewWindowUrls))
		{
			log.info("Actual and Expected New Window Urls matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected New Window Urls not matched");
			return false ;
		}
	}
	
	//19
	public boolean footerStatement () 
	{
		String actfooter = Utility.getText(footer);
		log.info("Actual footer Statement = " + actfooter);
		
		String expfooter = "Design for Selenium Automation Test V 2.3.0\n" +"Copyright © 2005-2019 JavaByKiran. All rights reserved.";
		log.info("expected footer Statement = " + expfooter);
		
		if(actfooter.equals(expfooter))
		{
			log.info("Actual and Expected footer Statement matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected footer Statement not matched");
			return false ;
		}
	}
	
	//20
	public boolean jbk_Link () throws Exception 
	{	
		String actWindowTitle = WindowHandlingUtility.getWindowTitle(driver , jbkLink);
		log.info("actual Window Title = " + actWindowTitle);
		
		String expWindowTitle = "Java Classes in Pune | Selenium Training | Python Courses in pune";
		log.info("expected Window Title = " + expWindowTitle);
		
		if(actWindowTitle.equals(expWindowTitle))
		{
			log.info("Actual and Expected Window Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Window Title not matched");
			return false ;
		}
	}
	
	//21
	public boolean sequence () 
	{
		String actSequence = Utility.getText(sequence);
		log.info("actual Sequence = " + actSequence);
		
		String expSequence = "Home Dashboard";
		log.info("expected Sequence = " + expSequence);
		
		if(actSequence.equals(expSequence))
		{
			log.info("Actual and Expected Sequence matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Sequence not matched");
			return false ;
		}
	}
	
	//22
	public boolean courseHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseHeading);
		log.info("Actual course Heading = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 0 , 1 );
		log.info("Expected course Heading = " + expData);
		
		if(actData.equals(expData))
		{
			log.info("Actual and Expected course Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected course Headings not matched");
			return false ;
		}
	}
	
	//23
	public boolean courseSubHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseSubHeading);
		log.info("Actual course Sub Headings = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 1 , 1 );
		log.info("Expected course Sub Headings = " + expData);
		
		if(actData.equals(expData))
		{
			log.info("Actual and Expected course Sub Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected course Sub Headings not matched");
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
