package StepDefination;

import Base.BaseFile;
import Screen.FirstScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FirstStepDefination extends BaseFile{
	
	

	
	@Given("^The user open the App$")
	public void the_user_open_the_App() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("Launching the App");
	   launchapp();
 
	}
	
	
	@Given("^perform clicks operation$")
	public void perform_clicks_operation() throws Throwable {
		log.info("Performing some Click action");
	    FirstScreen Fs = new  FirstScreen();
	    Fs.submitbtn();
	    
	}

	@Then("^Close the app$")
	public void close_the_app() throws Throwable {
	    log.info("Closing the App");
	    closeapp();
	}


}
