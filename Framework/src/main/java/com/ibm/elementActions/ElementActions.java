package com.ibm.elementActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ibm.constants.Constants;


public class ElementActions {

	
	static WebDriver driver;
	
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		driver = new ChromeDriver();
	}

	public static void navgateToURL(String url) {
		driver.get(url);
	}
	
	public static void enterText(String elementXpath, String value) {
		driver.findElement(By.xpath(elementXpath)).sendKeys(value);
	}
	
	public static void clickElement(String elementXpath) {
		driver.findElement(By.xpath(elementXpath)).click();
	}
	
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	
	public static void takeScreenShot(String imageName) throws IOException {
		TakesScreenshot scObj = ((TakesScreenshot)driver);
		File srcFile = scObj.getScreenshotAs(OutputType.FILE);
		File destFile = new File("Output/"+imageName+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	
	
	
	
}
