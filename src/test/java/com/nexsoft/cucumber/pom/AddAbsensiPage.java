package com.nexsoft.cucumber.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAbsensiPage {	
	protected WebDriver driver;
	
	public AddAbsensiPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement inUsr;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement inEmail;
	
	@FindBy(xpath = "//input[@id='location']")
	private WebElement inLoc;
	
	@FindBy(xpath = "//a[@id='btn_save']")
	private WebElement btnSave;
	
	public CrudPage addUser(String usr,String email, String loc) {
		inUsr.clear();
		inUsr.sendKeys(usr);
		inEmail.clear();
		inEmail.sendKeys(email);
		inLoc.clear();
		inLoc.sendKeys(loc);
		btnSave.click();
		
		return PageFactory.initElements(driver, CrudPage.class);
	}
}
