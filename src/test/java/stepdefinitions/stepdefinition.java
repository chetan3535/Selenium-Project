package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRespository.HomepageOR;
import objectRespository.TestingFormPageOR;
import utilites.Baseclass;

public class stepdefinition extends Baseclass  {
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    openBroswer("chrome");
	    openbaseurl();
	    HomepageOR.clickTestingFormpage();
	}

	@When("User enters valid email and username")
	public void user_enters_valid_email_and_username() {
     TestingFormPageOR.formfill("Shivani","Raskar", "Nashik","India", "female", "hockey");
	}

	@Then("clicks on the alertaction  button")
	public void clicks_on_the_alertaction_button() {
	 alertaction("ok");
	}
}