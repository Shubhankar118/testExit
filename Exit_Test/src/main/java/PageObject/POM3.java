package PageObject;

import org.openqa.selenium.support.PageFactory;

import Base.baseFile;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class POM3 extends baseFile{
	 public  POM3() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		}
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"View Flip\"]")
	public MobileElement viewFlip_BTTN;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Flip\"]")
	public MobileElement flip_BTTN;
	
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Flip\"]")
	public MobileElement fliP_BTTN;
	
	
	
	
	public void viewflipBTN() {
		viewFlip_BTTN.click();
	}
	public void flipBTN() {
		flip_BTTN.click();
	}
	public void fliPBTN() {
		fliP_BTTN.click();
	}
}
