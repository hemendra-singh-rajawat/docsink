package com.baseFramework.Regression;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseFramework.Lib.AppLibrary;
import com.baseFramework.Lib.TestBase;

import com.baseFramework.PageObject.FileUpload;
import com.baseFramework.PageObject.LoginPage;


	public class FileUploadtest extends TestBase {

		@BeforeClass
		public void setUp() {
			appLibrary = new AppLibrary("LoginFunctionalityTest");
		}

		@Test
		public void loginFunctionalityTest() throws Exception {

			appLibrary.getDriverInstance();
			appLibrary.launchApp();// launching the application in browser
			LoginPage lp = new LoginPage(appLibrary);
			FileUpload ful = new  FileUpload(appLibrary);
			lp.fillLoginDetails("stark@mailinator.com", "Pass@123");
			Thread.sleep(2000);
			ful.clickProfile();
			//ful.clickEditIcon();
			//appLibrary.findElementByXpath("//input[@type='file']").sendKeys("C:\\Users\\HP36\\Downloads\\doc.jfif");
			ful.profile();
		}
			

}
