package com.baseFramework.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseFramework.Lib.AppLibrary;
import com.baseFramework.Lib.TestBase;
import com.baseFramework.PageObject.CheckInspage;
import com.baseFramework.PageObject.DashBoardPage;
import com.baseFramework.PageObject.DashBoardPage2;
import com.baseFramework.PageObject.LoginPage;

public class CheckInsTest extends TestBase {

	@BeforeClass
	public void setUp() {
		appLibrary = new AppLibrary("LoginFunctionalityTest");
	}

	@Test
	public void loginFunctionalityTest() throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();// launching the application in browser
		LoginPage lp = new LoginPage(appLibrary);
		CheckInspage cip = new  CheckInspage(appLibrary);
		lp.fillLoginDetails("stark@mailinator.com", "Pass@123");
		Thread.sleep(2000);
		
		 cip.clickCheckIns();
	 cip.clickAddCheckIns();
	 cip.clickace();
		 cip.clickbodyMass();
		 cip.clickSleep();
		 cip.clickAddNotes();
	 cip.clickCancelButton();
		 cip.clickConnectDevice();
		
		
		
				
	}

}
