package com.baseFramework.Regression;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseFramework.Lib.AppLibrary;
import com.baseFramework.Lib.TestBase;
import com.baseFramework.PageObject.DashBoardPage;
import com.baseFramework.PageObject.DashBoardPage2;
import com.baseFramework.PageObject.LoginPage;
import com.baseFramework.PageObject.PatientCreation;


public class PatientCreationTest extends TestBase {
	
	
	

	@BeforeClass
	public void setUp() {
		appLibrary = new AppLibrary(" PatientCreationTest");
	}

	@Test
	public void  PatientCreationTest() throws Exception {	
		appLibrary.getDriverInstance();
		appLibrary.launchApp();// launching the application in browser
		PatientCreation lp = new PatientCreation(appLibrary);
		lp.fillLoginDetails("dseals+admin@docsink.com", "Beer2nite!");
		Thread.sleep(5000);
		lp.dismissAlert();
		lp.clickPatients();
     	lp.clickAddNewPatients();
		lp.fillDetails();
		lp.emailVerification();		
	}

}
