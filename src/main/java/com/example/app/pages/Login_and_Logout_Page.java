package com.example.app.pages;
import static com.example.app.drivers.AndroidDriverInit.driver;
import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class Login_and_Logout_Page extends BasePageObject {

    public void homepage() {
        By locator = MobileBy.xpath("//android.widget.TextView[@content-desc=\"Chrome\"]");
        AndroidElement chrome = driver.findElement(locator);
        chrome.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}

    public void inputURl(String URL) {
        By locator = MobileBy.id("com.android.chrome:id/search_box_text");
        AndroidElement urlText = driver.findElement(locator);
        urlText.sendKeys(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));}

    public void memberHomePage() {
        By locator = MobileBy.xpath("//android.view.View[@content-desc=\"logo, current page\"]/" +
                "android.widget.Image");
        AndroidElement logo = driver.findElement(locator);
        logo.isDisplayed();}

    public void tapEnter() {
        By locator = MobileBy.xpath("//android.view.View[@content-desc=\"Masuk\"]/android.widget.Button");
        AndroidElement enterbutton = driver.findElement(locator);
        enterbutton.click();}

    public void phoneNumber(String PhoneNumber) {
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android" + ".widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.widget" + ".FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/" +
                "android.view.View/android.view.View/android.view." + "View[2]/android.view.View[2]/android.view.View[2]");
        AndroidElement inputphone = driver.findElement(locator);
        inputphone.click();
        driver.getKeyboard().sendKeys(PhoneNumber);
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);}

    public void password(String Password) {
        By locator = MobileBy.xpath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout" + "/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android." +
                "view.View/android" + ".view." + "View/android.view.View[2]/android.view.View[2]/android.view." +
                "View[4]/android.widget.EditText");
        AndroidElement inputPassword = driver.findElement(locator);
        inputPassword.clear();
        inputPassword.sendKeys(Password);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);}

    public void loginbbutton (){
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget" + ".FrameLayout/android.widget.FrameLayout/android.widget." +
                "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]" +
                "/android.widget.FrameLayout[2]/android.webkit.WebView/android.view." +
                "View/android.view.View/android.view.View[2]/android.view." +
                "View[2]/android.widget.Button");
        AndroidElement tapLogin = driver.findElement(locator);
        tapLogin.click();}

    public void myProfileLanding (){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       By locator = MobileBy.xpath
               ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                       "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                       "ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit." +
                       "WebView/android.view.View/android.view.View/android.view.View[8]");
       AndroidElement taphomepagelanding = driver.findElement(locator);
       taphomepagelanding.click();
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);}

    public void hamburgerButton (){
        By button = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android." +
                "view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View");
        AndroidElement hamButton = driver.findElement(button);
        hamButton.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);}

    public void logout (){
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android." +
                "view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View");
        AndroidElement logoutbutton = driver.findElement(locator);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        logoutbutton.click();}

    public void confirmationButton () {
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android." +
                "view.View/android.view.View[2]/android.view.View/android.widget.Button[1]");
        AndroidElement yesButton = driver.findElement(locator);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        yesButton.click();}

    public void landingBack (){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("//android.view.View[@content-desc=\"logo\"]/android.widget.Image");
        AndroidElement logo = driver.findElement(locator);
        logo.isDisplayed();}

    public void closebrowser (){
        By locator = MobileBy.id("com.android.chrome:id/tab_switcher_button");
        AndroidElement tab = driver.findElement(locator);
        tab.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        By icon = MobileBy.id("com.android.chrome:id/action_button");
        AndroidElement tapx = driver.findElement(icon);
        tapx.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.terminateApp("com.android.chrome");}

    public void AlertMessageInvalidPhoneNumber () {
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View" +
                "/android.view.View[2]/android.view.View");
        AndroidElement alertMessage = driver.findElement(locator);
        alertMessage.isDisplayed();}


}
