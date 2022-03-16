package com.xbox.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xbox.qa.base.TestBase;
import com.xbox.qa.pages.HomePage;
import com.xbox.qa.pages.LeaderboardPage;

public class LeaderboardPageTest extends TestBase{
	HomePage homePage;
	LeaderboardPage leaderboardPage;
	
	@BeforeMethod
	public void Setup() {
		initialalization();
		homePage = new HomePage();
		leaderboardPage = new LeaderboardPage();
	}
	
	@Test(priority=1)
	public void verifyLeaderboardPageTitleTest() {
		String leaderboardPagetitle = leaderboardPage.verifyLeaderboardPageTitle();
		Assert.assertEquals(leaderboardPagetitle, "Xbox Leaderboards - Xbox Gamertag","Leaderboard page title not matched");
	}
	
	@Test
	public void ValidategamerTagsTest() throws InterruptedException {
		leaderboardPage.ValidateGametags();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
