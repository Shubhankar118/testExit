package stepDefination;

import Base.baseFile;
import PageObject.POM1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination1 extends baseFile {
	
	@Given("^Open the emulator$")
	public void open_the_emulator() throws Throwable {
		launchapp();
		Thread.sleep(1500);
	}

	@Then("^the user click on Accessibility$")
	public void the_user_click_on_Accessibility() throws Throwable {
		POM1 I=new POM1();
	    I.assibilityBTN();
	    Thread.sleep(1500);
	   
	}

	@And("^user click on Node Querying$")
	public void user_click_on_Node_Querying() throws Throwable {
		POM1 I=new POM1();
		I.nodeQueryingBTN();
		Thread.sleep(1500);
	}

	@Then("^the user click on Do Taxes$")
	public void the_user_click_on_Do_Taxes() throws Throwable {
	    
		POM1 I=new POM1();
		I.dotaxesBTN();
		Thread.sleep(1500);
	}


}
