package com.ibm.businesslogics;

import java.io.IOException;

import com.ibm.elementActions.ElementActions;
import com.ibm.excelHandling.ExcelWork;
import com.ibm.pageobjects.Login;

public class Facebook_Login_BS {

	
	
	public static void launchChrome() throws IOException {
		
		ExcelWork.configExcel();

		ElementActions.launchChromeBrowser();
		ElementActions.navgateToURL(ExcelWork.getCellData(1, 1));
		
	}
	
	
	public static void enterDetails() throws IOException {
		
		ElementActions.enterText(Login.userId, ExcelWork.getCellData(1, 2));
		ElementActions.enterText(Login.password, ExcelWork.getCellData(1, 3));
		ElementActions.takeScreenShot("password");
		
		ElementActions.clickElement(Login.login);
		ElementActions.takeScreenShot("login");
	}
	
		
	public static void closeBrowser() {
		
		ElementActions.closeBrowser();
	}
	
	
	
}
