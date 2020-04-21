package com.ibm.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ibm.businesslogics.Facebook_Login_BS;

public class Facebook_Login {
	
	
	@Test
	public void facebooLogin() throws IOException {
		
		
		Facebook_Login_BS.launchChrome();
		
		Facebook_Login_BS.enterDetails();
					
		Facebook_Login_BS.closeBrowser();
		
	}
	
	

}
