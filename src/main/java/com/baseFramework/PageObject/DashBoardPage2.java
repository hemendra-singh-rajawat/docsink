package com.baseFramework.PageObject;

import com.baseFramework.Lib.AppLibrary;

public class DashBoardPage2 {

	AppLibrary appLibrary;
	public String todoList = "xpath:-://button[text()='Check Todo List for today']";
	//public String close = "xpath:-://button[@class='red-close white-bg-btn']";
	public String careTeam = "xpath:-://div[@class='care-card-container']";
	//public String latestAssessments = "xpath:-://div[text()='No assessments have been assigned to you']";
	public String trackDiet = "xpath:-://button[text()='Track Diet']";
	public String monthView = "xpath:-://button[text()='Month View']";
	public String dietTracker = "xpath:-://span[text()='Diet Tracker']";
	public String checkIns = "xpath:-://button[text()='Add Check-Ins']";
	
	
	public DashBoardPage2(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public void dashBoardPage2Ui() throws Exception {
		appLibrary.verifyElement(todoList, true, 0);
	//appLibrary.verifyElement(close, true, 0);
		appLibrary.verifyElement(careTeam, true, 0);
		//appLibrary.verifyElement(latestAssessments, true, 0);
		appLibrary.verifyElement(trackDiet, true, 0);
		appLibrary.verifyElement(monthView, true, 0);
		appLibrary.verifyElement(dietTracker, true, 0);
		appLibrary.verifyElement(checkIns, true, 0);
		
	
	}

public void clickOnTodo() throws Exception
{
	appLibrary.clickElement(todoList);

	
}


public void clickOnClose()
{
	appLibrary.clickElementWithJs("xpath:-://button[@class='red-close white-bg-btn']");
	
}
	
}
