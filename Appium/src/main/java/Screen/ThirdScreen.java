package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ThirdScreen {
	public static  AppiumDriver<MobileElement> web_driver;
	public ThirdScreen() {
	
	PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
	}
 
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement App_bttn;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement Action_bar_bttn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement Display_bttn;
	
	@FindBy(id = "demo.fun.com.apis:id/toggle_show_title")
	public MobileElement Show_title_bttn;
	
	@FindBy(id = "demo.fun.com.apis:id/toggle_show_custom")
	public MobileElement Show_Custom_bttn;
	
//	@FindBy(id = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button")
//	public MobileElement Custom_view_bttn;
//	
	
	
	public void App_click() {
		App_bttn.click();
	}
	
	public void Action_bar() {
		Action_bar_bttn.click();
	}
	
	public void Display_click() {
		Display_bttn.click();
	}
	
	public void Show_title() {
		Show_title_bttn.click();
	}
	public void Show_Custom() {
		Show_Custom_bttn.click();
		Assert.assertTrue(Show_Custom_bttn.isEnabled());
		System.out.println("Assertion Successfull");
		
	}
	
	
}
