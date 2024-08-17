package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class basePage {
    AppiumDriver driver;
    public  basePage(AppiumDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id="com.pordiva.nesine.android:id/btnAccept")
    public WebElement btnAcceptCookie;

}
