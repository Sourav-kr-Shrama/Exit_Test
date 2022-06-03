package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FifthScreen {
	
	public static  AppiumDriver<MobileElement> web_driver;
	public FifthScreen() {
	
	PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
	}
//getting the elements by their xpath and id///

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]")
public MobileElement Viewbtn;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
public MobileElement Searchbtn;

@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
public MobileElement Actionbtn;

@FindBy(id ="demo.fun.com.apis:id/action_search")
public MobileElement Search_icon_btn;

@FindBy(id= "android:id/search_src_text")
public MobileElement Seach_Text;

///Declaring the method to perform some action with it///

public void View_BTN() {
	Viewbtn.click();
}
public void Search_BTN() {
	Searchbtn.click();
}
public void Action_BTN() {
	Actionbtn.click();
}
public void Search_icon() {
	Search_icon_btn.click();
}
public void SearchText(String User) {
	Seach_Text.sendKeys(User);
}
}
