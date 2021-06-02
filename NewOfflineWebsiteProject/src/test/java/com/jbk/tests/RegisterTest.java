package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.RegisterPage;
import com.jbk.testBase.TestBase;

public class RegisterTest extends TestBase
{
	RegisterPage rp = null ;
	LoginPage lp = null ;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization() ;
		lp = new LoginPage(driver) ;
		rp = lp.navigateToRegisterPg() ;
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close() ;
	}
	
	@Test (priority=1)
	public void verifyUrl()
	{
		log.info("verify Url");
		Assert.assertTrue(rp.url());
	}
	
	@Test (priority=2)
	public void verifyTitle()
	{
		log.info("verify Title");
		Assert.assertTrue(rp.title());
	}
	
	@Test(priority=3)
	public void verifyHeading() 
	{ 
		log.info("verify Heading");
		Assert.assertTrue(rp.heading());
	}
	
	@Test(priority=4)
	public void verifyAlreadyMemberText() 
	{ 
		log.info("verify Already Member Text");
		Assert.assertTrue(rp.alreadyMemberText());
	}
	
	@Test(priority=5)
	public void verifyAlreadyMemberLink() 
	{
		log.info("verify Already Member Link");
		Assert.assertTrue(rp.alreadyMemberLink());
	}
	
	@Test(priority=6)
	public void verifyPlaceholders() 
	{ 
		log.info("verify Placeholders");
		Assert.assertTrue(rp.placeholders());
	}
	
	@Test(priority=7)
	public void verifyBlankSignIn() 
	{
		log.info("verify Blank Sign In");
		Assert.assertTrue(rp.blankSignIn());
	}
	
	@Test(priority=8)
	public void verifyValidSignIn() 
	{
		log.info("verify Valid Sign In");
		Assert.assertTrue(rp.validSignIn());
	}
}
