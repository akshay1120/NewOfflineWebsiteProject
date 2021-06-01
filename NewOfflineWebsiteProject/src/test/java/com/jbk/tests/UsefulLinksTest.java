package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.UsefulLinksPage;
import com.jbk.testBase.TestBase;

public class UsefulLinksTest extends TestBase
{
	UsefulLinksPage ulp = null;
	LoginPage lp = null;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ulp = lp.navigateToDashboardPg().navigateToUsefulLinksPg();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyClickGO() throws Exception
	{
		log.info("verify GO Links using Al");
		Assert.assertTrue(ulp.clickGO());
	}
	
	@Test (priority=2)
	public void verifyClickGoExcel() throws Exception
	{
		log.info("verify GO Links using Excel");
		Assert.assertTrue(ulp.clickGoExcel());
	}
	
	@Test (priority=3)
	public void verifyComplete_UsefulLinksTable() throws Exception
	{
		log.info("verify Complete Useful Links Table");
		Assert.assertTrue(ulp.complete_UsefulLinksTable());
	}
}
