package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.jq.TimesPanel;

import com.website.TestBase;

public class Utility {
	static WebDriver driver;
	static WebDriverWait wait;

	public Utility(WebDriver driver) {
		this.driver = driver;
	}

	public static void click_Element(By locator,int timeout) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(locator).click();
		Thread.sleep(2000);
		/*WebElement element=driver.findElement(locator);
		wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();*/
		
		
		

	}

	public static void ListOfWebElementsWithData(By locator, String Data,String Jdata) {

		List<WebElement> xpathh = driver.findElements(locator);// .click();
		int count = xpathh.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement e = xpathh.get(i);
			int x = e.getLocation().getX();
			System.out.println(x);
			if (x != 0) {
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",e);
			//((JavascriptExecutor)driver).executeScript("arguments[0].value='("+Jdata+")'");

			e.sendKeys(Data);
		}

	}
	}

	public static void ListOfWebElement(String xpath, String listofstringvalues) {

		WebElement xpathh = driver.findElement(By.xpath(xpath));// .click();

		String[] stringvalues = { listofstringvalues };

		if (xpathh.getText().equals(stringvalues)) {
			xpathh.click();

		}

	}

	@Test
	public static void sendkey(By locator,int timeout, String data) throws InterruptedException {
		
		{
			Thread.sleep(2000);
			WebElement input_data=driver.findElement(locator);
			Thread.sleep(2000);
			input_data.sendKeys(data);
			Thread.sleep(2000);
			input_data.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			 /*WebElement input_data = driver.findElement(locator);
			 wait=new WebDriverWait(driver,timeout);
			 wait.until(ExpectedConditions.visibilityOf(input_data));
			 input_data.sendKeys(data);
			 wait=new WebDriverWait(driver,timeout);
			 input_data.sendKeys(Keys.ENTER);*/
			}
		/*wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 WebElement input_data = driver.findElement(locator);
		 input_data.sendKeys(data);
	     input_data.sendKeys(Keys.ENTER);
	     */
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",input_data);

	}

	public static void dropDownFilter(By ele_Xpath, String filter1, String filter2) throws InterruptedException {
		List<WebElement> lsele = driver.findElements(ele_Xpath);
		Thread.sleep(2000);
		for (WebElement wb : lsele) {
			Thread.sleep(2000);
			if (wb.getText().contains(filter1)) {
				Thread.sleep(2000);
				wb.click();
			}
			if (wb.getText().contains(filter2)) {
				wb.click();
			}

		}
	}

	public static void noOfSeatsAvailablity(By ele_Xpath, String attribute_name, String attributevalue) {
		List<WebElement> we = driver.findElements(ele_Xpath);
		int count = 0;
		for (int i = 0; i < we.size(); i++) {
			String ele_val = we.get(i).getText();
			String attribute_value = we.get(i).getAttribute(attribute_name);
			Reporter.log(ele_val + " " + attribute_value);
			if (attribute_value.equals(attributevalue)) {
				Assert.assertTrue(true);
				count++;

			} else {
				Reporter.log(" Seats are not availabe>>>");
			}

		}
		System.out.println("Total no. of seats available are>>" + count);

	}

}
