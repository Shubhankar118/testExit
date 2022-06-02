package PageObject;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import Base.baseFile;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM2 extends baseFile {
	public POM2()  {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		}
	
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation_BTTN;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
	public MobileElement hide_BTTN;
	
	@FindBy(xpath="	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public MobileElement one_BTTN;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Show Buttons\"]")
	public MobileElement Show_BTTN;
	
	
	
	public void animationBTN() {
		animation_BTTN.click();
	}
	
	public void showAnimation() {
		hide_BTTN.click();
	}
	
	public void oneBTN() {
		one_BTTN.click();
	}
	
	public void showBTN() {
		Show_BTTN.click();
//		log.info("Showin thw button")
	}
		
		
		
		
		
		
	}
