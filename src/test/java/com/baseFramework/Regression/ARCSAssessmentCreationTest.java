package com.baseFramework.Regression;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseFramework.Lib.AppLibrary;
import com.baseFramework.Lib.TestBase;
import com.baseFramework.PageObject.ARCSAssessmentCreation;
import com.baseFramework.PageObject.DashBoardPage;
import com.baseFramework.PageObject.DashBoardPage2;
import com.baseFramework.PageObject.LoginPage;


public class ARCSAssessmentCreationTest extends TestBase {
	
	
	

	@BeforeClass
	public void setUp() {
		appLibrary = new AppLibrary("ARCSAssessmentCreation");
	}

	
	@Test
	public void  ARCSAssessmentCreation() throws Throwable {	
		appLibrary.getDriverInstance();
		appLibrary.launchApp();// launching the application in browser
		ARCSAssessmentCreation aac = new ARCSAssessmentCreation(appLibrary);
		aac.fillLoginDetails("dseals+admin@docsink.com", "Beer2nite!");
		Thread.sleep(5000);
		//aac.clickTeamBuilder();
		aac.clickCube();
		aac.ClickpatientMessangerAppt();
		aac.clickARCS();
		aac.clickCreateARCS();
	}

}
