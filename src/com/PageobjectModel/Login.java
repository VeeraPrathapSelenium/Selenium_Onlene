package com.PageobjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ManageExcel.ManageExcel;

public class Login  {
	

@FindBy(how=How.ID,using="txtUsername")
	
WebElement Edi_username_ID;

@FindBy(how=How.ID,using="txtPassword")

WebElement Edi_password_ID;

@FindBy(how=How.ID,using="btnLogin")
WebElement Btn_Login_ID;


@FindBy(how=How.ID,using="welcome")
WebElement Lnk_Welcome;

@FindBy(how=How.PARTIAL_LINK_TEXT,using="Logout")
WebElement Lnk_logout;



	public  WebDriver driver;
	
	public  void launchApplication(WebDriver driver)
	{
		this.driver=driver;
		
		driver.navigate().to("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				
	}
	
	
	public void login(String testcase,int iteration) throws IOException
	{
		
		
		ManageExcel exl= new ManageExcel();
		
		int rownum=exl.getTestcaseRow(testcase, iteration, "login");
		
		String uname=exl.workbook.getSheet("login").getRow(rownum).getCell(2).getStringCellValue();
		String pwd=exl.workbook.getSheet("login").getRow(rownum).getCell(3).getStringCellValue();
		
		Edi_username_ID.sendKeys(uname);
		Edi_password_ID.sendKeys(pwd);
		Btn_Login_ID.click();
		
	}
	
	
	
	public void logout() throws InterruptedException
	{
		Lnk_Welcome.click();
		
		
		Lnk_logout.click();
		Thread.sleep(3000);
	}
	
	
	

}
