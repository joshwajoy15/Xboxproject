package com.xbox.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XboxTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/joshwajoy/Documents/Selenium/Installers/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://www.xboxgamertag.com");
	    driver.findElement(By.xpath("//input[@name='s']")).sendKeys("Duskamo" + Keys.ENTER);
	    
	   String a = driver.findElement(By.xpath("//a[contains(text(),'League of Legends')]")).getText();
	   String b = driver.findElement(By.xpath("//a[contains(text(),'Fortnite')]")).getText();
	   String c = driver.findElement(By.xpath("//a[contains(text(),'DARK SOULS™ II ')]")).getText();
	   String d = driver.findElement(By.xpath("//a[contains(text(),'Skyrim')]")).getText();
	   String e = driver.findElement(By.xpath("//a[contains(text(),'Minecraft: Xbox 360 Edition')]")).getText();
	   
	   System.out.println("\n" +a+ "\n" +b+ "\n" +c+ "\n" +d+ "\n" +e+"");
	   	driver.close();
		driver.quit();
	}
	
	

}
