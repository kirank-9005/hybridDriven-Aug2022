package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void tc1() {
		System.out.println("STEP: Launch chrome browser & hit URl");
		PredefinedActions.start("https://kirank1-trials710.orangehrmlive.com");
		
		System.out.println("STEP- Enter login credentials");
		LoginPage loginpage=new LoginPage();
		loginpage.login("Admin", "2@XZJm9gZv");		
		
		System.out.println("Verify- home page is displayed");
		String actualTitle=loginpage.getPageTitle();
		String expectedTitle="Employee Management";
		
		Assert.assertEquals(actualTitle, expectedTitle,"expected title was" +expectedTitle+ "but actual title is "+actualTitle);
		
		PredefinedActions.closeBrowser();
	}
}
 