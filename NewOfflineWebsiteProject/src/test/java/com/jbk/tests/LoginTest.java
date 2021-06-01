package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;
import com.utility.ExcelUtility;

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
	
	@Test (priority=5)
	public void verifySubHeading()
	{
		log.info("verifying the subHeading");
		Assert.assertTrue(lp.subHeading());
	}
	
	@Test (priority=6)
	public void verifySignInBoxHeading()
	{
		log.info("verifying the signInBoxHeading");
		Assert.assertTrue(lp.signInBoxHeading());
	}
	
	@Test (priority=7)
	public void verifyPlaceholders()
	{
		log.info("verifying the placeholders");
		Assert.assertTrue(lp.placeholders());
	}
	
	@Test (priority=8)
	public void verifyValidLogIn()
	{
		log.info("verifying the valid LogIn");
		Assert.assertTrue(lp.validLogIn());
	}
	
	@Test (priority=9)
	public void verifyLogoutSuccessfullyMessage()
	{
		log.info("verifying the logout Successfully Message");
		Assert.assertTrue(lp.logoutSuccessfullyMessage());
	}
	
	@Test (priority=10)
	public void verifyInvalidLogIn()
	{
		log.info("verifying the invalid LogIn");
		Assert.assertTrue(lp.invalidLogIn());
	}
	
	@Test (priority=11)
	public void verifyInvalidLogInErrorMessage()
	{
		log.info("verifying the invalid Log In Error Message");
		Assert.assertTrue(lp.invalidLogInErrorMessage());
	}
	
	@Test (priority=12)
	public void verifyBlankLogInErrorMessage()
	{
		log.info("verifying the blank Log In Error Message");
		Assert.assertTrue(lp.blankLogInErrorMessage());
	}
	
	@Test (priority=13)
	public void verifyRegisterLinkText()
	{
		log.info("verifying the register Link Text");
		Assert.assertTrue(lp.registerLinkText());
	}
	
	@Test (priority=14)
	public void verifyRegisterLink()
	{
		log.info("verifying the register Link");
		Assert.assertTrue(lp.registerLink());
	}
	
	@Test (priority=15)
	public void loginWithAlldata()throws Exception
	{
		log.info("verifying the Login Without Heading Excel Data");
		lp.loginWithAllData(ExcelUtility.readUnameAndPass("Data.xlsx", "LoginWithoutHeading", 0, 1 , 0));
	}
}
