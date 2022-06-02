package stepDefination;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import Base.baseFile;
import PageObject.POM2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination2 extends baseFile{
//	public static Logger log = LogManager.getLogger(StepDefination2.class.getName());
	
	@When("^the user click on Animation$")
	public void the_user_click_on_Animation() throws Throwable {
	    POM2 j=new POM2();
	    j.animationBTN();
	    Thread.sleep(1500);
	}

	@And("^user clicks on Show Animations$")
	public void user_clicks_on_Show_Animations() throws Throwable {
	    POM2 j=new POM2();
	    j.showAnimation();
	}

	@Then("^user clicks on Button$")
	public void user_clicks_on_Button() throws Throwable {
		POM2 j=new POM2();
		j.oneBTN();
	    
	}

	@Then("^user clicks on Show buttons$")
	public void user_clicks_on_Show_buttons() throws Throwable {
		POM2 j=new POM2();
		j.showBTN();
//	    log.info("Showing the Button");
	}

}
