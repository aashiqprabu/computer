package stepD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void open_the_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DIMIKI CAT\\eclipse-workspace\\SeliniumDemo1\\libraries\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password()throws Throwable{
		driver.findElement(By.xpath("//input[@placeholder='phome,email or username']")).sendKeys("9500268606");
		driver.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='password']")).sendKeys("dcgdgv");
		
	}
	
	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium")).click();
	}
	
	

}
