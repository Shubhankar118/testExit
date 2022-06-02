package stepDefination;

import Base.baseFile;
import PageObject.POM5;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination5 extends baseFile {
	
	@When("^the user click on App$")
	public void the_user_click_on_App() throws Throwable {
		POM5 P=new POM5();
		P.appBTN();
	    
	}

	@Then("^user clicks Action Bar$")
	public void user_clicks_Action_Bar() throws Throwable {
	  POM5 p=new POM5();
	  p.actionBTN();
	}

	@And("^user clicks on Display$")
	public void user_clicks_on_Display() throws Throwable {
	   POM5 p=new POM5();
	   p.displayBTN();
	}

	@Then("^user clicks on DisplayShowTitle$")
	public void user_clicks_on_DisplayShowTitle() throws Throwable {
	   POM5 p=new POM5();
	   p.showBTN();
	}

}
