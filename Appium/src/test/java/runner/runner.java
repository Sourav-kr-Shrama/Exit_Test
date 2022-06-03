package runner;



import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@Listeners({ ExtentITestListenerClassAdapter.class })
@CucumberOptions (
features = "C:/Users/souravsharma/eclipse-workspace/Appium/src/test/java/Feature",
glue = {"StepDefination","hooks"},


tags= {"@tag"})
public class runner extends AbstractTestNGCucumberTests {

}
