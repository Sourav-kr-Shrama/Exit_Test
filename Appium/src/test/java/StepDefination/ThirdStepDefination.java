package StepDefination;

import Base.BaseFile;
import Screen.ThirdScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThirdStepDefination extends BaseFile {
	
	@And("^the user clicks on the APP option$")
	public void the_user_clicks_on_the_APP_option() throws Throwable {
		log.info("Lauching the App");
	   launchapp();
	   Thread.sleep(1000);
	   ThirdScreen Th = new ThirdScreen();
	   Th.App_click();
	   
	   
	}

	@When("^clicks on the Action Bar and then on Display option$")
	public void clicks_on_the_Action_Bar_and_then_on_Display_option() throws Throwable {
		log.info("Clicking the options");
		ThirdScreen Th = new ThirdScreen();
		Th.Action_bar();
		Thread.sleep(1000);
		Th.Display_click();
	}

	
	@Then("^then click on the Display_Show_title$")
	public void then_click_on_the_Display_Show_title() throws Throwable {
		log.info("Performing the Display click functions");
		ThirdScreen Th = new ThirdScreen();
		Th.Show_title();
	}
	
	@Then("^then click on the how custom button and verify it$")
	public void then_click_on_the_how_custom_button_and_verify_it() throws Throwable {
		log.info("Performing the Click operations and validating the result");
		ThirdScreen Th = new ThirdScreen();
		Th.Show_Custom();
	}
	
	@Then("^Closes the app$")
	public void closes_the_app() throws Throwable {
		log.info("Closing the App");
	    closeapp();
	}



}
