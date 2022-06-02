package stepDefination;

import Base.baseFile;
import PageObject.POM3;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class StepDefination3 extends baseFile {
	
	@And("^user click on ViewFlip$")
	public void user_click_on_ViewFlip() throws Throwable {
	    POM3 k=new POM3();
	    k.viewflipBTN();
	    Thread.sleep(1500);
	}

	@Then("^the user click on Flip$")
	public void the_user_click_on_Flip() throws Throwable {
	   POM3 k=new POM3();
	   k.flipBTN();
	   Thread.sleep(1500);
	}

	@Then("^user again click on fliP$")
	public void user_again_click_on_fliP() throws Throwable {
	   POM3 k=new POM3();
	   k.fliPBTN();
	   Thread.sleep(1500);
	}

}
