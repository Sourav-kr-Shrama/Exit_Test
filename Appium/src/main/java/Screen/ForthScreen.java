package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForthScreen {
	public static  AppiumDriver<MobileElement> web_driver;
	public ForthScreen() {
	
	PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
	}
	
//getting the elements by their xpath and id///
@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]")
public MobileElement viewbtn;

@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[13]")
public MobileElement visibilitybtn;

@FindBy(id = "demo.fun.com.apis:id/invis")
public MobileElement INVISbtn;

@FindBy(id = "demo.fun.com.apis:id/vis")
public MobileElement VISbtn;



///Declaring the method to perform some action with it///
public void View_Bttn() {
	viewbtn.click();
}
 public void  Visibilty_Bttn()
 {
	 visibilitybtn.click();
 }
 
 public void Invis_Bttn()
 {
	 INVISbtn.click();
 }
  public void Vis_BTTN() {
	  VISbtn.click();
	  Assert.assertTrue(VISbtn.isDisplayed());
	 
  }

 
  
}
