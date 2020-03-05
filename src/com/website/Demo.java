package com.website;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void checkForNoOfBusesAvalable() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver78.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/buytickets/shubh-mangal-zyada-saavdhan-pune/movie-pune-ET00111934-MT/20200301#!seatlayout");
		List<WebElement> urlTag= driver.findElements(By.xpath("//*[@id='layout']/table/tbody/tr[5]"));
		for(WebElement tag:urlTag)
		    System.out.println(tag.getAttribute("class"));
	}
}
