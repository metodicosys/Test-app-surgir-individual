package org.meto.appium.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.utils.AppiumUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestBase extends AppiumUtils{

	/*
	 * Automation - Test base, By, ExtentReports Jenkins
	 */

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public FormPage formPage;
		
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setDeviceName("samsung SM-T395"); //5200fa184e619579   samsung SM-T395
		options.setUdid("5200fa184e619579");
		options.setApp("com.android.contacts");
		options.setCapability("ignoreHiddenApiPolicyError", true);
//		options.setChromedriverExecutable("C://Users//Praxis//OneDrive//Documents//automatizedTests//src//drivers//chromedriver");
		options.setChromedriverExecutable("C://Users//Praxis//Documents//chromedriver");

		options.setApp("C://code//AppiumFrameworkSurgir//src//test//resources//app//Surgir_debug_4.3.0_Release4.3.0.apk");
		
	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		options.setCapability("appWaitActivity", ".ui.login.LoginActivity,.ui.splash.SplashActivity");
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
	//	driver = new AndroidDriver(new URL("http://localhost:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		formPage = new FormPage(driver); 

	}
	


	@AfterClass
	public void teardown() {
		 driver.quit();
		 service.stop();
		 
	}

}
