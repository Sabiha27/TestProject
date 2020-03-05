package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Static_Variables {
	
public static String city_name="Pune";
public static String price_Range1 = "Rs. 0-100";
public static String price_Range2 = "Rs. 101-200";
public static String showtime1 = "Morning ";
public static String showtime2 = "Afternoon";


public static By city_xpath=By.xpath("//*[@id='inp_RegionSearch_top']");

public static By wzrk_xpath=By.xpath("//button[@id='wzrk-cancel']");

public static By searchformovie_xpath=By.xpath("//input[@class='search-box typeahead tt-input']//self::input");
public static String movie_name="Shubh Mangal Zyada Saavdhan";
public static String attribute_name="class";
public static String attribute_val="_available";
public static By selec_seat=By.xpath("//div[@id='A_1_10']");
public static By search_box=By.xpath("//*[@id='input-search-box']");
public static By movies_xpath=By.xpath("//ul//a[@href='/pune/movies' and text()='Movies']");
public static By showcasecard_xpath=By.xpath("//*[@id='showcase-primary']/div[1]/div/div/div[5]/div/a");
public static By bookticket_xpath=By.xpath("//div[@class='action-book']//a[@class='showtimes btn _cuatro']");
public static By pricerange_xpath=By.xpath("//div[contains(text(),'Filter Price Range')]");
public static By priceXpath = By.xpath("//ul[@id='filterPrice']//li[@class='prices']");
public static By showtime_xpath = By.xpath("//div[@class='dropdown filter']//div[@data-placeholder='Filter Show Timings']");
public static By showtime_list=By.xpath("//ul[@data-type='showtimes']//li[@class='showTimes-filter-list-item']");
public static By showdate_xpath=By.xpath("//*[@id='showDates']/div/div/li[3]");
public static By venulist_xpath=By.xpath("//*[@id='venuelist']/li[1]/div[2]/div[2]/div[2]/a");
public static By acceptbtn_xpath=By.xpath("//div[@class='__actions']//a[@id='btnPopupAccept']");
public static By noseats_xpath=By.xpath("//li[@id='pop_4']");
public static By proceedbtn_xpath=By.xpath("//div[@id='proceed-Qty']");
public static By noOfseat_aval=By.xpath("//*[@id='layout']/table/tbody/tr[5]/td[2]/div/a");
}

