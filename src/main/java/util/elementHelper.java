package util;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class elementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    public elementHelper(AppiumDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public WebElement checkElement(WebElement key){
        return wait.until(ExpectedConditions.visibilityOf(key));
    }
    public boolean waitForVisibilityBoolean(WebElement e){
        try{
            wait.until(ExpectedConditions.visibilityOf(e));
            return  true;
        }catch (TimeoutException | NoSuchElementException ex){
            return false;
        }
    }
    public  void click(WebElement key){
        WebElement element = checkElement(key);
        key.click();
    }
    public void checkElementWithText(By key,String Txt){
        boolean find = true;
        List<WebElement> elements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(key));
        for (WebElement element:elements){
            if (element.getText().contains(Txt)){
                //element.click();
                find=true;
                break;
            }
        }
        //Assertions.assertEquals(true,find);

    }

    public  void sendKey(WebElement key, String txt){
        WebElement element= checkElement(key);
        element.sendKeys(txt);
    }
    public  void swipeGesture(By containerElement)
    {
        WebElement container = driver.findElement(containerElement);
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(

                "elementId",((RemoteWebElement) container).getId(),
                "direction","up",
                "percent",0.75

        ));
    }
    public  void getText(WebElement key,String txt){
        WebElement element=checkElement(key);
        element.getText().contains(txt);
    }
}
