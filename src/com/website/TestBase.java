package com.website;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.Utility;

public class TestBase {
	public static WebDriver driver;
	public EventFiringWebDriver eventHandler;
	public WebEventListener eventListener;
	public Properties properties; 
	public FileInputStream fis;
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
	    fis = new FileInputStream("config.properties");// rename
	    properties = new Properties();
		properties.load(fis);
		String browser = properties.getProperty("browser");
		String url=properties.getProperty("url");
		
		String pageloadwait=properties.getProperty("pageloadwaittime");
		long pageload_wait = Long.parseLong(pageloadwait);
		
		String implicitWait=properties.getProperty("implicitWaitTime");
		long implicit_Wait=Long.parseLong(implicitWait);
		
		
		if ("Chrome".equals(browser)) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver78.exe");															
			driver = new ChromeDriver();
		}
		if ("Firefox".equals(browser)) {
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(pageload_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicit_Wait, TimeUnit.SECONDS);
		driver.get(url);
		
		eventHandler = new EventFiringWebDriver(driver); //Registering with EventFiringWebDriver
		eventListener= new WebEventListener(); //Register method allows to register our implementation of WebDriverEventListner to listen to the WebDriver events 
		eventHandler.register(eventListener); 
		driver=eventHandler;
		
		 
	}

	
	
}
