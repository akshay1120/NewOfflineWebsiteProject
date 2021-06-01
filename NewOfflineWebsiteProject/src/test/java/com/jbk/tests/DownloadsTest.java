package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DownloadsPage;
import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;

public class DownloadsTest extends TestBase
{
	DownloadsPage dpg = null;
	LoginPage lp = null;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		dpg = lp.navigateToDashboardPg().navigateToDownloadsPg();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyOperatingSystem_32bit()
	{
		log.info("verify Operating System 32bit");
		Assert.assertTrue(dpg.operatingSystem_32bit());
	}
	
	@Test (priority=2)
	public void verifyCommon()
	{
		log.info("verify Operating System Common");
		Assert.assertTrue(dpg.common());
	}
	
	@Test (priority=3)
	public void verifyNone()
	{
		log.info("verify None Operating System");
		Assert.assertTrue(dpg.none());
	}
	
	@Test (priority=4)
	public void verifyComplete_DownloadsTable() throws Exception
	{
		log.info("verify Complete Downloads Table");
		Assert.assertTrue(dpg.completeDownloadsTable());
	}
}
