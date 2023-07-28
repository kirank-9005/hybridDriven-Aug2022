package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions{

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickOnLoginBtn();
	}
	
	public void enterUsername(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);	
	}
	public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();			

	}
	
	public boolean isLogoDisplayed() {
		return driver.findElement(By.cssSelector("div.organization-logo.shadow>img")).isDisplayed();
	}
	public boolean isUsernameErrorMsgDisplayed() {
		WebElement usernameErrorMessage=driver.findElement(By.cssSelector("#txtUsername"));
		return usernameErrorMessage.isDisplayed();
	}
	public boolean isPasswordErrorMsgDisplayed() {
		WebElement passwordErrorMessage=driver.findElement(By.cssSelector("#txtPassword"));
		return passwordErrorMessage.isDisplayed();
				
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
