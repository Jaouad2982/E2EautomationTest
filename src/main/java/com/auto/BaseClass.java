package com.auto;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import resources.Constant;

public class BaseClass extends PropInitializer {
	
	public static WebDriver driver;
	public static Properties prop = PropInitializer.returnProp(new Constant().returnVariable());
	public static WebDriver driverInializer() {
		
		switch(PropInitializer.returnValuefromProp("browser")){
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
