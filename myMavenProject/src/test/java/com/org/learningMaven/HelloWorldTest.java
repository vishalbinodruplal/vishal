package com.org.learningMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void login(){
		System.out.println("Logging Into Application");
		/*WebDriver driver  = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();*/
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("firefox profile name");
		WebDriver driver = new FirefoxDriver(myprofile);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

}
