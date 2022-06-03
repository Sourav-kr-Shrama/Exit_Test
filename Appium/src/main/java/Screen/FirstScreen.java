package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FirstScreen {
public static  AppiumDriver<MobileElement> web_driver;
		public FirstScreen() {
		
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
		}
	//getting the elements by their xpath and id///
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement clickbtn;
	
	///Declaring the method to perform some action with it///
	
	public void submitbtn() {
		clickbtn.click();
	}

}
