package com.baseFramework.PageObject;

import org.testng.Assert;

import com.baseFramework.Lib.AppLibrary;

public class PatientCreation {

	AppLibrary appLibrary;
	public String emailInput = "xpath:-://input[@id='email']";
	public String passwordInput = "xpath:-://input[@id='password']";
	public String signInButton = "xpath:-://button[text()='Sign in']";
	public String patients = "xpath:-://i[@class='fal fa-id-card']";
	public String addNewPatients = "xpath:-://a[@id='add-new-patient']";
	public String appAlert = "xpath:-://i[@class='fa fa-times']";
	public String firstName = "xpath:-://input[@id='fname']";
	public String lastName = "xpath:-://input[@id='lname']";
	public String dob = "xpath:-://input[@id='patient-dob']";
	public String email = "xpath:-://input[@id='email']";
	public String redioButton = "xpath:-://label[@id='send-invite-label']";
	public String selectDropDown = "xpath:-://select[@id='patient-arc-communication-preference']";
	public String selectEmail = "xpath:-://option[text()='Email']";
	public String saveButton = "xpath:-://button[text()='Save']";
	public String okButton = "xpath:-://button[text()='OK']";
	public String searchBox = "xpath:-://input[@id='search']";
	public String mailinatorMail = "xpath:-://td[@class='ng-binding']";
	public String goButton = "xpath:-://button[text()='GO']";
	public String clickHereLink = "xpath:-://a[text()='Click Here']";
	public String password = "xpath:-://input[@placeholder='Enter your new password']";
	public String confirmPassword = "xpath:-://input[@placeholder='Enter your password again']";
	public String checkBox = "xpath:-://input[@id='remember']";
	public String registerButton = "xpath:-://button[@class='submit-btn green-bg-btn']";
	
	public PatientCreation(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public void verifyLoginPageUi() throws Exception {
		appLibrary.verifyElement(emailInput, true, 0);
		appLibrary.verifyElement(passwordInput, true, 0);
		appLibrary.verifyElement(patients , true, 0);
		appLibrary.verifyElement(addNewPatients, true, 0);
	    appLibrary.verifyElement(firstName, true, 0);
	    appLibrary.verifyElement(lastName, true, 0);
	    appLibrary.verifyElement(dob, true, 0);
	    appLibrary.verifyElement(email, true, 0);
	    appLibrary.verifyElement(selectDropDown, true, 0);
		appLibrary.verifyElement(selectEmail, true, 0);
	    appLibrary.verifyElement(saveButton, true, 0);

	}
	
	public void fillLoginDetails(String email, String pass) throws Exception {
		appLibrary.enterText(emailInput, email);
		appLibrary.enterText(passwordInput, pass);
		appLibrary.clickElement(signInButton);

	}
public void clickPatients() throws Exception {
	appLibrary.clickElement(patients);
}
	
public void clickAddNewPatients() throws Exception {
	appLibrary.clickElement(addNewPatients);
}

public void dismissAlert() throws Exception {
	appLibrary.clickElement(appAlert);
}

public void fillDetails() throws Exception {
 
	appLibrary.enterText(firstName, "harry");
	appLibrary.enterText(lastName, "rider");
	appLibrary.enterText(dob, "01/09/1999");
	appLibrary.enterText(email, "harryrider@mailinator.com");
	appLibrary.clickElement(redioButton);
	appLibrary.clickElement(selectDropDown);
	appLibrary.clickElement(selectEmail);
	appLibrary.clickElement(saveButton);
	appLibrary.clickElement(okButton);	
}
public void emailVerification() throws Exception {
	appLibrary.launchApp("https://www.mailinator.com");
	appLibrary.enterText(searchBox, "harryrider");
	appLibrary.clickElement(goButton);
	appLibrary.clickElement(mailinatorMail);
	appLibrary.switchToFrame("html_msg_body");
	appLibrary.scrollIframe();
    appLibrary.clickElement(clickHereLink);
    appLibrary.SwitchWindow();
    appLibrary.enterText(password, "Pass@123");
    appLibrary.enterText(confirmPassword, "Pass@123");
    appLibrary.clickElement(checkBox);
    appLibrary.clickElement(registerButton);
	
	
}




	}

