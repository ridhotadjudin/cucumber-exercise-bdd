package com.nexsoft.cucumber.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrudPage {

	protected WebDriver driver;
	
	@FindBy(xpath = "//tbody[@id='tbody_crud']/tr")
	List<WebElement> lstTable;
	
	@FindBy(xpath = "a[href='http://localhost:80/cicool/administrator/absensi']")
	private WebElement clickAbsensi;
	
	public CrudPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public AbsensiPage clickAbsensiPage() {
		clickAbsensi.click();
		return PageFactory.initElements(driver, AbsensiPage.class);
	}

	public void clickSeeButtonWithTitle(String title) {
		WebElement see = null;
		
		int counter=1;
		for (WebElement webElement : lstTable) {
			
			see = webElement.findElement(By.xpath("//tbody[@id='tbody_crud']/tr["+counter+"]/td/a[1]"));
			WebElement teks = webElement.findElement(By.xpath("//tbody[@id='tbody_crud']/tr["+counter+"]//td[2]"));
			System.out.println(teks.getText());
			if(teks.getText().equalsIgnoreCase(title)) {
				see.click();
				break;
			}
		}
	}

}
