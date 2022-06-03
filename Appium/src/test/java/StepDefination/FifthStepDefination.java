package StepDefination;

import Base.BaseFile;
import Screen.FifthScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FifthStepDefination extends BaseFile{
	@Given("^user open the App$")
	public void user_open_the_App() throws Throwable {
		log.info(" Launching The App");
	    launchapp();
	    Thread.sleep(1000);
	}

	@When("^user clicks on the  view option$")
	public void user_clicks_on_the_view_option() throws Throwable {
		log.info("Clicking View Option is Working");
	   FifthScreen ff = new FifthScreen();
	   ff.View_BTN();
	   Thread.sleep(1000);
	}

	@And("^Scrolls the page$")
	public void scrolls_the_page() throws Throwable {
		log.info("Scrolling the Page");
	    scrolldown();
	    Thread.sleep(1000);
	    scrolldown();
	    Thread.sleep(1500);
	    scrolldown();
	    Thread.sleep(1000);
	    
	}

	@And("^click on the search View button and on Action bar option$")
	public void click_on_the_search_View_button_and_on_Action_bar_option() throws Throwable {
		log.info("View Button and Action Button is Working");
		 FifthScreen ff = new FifthScreen();
		 ff.Search_BTN();
		 Thread.sleep(1000);
		 ff.Action_BTN();
		 Thread.sleep(1000);
		 
	}

	@Then("^click on search icon$")
	public void click_on_search_icon() throws Throwable {
		log.info("Search Icon is Working");
		FifthScreen ff = new FifthScreen();
		ff.Search_icon();
	}


@And("^enter the user in step (.*)$")
@Then("^enter the user in step$")
public void enter_the_user_in_step(String user) throws Throwable {
   log.info("Passing the value from the user");
	FifthScreen ff = new FifthScreen();
	ff.SearchText(user);
	Thread.sleep(1000);
	log.info("Closing the App");
	closeapp();
}

}
