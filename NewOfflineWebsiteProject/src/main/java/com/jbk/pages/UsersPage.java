package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UsersPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class UsersPage extends UsersPgObjRepo
{
	WebDriver driver;
	
	public UsersPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean alTableHeadings()
	{
		ArrayList <String> actHeading = Utility.getListOfElements(headings);
		log.info("Actual List of Headings = " + actHeading);
		
		ArrayList <String> expHead = Utility.usersTableheadings();
		log.info("Expected List of Headings = " + expHead);
		
		if(actHeading.equals(expHead))
		{
			log.info("Actual and Expected list of Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list of Headings not matched");
			return false ;
		}
	}
	
	//2
	public boolean mobNoLength()
	{
		ArrayList<String>actData = Utility.getListLengthXYZ(mobCol, unameCol, 10);
		log.info("Actual List = " + actData);
		
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Monica");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	public boolean maleGender()
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(genderCol, unameCol, "Male");
		log.info("Actual List = " + actData);
		
		ArrayList<String>expData = new ArrayList<>();
		expData.add("Kiran");
		expData.add("Sagar");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	
	//4
	public boolean unameInOrder()
	{
		ArrayList <String>actData = Utility.getListOfElements(unameCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kimaya");
		expData.add("Kiran");
		expData.add("Monica");
		expData.add("Sagar");
		log.info("Expected List = " + expData);
		
		Collections.sort(actData);
		log.info("Actual List = " + actData);
		
		if(actData.equals(expData))
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


	//5
	public boolean stateMaharashtra()
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(stateCol, unameCol, "Maharashtra");
		log.info("Actual List = " + actData);
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Monica");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	
	//6
	public boolean gmail_com()
	{
		ArrayList<String>actData = Utility.getListContainingXYZ(emailCol, unameCol, "@gmail.com");
		log.info("Actual List = " + actData);
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Kiran");
		expData.add("Sagar");
		expData.add("Monica");
		expData.add("Kimaya");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	
	//7
	public boolean clickDeleteAlertMsg()
	{	
		String msg1 = "You can not delete Default User" ;
		String msg2 = "Are you sure you want to delete this user" ;
		
		ArrayList <String>actData = new ArrayList <String>();
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add(msg1);
		expData.add(msg2);
		expData.add(msg1);
		expData.add(msg2);
		log.info("Expected List = " + expData);
		
		actionCol.get(0).click();
		Alert al = driver.switchTo().alert();
        String Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.accept();
        
        actionCol.get(1).click();
		al = driver.switchTo().alert();
        Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.dismiss();
        
        actionCol.get(2).click();
		al = driver.switchTo().alert();
        Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.accept();
        
        actionCol.get(3).click();
		al = driver.switchTo().alert();
        Message = al.getText();
        actData.add(Message);   
        System.out.println(Message);
        al.dismiss();
        
			if(actData.equals(expData))
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
	
	//8
	public boolean seleniumFaculty()
	{
		ArrayList<String>actData = Utility.getListEqualsXYZ(courseCol, unameCol, "Selenium");
		log.info("Actual List = " + actData);
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Sagar");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	
	//9
	public boolean toolTip()
	{
		ArrayList<String>actData = Utility.getToolTipsList(delete);
		log.info("Actual List = " + actData);
		
		ArrayList<String>expData = new ArrayList<String>();
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		expData.add("Click to Delete");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	
	//10
	public boolean CompleteUsersTable() throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Users");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
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
	
	public AddUserPage navigateToAddUserPage()
	{
		Utility.click(addUserBtn);
		return new AddUserPage(driver);
	}
}
