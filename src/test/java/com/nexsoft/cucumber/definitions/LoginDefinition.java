/*
 * package com.nexsoft.cucumber.definitions;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import com.nexsoft.cucumber.pom.HomePage; import
 * com.nexsoft.cucumber.pom.SignInPage;
 * 
 * import io.cucumber.java.Before; import io.cucumber.java.en.And; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When;
 * 
 * public class LoginDefinition {
 * 
 * protected WebDriver driver; protected HomePage home; protected SignInPage
 * signIn;
 * 
 * @Before public void init() { System.setProperty("url",
 * "http://localhost/cicool"); System.setProperty("webdriver.chrome.driver",
 * "D:\\chromedriver.exe"); driver = new ChromeDriver();
 * driver.manage().window().maximize(); driver.get(System.getProperty("url")); }
 * 
 * @Given("User berada di halaman Login Account") public void gotoLogin() throws
 * Throwable { driver.get(System.getProperty("url")); home =
 * PageFactory.initElements(driver, HomePage.class); signIn =
 * home.clickSignIn(); System.out.println("User di Login Account"); } //
 * // @When("^User memasukan {username}$") // public void inputUsername(String
 * username) throws Throwable { //
 * System.out.println("User memasukan username sebagai "+username); //
 * signIn.setEmail("ridhotadjudin@gmail.com"); // }
 * // @And("^User memasukan {password}$") // public void inputPassword(String
 * password) throws Throwable { //
 * System.out.println("User memasukan password "+password); //
 * signIn.setPassword("123456"); // }
 * 
 * 
 * 
 * ////////////
 * 
 * @When("^User memasukan uname (.*)$") public void inputUsernameTabel(String
 * uname) throws Throwable {
 * System.out.println("User memasukan username sebagai ");
 * signIn.setEmail(uname); }
 * 
 * @And("^User memasukan pass (.*)$") public void inputPasswordTabel(String
 * pass) throws Throwable { System.out.println("User memasukan password ");
 * signIn.setPassword(pass); }
 * 
 * @And("User menekan tombol login") public void clickButton() throws Throwable
 * { System.out.println("User menekan tombol login"); signIn.clickButton(); }
 * 
 * @Then("User dapat masuk kedalam Dashboard utama") public void DashbordPage()
 * throws Throwable {
 * System.out.println("User dapat masuk kedalam Dashboard utama"); }
 * 
 * @Then("User tidak  masuk kedalam Dashboard utama dan menampilkan error")
 * public void InvalidPagePassword() throws Throwable { System.out.
 * println("User tidak  masuk kedalam Dashboard utama dan menampilkan error"); }
 * 
 * }
 */