package com.nexsoft.cucumber.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsensiPage {
protected WebDriver driver;
	
	public AbsensiPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath = "//i[@class='fa fa-plus-square-o']")
	private WebElement gotoAddAbsensi;
	
	public AddAbsensiPage clickAddCrud() {
		gotoAddAbsensi.click();
		return PageFactory.initElements(driver, AddAbsensiPage.class);
	}
	
}
