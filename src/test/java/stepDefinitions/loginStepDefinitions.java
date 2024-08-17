package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import util.driverFactory;

public class loginStepDefinitions {
    loginPage loginPage = new loginPage(driverFactory.getDriver());

    @Given("Nesine application opens")
    public void blutvApplicationOpens() {
        loginPage.checkNavigateApp();
    }

    @When("Login with correct {string} and {string}")
    public void loginWithCorrectAnd(String userName, String Password) {
        loginPage.enterMembershipInformations(userName,Password);
    }
    @And("Go to my account page via the homepage go there")
    public void goToMyAccountPageViaTheHomepageGoThere() {
        loginPage.navigateMyAccount();
    }

    @And("Click on the “Log Out” button")
    public void clickOnTheLogOutButton() {
        loginPage.logout();
    }

    @Then("It is seen that you are logged out.")
    public void itIsSeenThatYouAreLoggedOut() {
        loginPage.itIsSeenThatYouAreLoggedOutPage();
    }

    @When("Login with wrong  {string} and {string}")
    public void loginWithWrongAnd(String userName, String Password) {
        loginPage.enterMembershipInformations(userName,Password);
    }
    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
        loginPage.errorMessageIsDisplayedPage();
    }
}
