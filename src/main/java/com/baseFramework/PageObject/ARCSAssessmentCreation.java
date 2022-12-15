package com.baseFramework.PageObject;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;

import com.baseFramework.Lib.AppLibrary;

public class ARCSAssessmentCreation {

	AppLibrary appLibrary;
	public String emailInput = "xpath:-://input[@id='email']";
	public String passwordInput = "xpath:-://input[@id='password']";
	public String signInButton = "xpath:-://button[text()='Sign in']";
	public String teamBuilder = "xpath:-://span[text()='Team Builder']";
	public String cube = "xpath:-://i[@class='fal fa-cube']";
	public String patientMessangerApp = "xpath:-://span[text()='Patient Messenger']";
	public String ARCS = "xpath:-://span[text()='ARCS']";
	public String createARCS = "xpath:-://span[@data-i18n='nav.deviceless_rpm']";
	public String title = "xpath:-://input[@placeholder='Title']";
	public String surveyFlag = "xpath:-://select[@id='survey_flag']";
	public String surveyFlagSelect = "xpath:-://select[@id='survey_flag']//option[text()='ARCS Kidney']";
	public String description = "xpath:-://textarea[@placeholder='Description']";
	public String conditions = "xpath:-://input[@placeholder='Search to find an ICD 10 Diagnosis code']";
	public String conditionSelect = "xpath:-://li[text()='N15.1 - Kidney abscess']";
	public String okButten = "xpath:-://button[text()='OK']";
	public String nextbutton1 = "xpath:-://button[text()='Next']";
//	public String codeBabyAvtar = "xpath:-://label[@for='code_baby_id']";
//	public String newAssessmentId = "xpath:-://label[@for='new_assessment_ui']";
	public String nextbutton2 = "xpath:-://button[text()='Next']";
	public String okButten2 = "xpath:-://button[text()='OK']";
	public String nextbutton3 = "xpath:-://button[text()='Next']";
	public String addquestions = "xpath:-://button[normalize-space()='Add Question']";
	public String medicalFollowUp = "xpath:-://button[@id='medication_follow_up']";
	public String saveButton = "xpath:-://form[@id='quesForm_deviceless_rpm1']//button[contains(@type,'button')][normalize-space()='Save']";
	public String okButten4 = "xpath:-://button[text()='OK']";
	public String nextbutton4 = "xpath:-://button[text()='Next']";
	public String  switchMonday= "xpath:-:xpath:-://label[normalize-space()='Monday']//span[contains(@class,'checkmark')]";
	public String mondayAllDay = "xpath:-://label[contains(@for,'mon_all_day')]";
	public String nextbutton5 = "xpath:-://button[text()='Next']";
	public String okButten3 = "xpath:-://button[text()='OK']";
	public String browserTest = "xpath:-://label[normalize-space()='accept']";
    public String smsTest = "xpath:-://form[@id='surveyType']//label[contains(@class,'form-label')][normalize-space()='SMS']//span[@class='checkmark']";
    public String voiceTest = "xpath:-://div[@role='form']//div//div//form//div//div//label[contains(text(),'Voice')]//span";
	public String finishButton = "xpath:-://button[text()='Finish']";
	public String inactive = "xpath:-://div[@data-id='NjAzNA==']";
	
	public ARCSAssessmentCreation(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public void verifyLoginPageUi() throws Exception {
		appLibrary.verifyElement(emailInput, true, 0);
		appLibrary.verifyElement(passwordInput, true, 0);
		appLibrary.verifyElement(teamBuilder , true, 0);
		appLibrary.verifyElement(cube, true, 0);
	    appLibrary.verifyElement(patientMessangerApp, true, 0);
	    appLibrary.verifyElement(ARCS, true, 0);
	    appLibrary.verifyElement(createARCS, true, 0);
	    appLibrary.verifyElement(title, true, 0);
	    appLibrary.verifyElement(surveyFlag, true, 0);
		appLibrary.verifyElement(surveyFlagSelect, true, 0);
	    appLibrary.verifyElement(description, true, 0);

	}
	
	public void fillLoginDetails(String email, String pass) throws Exception {
		appLibrary.enterText(emailInput, email);
		appLibrary.enterText(passwordInput, pass);
		appLibrary.clickElement(signInButton);

}
//public void clickTeamBuilder() throws Exception {
//	appLibrary.clickElement(teamBuilder);
//}
	
public void clickCube() throws Exception {
	appLibrary.clickElement(cube);
}

public void ClickpatientMessangerAppt() throws Exception {
	appLibrary.clickElement(patientMessangerApp);
}

public void clickARCS() throws Exception {
	appLibrary.clickElement(ARCS);
 }
public void clickCreateARCS() throws Exception  {
	appLibrary.clickElement(createARCS);
	
}


public void createARCSAssessment() throws Exception {
	
	appLibrary.enterText(title, "Automate ARCS Assessments");
	appLibrary.clickElement(surveyFlag);
	appLibrary.clickElement(surveyFlagSelect);
	appLibrary.enterText(description, "Kidney is not working as ");
	appLibrary.enterText(conditions, "Kid");
	appLibrary.clickElement(conditionSelect);
	appLibrary.clickElement(nextbutton1);
	appLibrary.clickElement(okButten);
    appLibrary.clickElement(smsTest);
	appLibrary.clickElement(voiceTest);
//	appLibrary.clickElement(codeBabyAvtar);
//	appLibrary.clickElement(newAssessmentId);
	appLibrary.clickElement(nextbutton2);
	appLibrary.clickElement(okButten2);
	appLibrary.clickElement(nextbutton3);
	appLibrary.clickElement(addquestions);
	appLibrary.clickElement(medicalFollowUp);
	appLibrary.clickElement(saveButton);
	appLibrary.clickElement(okButten4);
	appLibrary.clickElement(nextbutton4);
	//appLibrary.clickElement(okButten3);
	appLibrary.clickElement(switchMonday);
	appLibrary.clickElement(mondayAllDay);
	appLibrary.clickElement(okButten2);
	appLibrary.clickElement(nextbutton5);
	appLibrary.clickElement(okButten2);
	appLibrary.clickElement(browserTest);
//	appLibrary.clickElement(smsTest);
//	appLibrary.clickElement(voiceTest);
	appLibrary.clickElement(finishButton);
	appLibrary.clickElement(inactive);
	appLibrary.clickElement(okButten);

 }

	}

