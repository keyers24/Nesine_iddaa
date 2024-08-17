package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.logging.Logger;

public class hooks {

    AppiumDriver driver;
    private static final Logger log = Logger.getLogger("hooks");
    @Before
    public void before(){
        driver=driverFactory.initialize_Driver();
        log.info("Driver Başlatıldı.");
    }
    @After
    public void after(){driver.quit(); log.info("Driver Sonlandırıldı.");}
}
