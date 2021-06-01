package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;

public class LoginTest extends TestBase
{
	LoginPage lp = null ;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyUrlOfLoginPage()
	{
		log.info("verifying the url");
		Assert.assertTrue(lp.url());
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		log.info("verifying the title");
		Assert.assertTrue(lp.title());
	}
	
	@Test (priority = 3)
	public void verifyLogo()
	{
		log.info("verifying the logo");
		Assert.assertTrue(lp.logo());
	}
	
	@Test (priority=4)
	public void verifyMainHeading()
	{
		log.info("verifying the MainHeading");
		Assert.assertTrue(lp.mainHeading());
	}
}
