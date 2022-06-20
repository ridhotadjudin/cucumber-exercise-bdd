package com.nexsoft.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	protected WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@class='page-scroll']")
	private WebElement signIn;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement btnLogout;

	@FindBy(xpath = "//a[@class='page-scroll dropdown-toggle']")
	private WebElement btnDashboardUsername;
	
	public SignInPage clickSignIn() {
		signIn.click();
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

		return signInPage;
	}

	public void logout() {
		btnDashboardUsername.click();
		btnLogout.click();
	}
}
