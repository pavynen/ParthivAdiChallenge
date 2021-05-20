import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Emulator Android studio, Appium with Selenium
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.example.challenge");
        dc.setCapability("appActivity", ".MainActivity");

        AndroidDriver<AndroidElement> ad= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:8200/wd/hub"),dc);
        
        //Code to automate Test. can use frameworks like TestNG, Robot framework etc 
        MobileElement el1 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("TODO");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementById("com.example.challenge:id/reviewDetails");
        el3.sendKeys("Review from Test Parthiv");
        MobileElement el4 = (MobileElement) ad.findElementById("com.example.challenge:id/saveReview");
        el4.click();
        ad.navigate().back();
        
        //Assert functions
        //iterations
    }
}
