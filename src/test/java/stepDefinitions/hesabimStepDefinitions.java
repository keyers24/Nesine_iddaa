package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.hesabimPage;
import util.driverFactory;

public class hesabimStepDefinitions {
     hesabimPage hesabimPage = new hesabimPage(driverFactory.getDriver());
     
    @And("Navigate to promotions page")
    public void navigateToPromotions() {
        hesabimPage.navigateToPromotionsPage();
    }

    @And("Enter the promotion code")
    public void enterThePromotionCode(){
        hesabimPage.enterThePromotionCodePage();
    }
    @And("Enter the Security Code")
    public void enterTheSecurityCode() {
        hesabimPage.enterTheSecurityCodePage();
    }

    @And("Click on the close button")
    public void clickOnTheCloseButton() {
        hesabimPage.clickOnTheCloseButton();
    }

    @Then("Check on the My Account page")
    public void checkOnTheMyAccount() {
        hesabimPage.checkOnTheMyAccountPage();
    }

    @And("Navigate to Personal Information page")
    public void navigateToPersonalInformationPage() {
        hesabimPage.informationPage();
    }
    @Then("Check on the membership number")
    public void checkOnTheMembershipNumber() {
        hesabimPage.checkOnTheMembershipNumberPage();
    }
}
