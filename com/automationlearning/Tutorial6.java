/**
 * 
 */
package com.automationlearning;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/**
 * @author CHIRAG
 *
 */
public class Tutorial6 {

	AppiumDriver<MobileElement> driver;
	String path;
	String actual;
	public void setup()
	{
		System.out.println("Creating Session.............");
		path = System.getProperty("user.dir");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		//cap.setCapability("app", "C:\\Users\\Auto\\eclipse-workspace\\DemoAppium\\app\\ApiDemos.apk");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Session created");
		driver.findElementById("com.android.calculator2:id/digit_7").click();
		driver.findElementById("com.android.calculator2:id/op_add").click();
		driver.findElementById("com.android.calculator2:id/digit_3").click();
		driver.findElementById("com.android.calculator2:id/eq").click();
		actual=driver.findElementById("com.android.calculator2:id/result").getText();
		if (actual.equals("10"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		driver.quit();
	}
	
/*	public void validateText()
	{
		driver.findElementByAccessibilityId("Accessibility").click();
		String text = driver.findElementByAccessibilityId("Accessibility Node Provider").getText();
		if(text.equalsIgnoreCase("Accessibility Node Provider"))
		{
			System.out.println("Passed");
		} else
		{
			System.out.println("Failed");
		}
	}

	
	public void tearDown()
	{
		driver.quit();
	} */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial6 obj = new Tutorial6();
		obj.setup();
	//	obj.validateText();
	//	obj.tearDown();

	}
}
