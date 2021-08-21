package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetUp {
	public static WebDriver driver;
	public static  int waitTime=30;
public static 	Properties properties;

 
@BeforeMethod
	public static  WebDriver  openbrowser() throws IOException{
		if(driver==null){
		readproperties();
		if(properties.getProperty("testcatogery").equals("web")){
		if(properties.getProperty("executionBrowser").equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		}else if(properties.getProperty("executionBrowser").equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			 driver.manage().window().maximize();
		}
		
		}else if(properties.getProperty("testcatogery").equals("android")){
			DesiredCapabilities ds= new DesiredCapabilities();
			ds.setCapability(MobileCapabilityType.DEVICE_NAME, ("emulator-5554"));
			ds.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			ds.setCapability(MobileCapabilityType.PLATFORM_NAME, ("Android"));
			ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, ("7.1.1"));
//			ds.setCapability("appPackage", "com.androidsample.generalstore");
//			ds.setCapability("appActivity", "MainActivity");
			ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
			ds.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);
			ds.setCapability(MobileCapabilityType.APP, "E:\\cks.com\\cskv1\\app\\General-Store.apk");
			 driver=  new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),ds);
		}
		
		}
		return driver;
}
	
  public static WebDriver getDriver() throws IOException{
	  WebDriver driver= openbrowser();
	  return driver;
  }
	public static void readproperties() throws IOException{
		File file= new File("E:\\cks.com\\cskv1\\config.properties");
		 FileInputStream fis= new FileInputStream(file);
		 properties= new Properties();
		 properties.load(fis);
		 
	}
	
	
	  
	
}
