package com.baseFramework.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseFramework.Lib.AppLibrary;
public class FileUpload {
	
	AppLibrary appLibrary;
	//public String dropDown = "xpath:-://button[@id='dropdown-custom-components']";
	public String profile = "xpath:-://span[text()='Settings']";
	public String editIcon = "xpath:-://input[@type='file']";
	
	
	public FileUpload(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}
//
//	public void FileUpload() throws Exception
//	{
//		//appLibrary.verifyElement(dropDown, true, 0);
//	    appLibrary.verifyElement(profile, true, 0);
//		appLibrary.verifyElement(editIcon, true, 0);
//	}
	
	//public void clickDropDown() throws Exception 
	{
//		appLibrary.clickElement(dropDown);
	}
	
	public void clickProfile() throws Exception 
	{
		appLibrary.clickElement(profile);
	}
//	public void clickEditIcon() throws Exception 
//	{
//		appLibrary.clickElement(editIcon);
//	
//	}

	public  void profile() throws Exception
	{
		//appLibrary.createFile("C:\\Users\\HP36\\Downloads", "doc.jfif");
		//appLibrary.findElementByXpath(editIcon).sendKeys("C:\\Users\\HP36\\Downloads\\doc.jfif");
		appLibrary.enterImage(editIcon,"C:\\Users\\HP36\\Downloads\\docs.jfif");
	}
	
}
