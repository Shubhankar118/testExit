package PageObject;

import org.openqa.selenium.support.PageFactory;

import Base.baseFile;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM1 extends baseFile {
	
	
	
	public POM1()  {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		}
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Access'ibility\"]")
	public MobileElement assibility_BTTN;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")
	public MobileElement nodeQuerying_BTTN;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.CheckBox")
	public MobileElement doTaxes_BTTN;
	
	
	
	
	
	public void assibilityBTN() {
		assibility_BTTN.click();
	}
	public void nodeQueryingBTN() {
		nodeQuerying_BTTN.click();
	}
	
	public void dotaxesBTN() {
		doTaxes_BTTN.click();
	}
	
	
	
	
	

}



