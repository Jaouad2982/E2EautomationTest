package com.auto;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Constant;

public class CommonMethods {
	public static WebDriverWait w ;
	public static WebDriver driver = BaseClass.driverInializer();
	public static void sendK(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void clickonBTN(WebElement element) {
		element.click();
	}
	
	public static WebDriverWait waitFor() {
		w= new WebDriverWait(driver,Duration.ofSeconds(new Constant().returnWait()));
		return w;
	}
	
	public static void WaitForElem(WebElement element) {
		w.until(ExpectedConditions.visibilityOf(element));
	}
}
