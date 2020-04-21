package com.ibm.businesslogics;

import java.io.IOException;

import com.ibm.elementActions.ElementActions;
import com.ibm.excelHandling.ExcelWork;
import com.ibm.pageobjects.Login;

public class TC001_BS {
	
	
	
	
	
	public static void performLogin() throws IOException {
		
		ExcelWork.configExcel();
		
		ElementActions.launchChromeBrowser();
		ElementActions.navgateToURL("");
		
		ElementActions.enterText(Login.userId, "ABC");
		ElementActions.enterText(Login.password, "XYZ");
		ElementActions.clickElement(Login.submit);
	}

}
