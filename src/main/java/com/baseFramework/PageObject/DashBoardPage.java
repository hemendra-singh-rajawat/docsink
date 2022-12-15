package com.baseFramework.PageObject;

import com.baseFramework.Lib.AppLibrary;

public class DashBoardPage {

	AppLibrary appLibrary;
	public String home = "xpath:-://span[text()='Home']";
	public String checkIns = "xpath:-://span[text()='Check-Ins']";
	public String messages = "xpath:-://span[text()='Messages']";
	public String sync = "xpath:-://span[text()='Sync']";
	public String assessments = "xpath:-://span[text()='Assessments']";
	public String arcsAssessments = "xpath:-://span[text()='ARCS Assessments']";
	public String dietTracker = "xpath:-://span[text()='Diet Tracker']";
	public String signOut = "xpath:-://span[text()='Sign Out']";
	public String settings = "xpath:-://span[text()='Settings']";
	//public String nBell = "xpath:-://svg[@class='MuiSvgIcon-root']";
	public String image = "xpath:-://img[contains@class='user-profile-img rounded')]";
	
	public DashBoardPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public void dashBoardPageUi() throws Exception {
		appLibrary.verifyElement(home, true, 0);
		appLibrary.verifyElement(checkIns, true, 0);
		appLibrary.verifyElement(messages, true, 0);
		appLibrary.verifyElement(sync, true, 0);
		appLibrary.verifyElement(assessments, true, 0);
		appLibrary.verifyElement(arcsAssessments, true, 0);
		appLibrary.verifyElement(dietTracker, true, 0);
		appLibrary.verifyElement(signOut, true, 0);
		appLibrary.verifyElement(settings, true, 0);
	//	appLibrary.verifyElement(nBell, true, 0);
		appLibrary.verifyElement(image, true, 0);
	}


}
