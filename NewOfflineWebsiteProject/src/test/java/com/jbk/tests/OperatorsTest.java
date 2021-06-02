package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;
import com.jbk.testBase.TestBase;

public class OperatorsTest extends TestBase
{
	OperatorsPage op = null;
	LoginPage lp = null;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		op = lp.navigateToDashboardPg().navigateToOperatorsPg();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifycontactNoLength()
	{
		log.info("verify contact No Length");
		Assert.assertTrue(op.contactNoLength());
	}
	
	@Test (priority=2)
	public void verifyNamesInAlphabeticalOrder()
	{
		log.info("verify Names In Alphabetical Order");
		Assert.assertTrue(op.namesInAlphabeticalOrder());
	}
	
	@Test (priority=3)
	public void verifyPrefferedWayToConnect_WhatsApp()
	{
		log.info("verify Preffered Way To Connect WhatsApp");
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp());
	}
	
	@Test (priority=4)
	public void verifyPrefferedWayToConnect_PhoneCall()
	{
		log.info("verify Preffered Way To Connect PhoneCall");
		Assert.assertTrue(op.prefferedWayToConnect_PhoneCall());
	}
	
	@Test (priority=5)
	public void verifyPrefferedWayToConnect_WhatsApp_And_PhoneCall()
	{	
		log.info("verify Preffered Way To Connect WhatsApp And PhoneCall");
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp_And_PhoneCall());
	}
	
	@Test (priority=6)
	public void verifyPrefferedWayToConnect_WhatsApp_ButNot_PhoneCall()
	{
		log.info("verify Preffered Way To Connect WhatsApp But Not Phone Call");
		Assert.assertTrue(op.prefferedWayToConnect_WhatsApp_ButNot_PhoneCall());
	}
	
	@Test (priority=7)
	public void verifyFacultiesAvailableOnMonday()
	{
		log.info("verify Faculties Available On Monday");
		Assert.assertTrue(op.facultiesAvailableOnMonday());
	}
	
	@Test (priority=8)
	public void verifyFacultiesNotAvailableOnSunday()
	{
		log.info("verify Faculties Not Available On Sunday");
		Assert.assertTrue(op.facultiesNotAvailableOnSunday());
	}
	
	@Test (priority=9)
	public void verifyComplete_OperatorsTable() throws Exception
	{
		log.info("verify Complete Operators Table");
		Assert.assertTrue(op.CompleteOperatorsTable());
	}
}
