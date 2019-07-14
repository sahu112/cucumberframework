package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
    public void user_already_login_page() {
		System.setProperty("webdriver,chrome,driver","D:\\JavaProject\\CocumberBDDFramework\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://www.amazon.com");
    }
	
	@When("^title of login page shopNow$")
	public void title_login_page() {
		String title=driver.getTitle();
		
	}
	@Then("^User enter the user name and password$")
	public void User_enter_the_user_name() {
		driver.findElement(By.xpath("")).sendKeys("");
	}
	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("")).sendKeys("");
	}
}
