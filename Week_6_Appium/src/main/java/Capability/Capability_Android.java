package Capability;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability_Android {
	public static String deviceName;
    public static String platformName;
    public static String appPackage;
    public static String appActivity;
    public static String chromeDriver;
public static AndroidDriver<AndroidElement> capabilities(String deviceName,String platformName,String appPackage,String appActivity,String chromeDriver) throws IOException, InterruptedException {
        
        //first FileIO second FileReader
        FileReader fr=new FileReader(System.getProperty("user.dir")+"//src//main//resources//global.properties");
        Properties p=new Properties();
        p.load(fr);
        deviceName  = p.getProperty("devicename");
        platformName  = p.getProperty("platformName");
        appPackage  = p.getProperty("appPackage");
        appActivity  = p.getProperty("appActivity");
        chromeDriver = p.getProperty("chromeDriver");
        
        DesiredCapabilities dc=new DesiredCapabilities();
        //general capability for mobile capability
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,appPackage);
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,appActivity);
        
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
        
        dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,chromeDriver);
        
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
        //if i want to call capabilities in other class i ll use return driver
        return driver;
            
    }
	}

