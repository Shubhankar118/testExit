package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseFile;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM4 extends baseFile {
	public POM4()  {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		}
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	public MobileElement view_BTTN;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Search View\"]")
	public MobileElement searchView_BTTN;
	
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Action Bar\"]")
	public MobileElement action_BTTN;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Search\"]")
	public MobileElement Search_BTTN;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	public MobileElement searcH_BTTN;
	
	
	
	public void viewBTN() {
		view_BTTN.click();
	}
	
	public void searchViewBTN() {
		searchView_BTTN.click();
	}
	
	public void actionBTN() {
		action_BTTN.click();
	}
	public void SearchBTN() {
		Search_BTTN.click();
	}
	public void searcHBTN(String search) {
		searcH_BTTN.sendKeys(search);
	}

}
