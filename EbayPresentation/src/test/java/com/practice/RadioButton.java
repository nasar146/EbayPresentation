package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\talha\\eclipse-workspace\\EbayPresentation\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		custom.click();
		boolean a = custom.isSelected();
		System.out.println(a);

		boolean b = custom.isEnabled();
		System.out.println(b);
		boolean c = custom.isDisplayed();
		System.out.println(c);
		
		driver.close();
	}
}
