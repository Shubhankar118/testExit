package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseFile;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM5 extends baseFile{
	
	public POM5() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
		@FindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
		public MobileElement app_BTTN;
		
		@FindBy(xpath="//android.widget.TextView[@content-desc=\"Action Bar\"]")
		public MobileElement action_BTTN;
		
		@FindBy(xpath="//android.widget.TextView[@content-desc=\"Display Options\"]")
		public MobileElement display_BTTN;
		
		@FindBy(xpath="//android.widget.Button[@content-desc=\"DISPLAY_SHOW_TITLE\"]")
		public MobileElement show_BTTN;
		
		
		
		public void appBTN() {
			app_BTTN.click();
		}
		
		public void actionBTN() {
			action_BTTN.click();
		}
		
		public void displayBTN() {
			display_BTTN.click();
		}
		
		public void showBTN() {
			show_BTTN.click();
		}
		
	

}
