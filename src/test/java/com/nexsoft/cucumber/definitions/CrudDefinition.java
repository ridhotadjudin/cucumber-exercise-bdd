package com.nexsoft.cucumber.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.nexsoft.cucumber.pom.AbsensiPage;
import com.nexsoft.cucumber.pom.AddAbsensiPage;
import com.nexsoft.cucumber.pom.CrudPage;
import com.nexsoft.cucumber.pom.Dashboard;
import com.nexsoft.cucumber.pom.HomePage;
import com.nexsoft.cucumber.pom.SignInPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrudDefinition {

	protected WebDriver driver;
	protected Dashboard dash;
	protected HomePage home;
	protected SignInPage signIn;

	protected CrudPage crud;
	protected AbsensiPage absen;
	protected AddAbsensiPage add;
	
	public void prep() {
		System.setProperty("url", "http://localhost/cicool");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}
	
	@Before
	public void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(System.getProperty("url"));
	}

	@Given("User berada di halaman Login Account")
	public void gotoLogin() throws Throwable {
		driver.get(System.getProperty("url"));
		home = PageFactory.initElements(driver, HomePage.class);
		signIn = home.clickSignIn();
		System.out.println("User berada di halaman Dashboard");
	}

	@When("^User memasukan uname (.*)$")
	public void inputUsernameTabel(String uname) throws Throwable {
		System.out.println("User memasukan username sebagai ");
		signIn.setEmail(uname);
	}

	@And("^User memasukan pass (.*)$")
	public void inputPasswordTabel(String pass) throws Throwable {
		System.out.println("User memasukan password ");
		signIn.setPassword(pass);
	}

	@And("User menekan tombol login")
	public void clickButton() throws Throwable {
		System.out.println("User menekan tombol login");
		signIn.clickButton();
	}
	
	@And("User menekan tombol CRUD")
	public void clickBtnCRUD() throws Throwable {
		System.out.println("User menekan tombol CRUD");
		dash.clickCrudPage();
	}
	
	@And("User menekan tombol See Tabel Absensi")
	public void clickBtnSeeAbsensi(String tabel) throws Throwable {
		System.out.println("User menekan tombol See Tabel Absensi");
		crud.clickSeeButtonWithTitle(tabel);;
	}
	
	@And("User menekan tombol Tambah Absensi")
	public void clickBtnAddAbsensi() throws Throwable {
		System.out.println("User menekan tombol Tambah Absensi");
		absen.clickAddCrud();
	}
	
	@And("^User mengisi data absensi baru (.*) (.*) (.*)$")
	public void inputNewAbsensi(String usr, String email, String loc) throws Throwable {
		System.out.println("User menekan tombol Tambah Absensi");
		add.addUser(usr, email, loc);
	}
	
	@Then("Data baru disimpan")
	public void InvalidPagePassword() throws Throwable {
		System.out.println("User tidak  masuk kedalam Dashboard utama dan menampilkan error");

	}

}	
	
	
	
	
	
	
	///////////
//
//	@When("User memasukan uname")
//	public void inputUser(String uname) throws Throwable {
//		System.out.println("User memasukan username sebagai ");
//		signIn.setEmail(uname);
//	}
//
//	@And("^User memasukan pass (.*)$")
//	public void inputPasswordTabel(String pass) throws Throwable {
//		System.out.println("User memasukan password ");
//		signIn.setPassword(pass);
//	}

