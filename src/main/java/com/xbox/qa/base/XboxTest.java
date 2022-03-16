package com.xbox.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XboxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/joshwajoy/Documents/Selenium/Installers/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://www.xboxgamertag.com/leaderboards");
	    
	    // All 30 
	    //div[contains(text(), '1')]//ancestor::div[@class='container p-4 bg-white']
	    
	    // 1 By 1
	    //a[@class='display-4 stretched-link']//preceding-sibling::div[contains(text(), '2')]//parent::div[@class='row']
	    
//	    String j = driver.findElement(By.xpath("//a[@class='display-4 stretched-link']//preceding-sibling::div[contains(text(), '1')]//parent::div[@class='row']")).getText();
//	    System .out.println("" +j);
	    
	    for(int i=1; i<=5; i++) {
	    	System.out.println(driver.findElement(By.xpath("//a[@class='display-4 stretched-link']//preceding-sibling::div[contains(text(), '"+ i +"')]//parent::div[@class='row']")).getText());
	    	System.out.println("");
	    }
	    
	    driver.close();
	    driver.quit();
	    
	   
	}

}
