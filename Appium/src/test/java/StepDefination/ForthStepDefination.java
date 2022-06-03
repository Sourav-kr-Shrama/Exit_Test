package StepDefination;

import Base.BaseFile;
import Screen.ForthScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForthStepDefination extends BaseFile {
	
	@Given("^The  open the App$")
	public void the_user_open_the_App() throws Throwable {
	log.info("Launching the App");
	   launchapp();
 
	}
	@Given("^Clicks on the views option$")
	public void clicks_on_the_views_option() throws Throwable {
		log.info("CLicking the option");
	    ForthScreen  fs= new ForthScreen();
	    fs.View_Bttn();
	}

	@And("^user scrolls the page$")
	public void user_scrolls_the_page() throws Throwable {
		log.info("Scrolling the page");
		scrolldown();
		Thread.sleep(1000);
		scrolldown();
	}

	@When("^clicks on the Visibility options$")
	public void clicks_on_the_Visibility_options() throws Throwable {
		log.info("CLicking the options");
		 ForthScreen  fs= new ForthScreen();
		 fs.Visibilty_Bttn();
	}

	@And("^clicks on the INVIS button$")
	public void clicks_on_the_INVIS_button() throws Throwable {
		
		 ForthScreen  fs= new ForthScreen();
		 fs.Invis_Bttn();
	}

	@Then("^clicks on the VIS button and validates the outcome$")
	public void clicks_on_the_VIS_button_and_validates_the_outcome() throws Throwable {
		log.info("Clicking the VIS button and Verifying the result");
		ForthScreen  fs= new ForthScreen();
		 fs.Vis_BTTN();
	}

	@Then("^quits the app$")
	public void quits_the_app() throws Throwable {
		log.info("Cloing the APP");
	    closeapp();
	}
}
