package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.elementHelper;

import java.time.Duration;
import java.util.logging.Logger;

public class loginPage extends basePage {
    WebDriverWait wait;
    elementHelper helper;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/btnLogin")
    public WebElement btnLogin;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/username_edit")
    public WebElement txtUsername;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/password_edit")
    public WebElement txtPassword;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/ask_login_rb")
    public WebElement checkLoginRB;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/login_btn")
    public WebElement submitLogin;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/rlMyAccountContainer")
    public WebElement myAccount;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/btnClose")
    public WebElement tvClose;
    By LinearContainer= AppiumBy.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
    @AndroidFindBy(id="com.pordiva.nesine.android:id/logout_btn")
    public WebElement btnLogout;
    @AndroidFindBy(id="android:id/message")
    public WebElement errorMessage;
    private static final Logger log = Logger.getLogger("loginPage");
    public loginPage(AppiumDriver driver) {
        super(driver);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.helper=new elementHelper(driver);
    }
    public  void checkNavigateApp(){
        helper.click(btnAcceptCookie);
        Assert.assertTrue(helper.waitForVisibilityBoolean(btnLogin));
    }
    public  void enterMembershipInformations(String userName,String Password)
    {
        helper.click(btnLogin);
        helper.sendKey(txtUsername,userName);
        helper.sendKey(txtPassword,Password);
        helper.click(checkLoginRB);
        helper.click(submitLogin);
    }
    public void navigateMyAccount(){
        helper.click(myAccount);
        helper.click(tvClose);
    }
    public void logout(){
        helper.swipeGesture(LinearContainer);
        helper.click(btnLogout);
    }

    public void itIsSeenThatYouAreLoggedOutPage(){
        Assert.assertTrue(helper.waitForVisibilityBoolean(btnLogin));
        log.info("Çıkış Yapıldı !!!");
    }
    public void errorMessageIsDisplayedPage(){

        Assert.assertTrue(helper.waitForVisibilityBoolean(errorMessage));
        log.info("Giriş Bilgileriniz Hatalı !!!");
    }

}
