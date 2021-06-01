package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.OperatorsPgObjRepo;
import com.utility.Utility;

public class OperatorsPage  extends OperatorsPgObjRepo
{
	WebDriver driver;
	
	public OperatorsPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean contactNoLength()
	{	
		System.out.println("Actual Faculties having 10 digit Mobile No. : ");
		
		ArrayList <String>actData = Utility.getListLengthXYZ(contactCol, personCol, 10);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
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
	
	//2
	public boolean namesInAlphabeticalOrder()
	{
		ArrayList <String>actData = Utility.getListOfElements(personCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Darshit");
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		log.info("Expected List = " + expData);
		
		Collections.sort(actData);
		log.info("Actual List = " + actData);
		
		/*System.out.println(actData);
		
		for (String i : actData)
		{
			System.out.println(i);
		}*/
		
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
	public boolean prefferedWayToConnect_WhatsApp()
	{	
		System.out.println("Actual Faculties available on WhatsApp : ");
		
	  	ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Whats App");
	  	log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
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
	public boolean prefferedWayToConnect_PhoneCall()
	{	
		System.out.println("Actual Faculties available on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Phone Call");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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
}
