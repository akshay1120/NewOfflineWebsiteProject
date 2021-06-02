package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.AddUserPage;
import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;

public class AddUserTest extends TestBase
{
	AddUserPage ap = null;
	LoginPage lp = null;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ap = lp.navigateToDashboardPg().navigateToUsersPg().navigateToAddUserPage();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyPrintingDragDownOptions()
	{
		log.info("verify Printing Drag Down Options using Al");
		testLog = extent.createTest("verify Printing Drag Down Options using Al");
		Assert.assertTrue(ap.printingDragDownOptions(testLog));
	}
	
	@Test (priority=2)
	public void verifyprintingDragDownOptExcel() throws Exception
	{
		log.info("verify Printing Drag Down Options using Excel");
		testLog = extent.createTest("verify Printing Drag Down Options using Excel");
		Assert.assertTrue(ap.printingDragDownOptExcel(testLog));
	}
	
	@Test (priority=3)
	public void verifyValidAddUser() throws Exception
	{
		log.info("verify Valid Add User");
		testLog = extent.createTest("verify Valid Add User");
		Assert.assertTrue(ap.validAddUser(testLog));
	}
}
