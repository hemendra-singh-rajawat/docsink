package com.baseFramework.PageObject;

import com.baseFramework.Lib.AppLibrary;

public class CheckInspage {

	AppLibrary appLibrary;
	public String checkIns = "xpath:-://span[text()='Check-Ins']";
	public String addCheckIns = "xpath:-://button[text()='Add Check-Ins']";
	public String ace = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='ACEs']";
	public String bloodGlucose = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Blood Glucose']";
	public String bloodPressure = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Blood Pressure']";
	public String bodyHeight = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Body Height']";
	public String bodyMass = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Body Mass Index']";
	public String bodyTemp= "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Body Temperature']";
	public String bodyWeight = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Body Weight']";
	public String caffeineIntake = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Caffeine Intake']";
	public String ecg = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='EKG']";
	public String exercise = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Exercise']";
	public String floorCliped = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Floors Climbed']";
	public String hba = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='HbA1c']";
	public String headCir = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Head Circumference']";
	public String heartRate = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Heart Rate']";
	public String oxeSaturation = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Oxygen Saturation']";
	public String sleep = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='Sleep']";
	public String step = "xpath:-://div[@class='add-vital-reading-type-txt-container']//p[text()='ACEs']";
	public String addNotes = "xpath:-://div[@class='notes-inp-container']";
	public String connectDevice = "xpath:-://button[text()='CONNECT DEVICE']";
	public String cancelButton = "xpath:-://button[text()='CANCEL']";

	public CheckInspage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public void checkInspage() throws Exception {
		appLibrary.verifyElement(checkIns, true, 0);
	    appLibrary.verifyElement(addCheckIns, true, 0);
		appLibrary.verifyElement(ace, true, 0);
		appLibrary.verifyElement(bloodGlucose, true, 0);
		appLibrary.verifyElement(bloodPressure, true, 0);
		appLibrary.verifyElement(bodyHeight, true, 0);
		appLibrary.verifyElement(bodyMass, true, 0);
		appLibrary.verifyElement(bodyTemp, true, 0);
		appLibrary.verifyElement(bodyWeight, true, 0);
		appLibrary.verifyElement(caffeineIntake, true, 0);
		appLibrary.verifyElement(ecg, true, 0);
		appLibrary.verifyElement(exercise, true, 0);
		appLibrary.verifyElement(floorCliped, true, 0);
		appLibrary.verifyElement(hba, true, 0);
		appLibrary.verifyElement(headCir, true, 0);
		appLibrary.verifyElement(heartRate, true, 0);
		appLibrary.verifyElement(oxeSaturation, true, 0);
		appLibrary.verifyElement(sleep, true, 0);
		appLibrary.verifyElement(step, true, 0);
		appLibrary.verifyElement(addNotes, true, 0);
		appLibrary.verifyElement(connectDevice, true, 0);
		appLibrary.verifyElement(cancelButton, true, 0);
		
	}

public void clickCheckIns() throws Exception 
{
	appLibrary.clickElement(checkIns);
}
public void clickAddCheckIns() throws Exception 
{
	appLibrary.clickElement(addCheckIns);
}
public void clickace() throws Exception 
{
	appLibrary.clickElement(ace);
}
	public void clickbodyMass() throws Exception 
	{
		appLibrary.clickElement(bodyMass);	
}
	public void clickSleep() throws Exception 
	{
		appLibrary.clickElement(sleep);	
}
public void clickAddNotes() throws Exception 
{
	appLibrary.clickElement(addNotes);

}
public void clickCancelButton() throws Exception 
{
	appLibrary.clickElement(cancelButton);
}
public void clickConnectDevice() throws Exception 
{
	appLibrary.clickElement(connectDevice);
	Thread.sleep(2000);
}

}

