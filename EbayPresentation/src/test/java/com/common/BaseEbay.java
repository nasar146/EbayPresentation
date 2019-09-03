package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseEbay {
public WebDriver driver;
public WebDriver getdriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\talha\\eclipse-workspace\\EbayPresentation\\Browser\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	return driver;
	
	
	
}
}
