package stepDefination;

import Base.baseFile;
import PageObject.POM4;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination4 extends baseFile {
	
	@When("^the user click on Views$")
	public void the_user_click_on_Views() throws Throwable {
		POM4 q=new POM4();
		q.viewBTN();
	}

	@And("^user click on Search view$")
	public void user_click_on_Search_view() throws Throwable {
		POM4 q=new POM4();
		q.searchViewBTN();
	}

	@Then("^the user click on Action Bar$")
	public void the_user_click_on_Action_Bar() throws Throwable {
		POM4 q=new POM4();
		q.actionBTN();
	}

	@And("^user again click on searcH$")
	public void user_again_click_on_searcH() throws Throwable {
		POM4 q=new POM4();
		q.SearchBTN();
	}

	@Then("^user enter the (.*)$")
	public void user_enter_the_Search(String Search) throws Throwable {
	    POM4 q=new POM4();
	    q.searcHBTN(Search);
	}
}
