package com.xbox.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xbox.qa.base.TestBase;

public class LeaderboardPage extends TestBase{
	
	@FindBy(xpath="//a[@class='nav-link' and @href='/leaderboards']")
	WebElement Leaderboards;
	
	// All 30 
    //div[contains(text(), '1')]//ancestor::div[@class='container p-4 bg-white']
    
    // 1 By 1
    //a[@class='display-4 stretched-link']//preceding-sibling::div[contains(text(), '2')]//parent::div[@class='row']
		
	
	//Initializing the Page Objects
			public LeaderboardPage() {
				PageFactory.initElements(driver, this);
			}
			
			public String verifyLeaderboardPageTitle() {
				Leaderboards.click();
				return driver.getTitle();
			}
			
			public LeaderboardPage clickOnLeaderboardLink() {
				Leaderboards.click();
				return new LeaderboardPage();
			}
			
			public void ValidateGametags() throws InterruptedException {
				Leaderboards.click();
				for(int i=1; i<=5; i++) {
			    	System.out.println(driver.findElement(By.xpath("//a[@class='display-4 stretched-link']//preceding-sibling::div[contains(text(), '"+ i +"')]//parent::div[@class='row']")).getText());
			    	System.out.println("");
			    }
			}
			

}
