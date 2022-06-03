package Screen;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;

import Base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SecondScreen {
	public static  AppiumDriver<MobileElement> web_driver;
	public SecondScreen() {
	
	PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
	}
 
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement Asseccbility_bttn;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	public MobileElement HideShow_bttn;
	
	@FindBy(id="demo.fun.com.apis:id/customAnimCB")
	public MobileElement Checkbox_bttn;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement number_bttn;
	
	@FindBy(id="demo.fun.com.apis:id/addNewButton")
	public MobileElement Show_bttn;
	
	
	public void access_bttn()
	{
		Asseccbility_bttn.click();
	}
	public void hidshow_bttn() {
		HideShow_bttn.click();
	}
	public void check_box() {
		Checkbox_bttn.click();
	}
	public void Number_bttn() {
	  number_bttn.click(); 
	  Assert.assertTrue(number_bttn.isDisplayed());
	}
	public void show_btn() {
		Show_bttn.click();
		Assert.assertTrue(Show_bttn.isDisplayed());
		System.out.println("Assertion Successfull");
		
	}
	
		
}
