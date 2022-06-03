package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseFile {
	public static String ssdir = System.getProperty("user.dir") + "/FailedScreenshots/";
	
	public static Logger log = LogManager.getLogger(BaseFile.class.getName());
	
////declaring the Mobile elements //////
		public static  AppiumDriver<MobileElement> web_driver;
		
		

		/////declaring the desired capabilities//////
		public static DesiredCapabilities dc;
		
		public static void launchapp() throws MalformedURLException {
			dc = new DesiredCapabilities();
			dc.setCapability("isHeadless", true);
			dc.setCapability("avdArgs", "-no-window");
			dc.setCapability("platformVersion", "8.1");
			dc.setCapability("platformName", "Android");
			dc.setCapability("appPackage", "demo.fun.com.apis");
			dc.setCapability("appActivity", "demo.fun.com.apis.ApiDemos");
			dc.setCapability("app", "C:/Users/souravsharma/Downloads/demo.fun.com.apis-v1.1.apk");
			dc.setCapability("deviceName", "Android");
			
			web_driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
			////using get and set method to call the Appium driver/////
			AppDriver.setDriver(web_driver);
		}
		
		/////Scroll down Method//////
		
		public static void scrolldown() {
			///storing all the elements in the list present in the MobileElement
			List <MobileElement> lists = web_driver.findElements(By.xpath("//android.widget.TextView"));
			
			//fetching all the element one by one
			for(MobileElement e: lists)
				System.out.println(e.getAttribute("text"));
			
			
			//getting the dimension and storing it in the object
			Dimension dime = AppDriver.getDriver().manage().window().getSize();
			
			//parsing the dimension into int datatype//
			int start_x = (int)(dime.width *0.5);
			int start_y = (int)(dime.height *0.7);
			
			int end_x = (int)(dime.width * 0.2);
			int end_y = (int)(dime.height *0.1);
			
		TouchAction touch = new TouchAction(web_driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
			
					
		}
		
			//Calling the app to quit//			
		public static void closeapp()
		{
			web_driver.quit();
		}
		
		public static AppiumDriver<MobileElement> getDriver() {
			return web_driver;
			}
		


}
