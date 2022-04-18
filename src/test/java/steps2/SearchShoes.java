package steps2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchShoes {

    @Given("^the users is in the index page$")
    public void the_user_is_in_the_index_page() {
        System.out.print("JEJE");
    }

    @When("^click the search image$")
    public void click_the_search_image() {
    	System.out.print("JEJE");
    }    
    
    @Then("^the web search$")
    public void the_web_search() {
    	System.out.print("JEJE");
    }

}

