package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UsersPgObjRepo;
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

	
	public AddUserPage navigateToAddUserPage()
	{
		Utility.click(addUserBtn);
		return new AddUserPage(driver);
	}
}
