package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {

	WebDriver driver = null;

	@Given("^I have open the browser$")
	public void openBrowser(DataTable browser) {
		List<List<String>> data = browser.raw();
		System.out.println(data.get(1).get(0));
		System.setProperty("webdriver.chrome.driver", "C:\\newW\\chromedriver.exe");
		
		ChromeOptions chr = new ChromeOptions();
		chr.addArguments("-headless");
		
		driver = new ChromeDriver(chr);
	}

	@When("^I open Facebook website$")
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@And("^Write \"([^\"]*)\" in username field$")
	public void enterText(String val) {
		driver.findElement(By.id("email")).sendKeys(val);
	}
	
	@Then("^Close the bowser$")
	public void close() {
		driver.close();
	}
}


