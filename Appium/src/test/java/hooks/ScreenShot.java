package hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.service.ExtentTestManager;

import Base.BaseFile;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class ScreenShot {
public static String getBase64Screenshot() throws IOException {
//logger.info("Save screenshot");
return ((TakesScreenshot) BaseFile.getDriver()).getScreenshotAs(OutputType.BASE64);
}



//To store screenshots in project folder
@After
public void af(Scenario scenario) throws IOException {

if (scenario.isFailed()) {
//logger.info("Store Screenshot in Folders");
ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

Date dat = new Date();
File src = ((TakesScreenshot) BaseFile.getDriver()).getScreenshotAs(OutputType.FILE);



SimpleDateFormat Sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
String sdat = Sdf.format(dat);



FileUtils.copyFile(src, new File((BaseFile.ssdir) + "image_" + sdat + ".png"));
}
}
}
