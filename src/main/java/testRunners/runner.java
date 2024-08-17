package testRunners;


import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.driverFactory;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions","util"},
        tags = "@PersonalInfo or @SuccessLogin",
        plugin = {"summary","pretty","html:Reports/CucumberReport/Reports.html",
                  "json:Reports/CucumberReport/Report"
                  })
public class runner extends AbstractTestNGCucumberTests {
}
