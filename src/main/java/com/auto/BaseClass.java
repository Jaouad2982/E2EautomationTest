package com.auto;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends PropInializer {
	
	public static WebDriver driver;
	Properties prop = PropInializer.prop;
	public static WebDriver driverInializer() {
		
		switch(PropInializer.returnValuefromProp("browser")){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
//		default :
//			//
			
		}
		return driver;
	}
	
	
	public static void closeDriver() {
		if(!(driver == null)) driver.close();
	}
}
