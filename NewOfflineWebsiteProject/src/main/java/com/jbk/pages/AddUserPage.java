package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.objectRepository.AddUserPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class AddUserPage extends AddUserPgObjRepo
{
	WebDriver driver;
	
	public AddUserPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean printingDragDownOptions(ExtentTest test)
	{
		ArrayList <String> expDragDownOptions  = new ArrayList <String>();
		expDragDownOptions.add("--Select State--");
		expDragDownOptions.add("Maharashtra");
		expDragDownOptions.add("Delhi");
		expDragDownOptions.add("HP");
		expDragDownOptions.add("Punjab");
		log.info("Expected List = " + expDragDownOptions);
		
		Select selectstate = new Select(selectState);
		
		List <WebElement> list = selectstate.getOptions();
		
		ArrayList <String> actDragDownOptions = Utility.getListOfElements(list);
		log.info("Actual List = " + actDragDownOptions);
		
		if(actDragDownOptions.equals(expDragDownOptions))
		{
			log.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false ;
		}
	}
	
	//2
	public boolean printingDragDownOptExcel(ExtentTest test) throws Exception
	{
		ArrayList <String> expDragDownOptions  = ExcelUtility.getTableColData("Data.xlsx", "DragDown", 0, 0);
		log.info("Expected List = " + expDragDownOptions);
		
		Select selectstates = new Select(selectState);
		
		List <WebElement> list = selectstates.getOptions();
		
		ArrayList <String> actDragDownOptions = Utility.getListOfElements(list);
		log.info("Actual List = " + actDragDownOptions);
		
		if(actDragDownOptions.equals(expDragDownOptions))
		{
			log.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false ;
		}
	}
	
	//3
	public boolean validAddUser(ExtentTest test) throws Exception
	{
		Utility.sendkeys(userName, "Asj");
		Utility.sendkeys(mobile, "940000000000");
		Utility.sendkeys(email, "aj@gmail.com");
		Utility.sendkeys(course, "Java");
		Utility.click(genderMale);
		Utility.click(maharashtra);
		Utility.sendkeys(pass, "asdfgh");
		Utility.click(submitBtn);
		Thread.sleep(2000);
		
		String actMsg = Utility.getAlertMsg_accept(driver);
		log.info("Actual Alert Message = " + actMsg);
		
		String expMsg = "User Added Successfully. You can not see added user.";
		log.info("expected Alert Message = " + expMsg);
		
		if(actMsg.equals(expMsg))
		{
			log.info("Actual and expected Alert Message matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected Alert Message not matched");
			return false ;
		}
	}
}
