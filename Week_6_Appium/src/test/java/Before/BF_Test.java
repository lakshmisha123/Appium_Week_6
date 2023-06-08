package Before;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Capability.Capability_Android;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BF_Test extends Capability_Android {
	protected AndroidDriver<AndroidElement> x;
	@BeforeSuite
	public void tc1() throws InterruptedException, IOException
    {
    	 x=capabilities(deviceName,appPackage,appActivity,platformName,chromeDriver);
         x.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	@AfterSuite
	public void tc2() {
		x.quit();
	}

}
