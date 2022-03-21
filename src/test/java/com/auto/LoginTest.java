package com.auto;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	public static WebDriver driver = BaseClass.driverInializer();
	public static Properties prop = BaseClass.prop;
	
	@Test
	public void shouldAnswerWithTrue() {
		driver.get(PropInitializer.returnValuefromProp("url"));
		
	

	}
}
