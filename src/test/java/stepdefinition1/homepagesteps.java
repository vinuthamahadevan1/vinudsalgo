package stepdefinition1;

import com.pages.homepg;

import Factory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepagesteps {
	private homepg Homepg=new homepg(driverfactory.getDriver());
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks Data Structures drop down")
	public void the_user_clicks_data_structures_drop_down() {
		
		Homepg.click_home();
		Homepg.dropdownclick();
	   
	}

	@Then("user should see  panes with different data strucures and different entries")
	public void user_should_see_panes_with_different_data_strucures_and_different_entries() {
		Homepg.dropdown_validation();
		Homepg.dropdowndata();
	    
	}

	@Then("The user selects any data structures item from the drop down without Sign in")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	    Homepg.error_msg();
	  
	}

	@Then("It should through error message")
	public void it_should_through_error_message() {
		Homepg.error_msg();
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		Homepg.signin();
	    
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		
	   
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Homepg.Register();
	   
	}



	

}
