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

public class hesabimPage extends basePage {
    WebDriverWait wait;
    elementHelper helper;

    @AndroidFindBy(id="com.pordiva.nesine.android:id/my_promotions_btn")
    public WebElement btnPromotions;
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"code\")")
    public WebElement txtCode;
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"securityCode\")")
    public WebElement txtSecurityCode;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/back")
    public WebElement btnBack;
    @AndroidFindBy(id="com.pordiva.nesine.android:id/personal_info_btn")
    public WebElement btnPersonalInfo;
    By membershipNumber= AppiumBy.xpath("//android.view.View[@resource-id=\"nsn-myInfoAndSettings\"]/android.view.View/android.view.View[1]");
    By myAccountTitle= AppiumBy.id("com.pordiva.nesine.android:id/title");

    private static final Logger log = Logger.getLogger("hesabimPage");
    public hesabimPage(AppiumDriver driver) {
        super(driver);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        this.helper=new elementHelper(driver);
    }
    public void navigateToPromotionsPage(){
        helper.click(btnPromotions);
    }
    public void enterThePromotionCodePage(){
        helper.sendKey(txtCode,"1234567890");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String enteredText= txtCode.getText();
        Assert.assertEquals(enteredText.length(),10,"Girilen Cod 10 Haneli !");

    }
    public void enterTheSecurityCodePage(){
        helper.sendKey(txtSecurityCode,"12345");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String enteredText= txtSecurityCode.getText();
        Assert.assertEquals(enteredText.length(),5,"Girilen Cod 5 Haneli !");
    }
    public void clickOnTheCloseButton(){
        helper.click(btnBack);
    }
    public void checkOnTheMyAccountPage(){
       helper.checkElementWithText(myAccountTitle,"HESABIM");
       log.info("Hesabım Sayfasına Geri Dönüldü.");
    }

    public void informationPage(){
        helper.click(btnPersonalInfo);
    }
    public void checkOnTheMembershipNumberPage(){
        helper.checkElementWithText(membershipNumber,"20465302");
        log.info("Üyelik Numarası Kontrolü Sağlandı.");
    }


}
