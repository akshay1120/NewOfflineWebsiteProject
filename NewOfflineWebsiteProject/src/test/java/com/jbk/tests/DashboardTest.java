package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;

public class DashboardTest extends TestBase 
{
	DashboardPage dp = null ;
	LoginPage lp = null ;
	
	@BeforeMethod
	public void openBrowser() throws Exception 
	{
		driver = initialization();
		lp = new LoginPage(driver);
		dp = lp.navigateToDashboardPg();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		log.info("verifying the url");
		Assert.assertTrue(dp.url());
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		log.info("verifying the Title");
		Assert.assertTrue(dp.title());
	}
	
	@Test (priority=3)
	public void verifyCornerHeading () 
	{
		log.info("verifying the Corner Heading");
		Assert.assertTrue(dp.cornerHeading());
	}
	
	@Test (priority=4)
	public void verifyMainHeading() 
	{
		log.info("verifying the Main Heading");
		Assert.assertTrue(dp.mainHeading());
	}
	
	@Test (priority=5)
	public void verifyUserImage() 
	{
		log.info("verifying the User Image");
		Assert.assertTrue(dp.userImage());
	}
	
	@Test (priority=6)
	public void verifyUserName () 
	{
		log.info("verifying the User Name");
		Assert.assertTrue(dp.userName());
	}
	
	@Test (priority=7)
	public void verifyUserStatus () 
	{
		log.info("verifying the User Status");
		Assert.assertTrue(dp.userStatus());
	}
	
	@Test (priority=8)
	public void verifynavigationMenuText () 
	{
		log.info("verifying the navigation Menu Text");
		Assert.assertTrue(dp.navigationMenuText());
	}
	
	@Test (priority=9)
	public void verifyUsersMenu() 
	{
		log.info("verifying the Users Menu");
		Assert.assertTrue(dp.usersMenu());
	}
	
	@Test (priority=10)
	public void verifyOperatorsMenu () 
	{
		log.info("verifying the Operators Menu");
		Assert.assertTrue(dp.operatorsMenu());
	}
	
	@Test (priority=11)
	public void verifyUsefulLinksMenu() 
	{
		log.info("verifying the Useful Links Menu");
		Assert.assertTrue(dp.usefulLinksMenu());
	}
	
	@Test (priority=12)
	public void verifyDownloadsMenu () 
	{
		log.info("verifying the Downloads Menu");
		Assert.assertTrue(dp.downloadsMenu());
	}
	
	@Test (priority=13)
	public void verifyLeftCornerLogOutMenu() 
	{
		log.info("verifying the Left Corner Log Out Menu");
		Assert.assertTrue(dp.leftCornerLogOutMenu());
	}
	
	@Test (priority=14)
	public void verifyRightCornerLogOutLink() 
	{
		log.info("verifying the Left Corner Log Out Link");
		Assert.assertTrue(dp.rightCornerLogOutLink());
	}
	
	@Test (priority=15)
	public void verifyCoursesHeading () 
	{
		log.info("verifying the Courses Headings");
		Assert.assertTrue(dp.coursesHeading());
	}
	
	@Test (priority=16)
	public void verifyCoursesSubHeading () 
	{
		log.info("verifying the Courses Sub Headings");
		Assert.assertTrue(dp.coursesSubHeading());
	}
	
	@Test (priority=17)
	public void verifyCoursesMoreInfo() 
	{
		log.info("verifying the Courses More Info Text");
		Assert.assertTrue(dp.coursesMoreInfo());
	}
	
	@Test (priority=18)
	public void verifyMoreInfoNewWindow () throws Exception 
	{
		log.info("verifying the Courses More Info Links");
		Assert.assertTrue(dp.moreInfoNewWindow());
	}
	
	@Test (priority=19)
	public void verifyFooterStatement () 
	{
		log.info("verifying the Footer Statement");
		Assert.assertTrue(dp.footerStatement());
	}
	
	@Test (priority=20)
	public void verifyJBK_Link () throws Exception 
	{
		log.info("verifying the JBK_Link present at footer");
		Assert.assertTrue(dp.jbk_Link());
	}
	
	@Test (priority=21)
	public void verifySequence () 
	{
		log.info("verifying Sequence of Windows Text");
		Assert.assertTrue(dp.sequence());
	}
	
	@Test (priority=22)
	public void verifyCourseHeading () throws Exception 
	{
		log.info("verifying the Course Heading using Excel");
		Assert.assertTrue(dp.courseHeadingExcel());
	}
	
	@Test (priority=23)
	public void verifyCourseSubHeading () throws Exception 
	{
		log.info("verifying the Course Sub Heading using Excel");
		Assert.assertTrue(dp.courseSubHeadingExcel());
	}
}
