package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class baseFile {
	public static  AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities dc;
	
	public static void launchapp() throws MalformedURLException {
		dc = new DesiredCapabilities();
		dc.setCapability("platformVersion", "8.1");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		dc.setCapability("app", "C:\\Users\\shubhankardas01\\Downloads\\ApiDemos-debug.apk");
		dc.setCapability("deviceName", "Android");
		
		driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
	}
	
	public static void scrolldown() {
		
		List <MobileElement> lists = driver.findElements(By.xpath("//android.widget.TextView"));
		
		for(MobileElement e: lists)
			System.out.println(e.getAttribute("text"));
		Dimension dime = driver.manage().window().getSize();
		
		int start_x = (int)(dime.width *0.5);
		int start_y = (int)(dime.height *0.7);
		
		int end_x = (int)(dime.width * 0.2);
		int end_y = (int)(dime.height *0.3);
		
	TouchAction touch = new TouchAction(driver);
	touch.press(PointOption.point(start_x, start_y))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	.moveTo(PointOption.point(end_x, end_y)).release().perform();
		
				
	}
	
			
	public static void closeapp()
	{
		driver.quit();
	}

}
