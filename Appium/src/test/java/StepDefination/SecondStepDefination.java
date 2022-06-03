package StepDefination;
import Base.BaseFile;
import Screen.SecondScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SecondStepDefination extends BaseFile {

@Given("^The user is on the API demo$")
public void the_user_is_on_the_API_demo() throws Throwable {
	log.info("Launching the App");
	launchapp();
	Thread.sleep(1000);
}

	@Given("^Clicks on the hide and show animation button with the accesbility button$")
	public void clicks_on_the_hide_and_show_animation_button_with_the_accesbility_button() throws Throwable {
		log.info("CLicking the Options");
		SecondScreen Sc = new SecondScreen();
		Sc.access_bttn();
		Sc.hidshow_bttn();
	    }
	
	@Given("^checks the custom button and click on the number button$")
	public void checks_the_custom_button_and_click_on_the_number_button() throws Throwable {
		SecondScreen Sc = new SecondScreen();
		Sc.check_box();
		Thread.sleep(1000);
		Sc.Number_bttn();
		Thread.sleep(1000);
		}
	
	@Given("^then click on the show button$")
	public void then_click_on_the_show_button() throws Throwable {
		log.info("Clicking the Show button and validating the outcome");
		SecondScreen Sc = new SecondScreen();
		Sc.show_btn();
		Thread.sleep(1000);
	}

	@Then("^Quits the App$")
	public void quits_the_App() throws Throwable {
	
		log.info("Closing the App");
		closeapp();
	   
	}


}
