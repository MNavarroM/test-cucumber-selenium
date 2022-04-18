package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SearchSteps {
	WebDriver driver;
	
	@Before
	public void init() {
		System.out.print("EEEOOOO");
	}
	
    @Given("^the user is in the index page$")
    public void the_user_is_in_the_index_page() {
	System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
	driver = new FirefoxDriver();	
	driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	
    @When("^the user enters (.+) in the search bar$")
    public void the_user_enters_in_the_search_bar(String item){
    	driver.findElement(By.id("search_query_top")).sendKeys(item);
	}
    
    @When("^click the search icon$")
    public void click_the_search_icon() {
		driver.findElement(By.name("submit_search")).click();
	}
	
    @Then("^the web search (.+)$")
    public void the_web_search(String item) {		
 		Assert.assertEquals(driver.findElement(By.className("lighter")).getText(), "\""+item.toUpperCase()+"\"");
 		
	}	
    
    @After
    public void closeDriver() {
    	System.out.print("EEEA");
    	driver.quit();
    }	
}
