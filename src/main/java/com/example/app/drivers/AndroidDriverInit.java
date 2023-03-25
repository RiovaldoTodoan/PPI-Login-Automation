package com.example.app.drivers;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize()  {
    DesiredCapabilities set = new DesiredCapabilities();
    set.setCapability("platformName","Android");
    set.setCapability("platformVersion","12");
    set.setCapability("deviceName","Samsung Galaxy S23 API 31");
    set.setCapability("automationName","UIAutomator2");
    set.setCapability("udid","emulator-5554");
//    set.setCapability("browserName", "Chrome");
//    set.setCapability("chromedriverExecutable","\"C:\\Users\\riova\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
//    set.setCapability("udid","emulator-5554");
//    set.setCapability("browserName","chrome");
    set.setCapability("noReset","true");




    String url = "http://0.0.0.0:4723/wd/hub";
    try {driver = new AndroidDriver<>
            (new URL(url),set);}
    catch (MalformedURLException e){ e.printStackTrace();}
  }

  public static void quit(){
    driver.quit();}

}
