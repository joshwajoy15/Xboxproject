package com.xbox.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xbox.qa.base.TestBase;
import com.xbox.qa.pages.HomePage;
import com.xbox.qa.pages.LeaderboardPage;


public class HomePageTest extends TestBase{
	HomePage homePage;
	LeaderboardPage leaderboardPage;
	 	
	
	
	@BeforeMethod
	public void Setup() {
		initialalization();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Xbox Gamertag");
	}
	
	@Test
	public void LeaderboardLinkTest() {
		leaderboardPage = homePage.clickOnLeaderboardLink();
	}
	
	
	@Test
	public void verifyLogoTest() {
		Assert.assertTrue(homePage.verifyXGamerTagLogoLabel(), "XGamerTagLogo label is missing on the page");
	}
	
	@Test
	public void validateGameTitleTest() {
		homePage.validateGames();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
