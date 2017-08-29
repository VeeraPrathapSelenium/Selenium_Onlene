package com.TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageobjectModel.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Tc_01_ApplyLeave {
	public String classname=new Object() {}.getClass().getName();
	String sbstr=classname.substring(classname.lastIndexOf(".")+1);
	
	public String testcasename=sbstr.replace("$1", "");
	
	
	public ExtentReports extent;
	
	public ExtentTest test;
	
	
	@BeforeTest
	
	public void intiateReports()
	{
		
		
	}
	
	
	@BeforeMethod
	
	public void startReport()
	{
		
	}
	
	@AfterMethod
	public void endReport()
	{
		
	}
	
	
	@AfterTest
	public void flusgReport()
	{
		
		
	}
	
	
	
	@Test
	
	public void execute_Tc_01_ApplyLeave() throws IOException, InterruptedException
	{
		
		//Launching Application
		WebDriver driver=new FirefoxDriver();
		
		Login lgn=PageFactory.initElements(driver, Login.class);
		
		lgn.launchApplication(driver);

		
		for(int i=1;i<=9;i++)
		{
		lgn.login(testcasename,i);
		
		
		//Loging out
		lgn.logout();
		
		
		}
	}
	
	
	
	
	
	

}
