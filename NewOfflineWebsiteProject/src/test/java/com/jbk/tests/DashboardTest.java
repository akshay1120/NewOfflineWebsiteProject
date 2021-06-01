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
}
