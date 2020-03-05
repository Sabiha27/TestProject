package com.website;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.utility.Static_Variables;
import com.utility.Utility;

public class MovieTicketBookingTestCase extends TestBase {
	//JavascriptExecutor executor = (JavascriptExecutor) driver;
	Utility uc=new Utility(driver);
	/*@Test
	public void checkIfSeatGetSelected() throws InterruptedException {
		
		Utility.sendkey(Static_Variables.city_xpath,Static_Variables.city_name);
		Thread.sleep(5000);

		Utility.click_Element(Static_Variables.wzrk_xpath);
		Thread.sleep(5000);
		//Utility.click_Element(Static_Variables.movies_xpath);
	
	Thread.sleep(5000);
		//Utility.click_Element(Static_Variables.showcasecard_xpath);
	driver.findElement(By.xpath("//*[@id='input-search-box']")).click();
	Thread.sleep(5000);
	Utility.sendkey(Static_Variables.searchformovie_xpath,Static_Variables.movie_name);
		Thread.sleep(8000);
		//Utility.click_Element(Static_Variables.bookticket_xpath);
		Thread.sleep(8000);
		
		// Filter-Price_Range
		Utility.click_Element(Static_Variables.pricerange_xpath,30);
		Thread.sleep(5000);
		Utility.dropDownFilter(Static_Variables.priceXpath, Static_Variables.price_Range1,Static_Variables.price_Range2);
		Thread.sleep(5000);
		
		// filter -showtime
		Utility.click_Element(Static_Variables.showtime_xpath);
		Thread.sleep(5000);
		Utility.dropDownFilter(Static_Variables.showtime_list, Static_Variables.showtime1,Static_Variables.showtime2);
		Thread.sleep(5000);
		Utility.click_Element(Static_Variables.showdate_xpath);
		Thread.sleep(5000);
		Utility.click_Element(Static_Variables.venulist_xpath);
		Thread.sleep(5000);
		Utility.click_Element(Static_Variables.acceptbtn_xpath);
		Thread.sleep(5000);
		Utility.click_Element(Static_Variables.noseats_xpath);
		Thread.sleep(5000);
		Utility.click_Element(Static_Variables.proceedbtn_xpath);
		Thread.sleep(5000);		

		Utility.click_Element("//div[@id='A_1_10']");

		boolean actulrslt = driver.findElement(By.xpath("//*[@id='btmcntbook']")).isDisplayed();
		boolean expctrslt = true;
		Assert.assertTrue(actulrslt);

	}*/

	@Test
	public void checkSeatAvailabilty() throws InterruptedException {
		
		Utility.sendkey(Static_Variables.city_xpath,40,Static_Variables.city_name);
		//Thread.sleep(2000);
		 Utility.click_Element(Static_Variables.wzrk_xpath,30);
		//Thread.sleep(2000);
		//Utility.click_Element(Static_Variables.movies_xpath);
	
		//Utility.click_Element(Static_Variables.showcasecard_xpath);
	      Utility.click_Element(Static_Variables.search_box,60);
	  	
	      Utility.sendkey(Static_Variables.searchformovie_xpath,80,Static_Variables.movie_name);
	 
		Utility.click_Element(Static_Variables.pricerange_xpath,60);
		
		Utility.dropDownFilter(Static_Variables.priceXpath, Static_Variables.price_Range1,Static_Variables.price_Range2);
		
		
		// filter -showtime
		Utility.click_Element(Static_Variables.showtime_xpath,30);
		
		Utility.dropDownFilter(Static_Variables.showtime_list, Static_Variables.showtime1,Static_Variables.showtime2);
		
		Utility.click_Element(Static_Variables.showdate_xpath,30);
	
		Utility.click_Element(Static_Variables.venulist_xpath,30);
		
		Utility.click_Element(Static_Variables.acceptbtn_xpath,30);
		
		Utility.click_Element(Static_Variables.noseats_xpath,30);
	
		Utility.click_Element(Static_Variables.proceedbtn_xpath,30);
		
		Utility.noOfSeatsAvailablity(Static_Variables.noOfseat_aval,Static_Variables.attribute_name,Static_Variables.attribute_val);
		
		
		
	}
}

