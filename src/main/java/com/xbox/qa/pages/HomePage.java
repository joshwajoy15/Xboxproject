package com.xbox.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xbox.qa.base.TestBase;


public class HomePage extends TestBase{
//public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='nav-link' and @href='/leaderboards']")
	WebElement Leaderboards;
	
	
	@FindBy(xpath="//a[@class='navbar-brand text-weight-bold text-white']")
	WebElement XGamerTagLogo;
	

	//Initializing the Page Objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String validateHomePageTitle() {
			return driver.getTitle();
			
		}	
		
		public boolean verifyXGamerTagLogoLabel() {
		return XGamerTagLogo.isDisplayed();
		}	
	
		
		public LeaderboardPage clickOnLeaderboardLink() {
		Leaderboards.click();
		return new LeaderboardPage();
		}
		
		public void validateGames() {
			driver.findElement(By.xpath("//input[@name='s']")).sendKeys("Duskamo" + Keys.ENTER);
			String a = driver.findElement(By.xpath("//a[contains(text(),'League of Legends')]")).getText();
			String b = driver.findElement(By.xpath("//a[contains(text(),'Fortnite')]")).getText();
			String c = driver.findElement(By.xpath("//a[contains(text(),'DARK SOULS™ II ')]")).getText();
			String d = driver.findElement(By.xpath("//a[contains(text(),'Skyrim')]")).getText();
			String e = driver.findElement(By.xpath("//a[contains(text(),'Minecraft: Xbox 360 Edition')]")).getText();
			
			System.out.println("\n" +a+ "\n" +b+ "\n" +c+ "\n" +d+ "\n" +e+"");
		}
		

}	
