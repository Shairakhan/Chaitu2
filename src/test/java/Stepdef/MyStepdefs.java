package Stepdef;

import basepage.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User navigate to Url {String url}")
    public void userNavigateToUrl(String arg0)
    {
        BasePage.homePageClass.navigateToUrl("url");
    }

    @Then("User should be navigate to Homepage")
    public void userShouldBeNavigateToHomepage()
    {
     String pageTile=BasePage.homePageClass.pageTitle();
        System.out.println(pageTile);
    }

    @When("User click on register link")
    public void userClickOnRegisterLink() {
    }

    @Then("User should be navigate to Register page")
    public void userShouldBeNavigateToRegisterPage() {
    }

    @When("User click on Female radio button")
    public void userClickOnFemaleRadioButton() {
    }

    @And("User should Enter Name, lastname ,Email ,address, password, confirm password")
    public void userShouldEnterNameLastnameEmailAddressPasswordConfirmPassword() {
    }

    @And("User Click on register button")
    public void userClickOnRegisterButton() {
    }

    @Then("User should successfully registered")
    public void userShouldSuccessfullyRegistered() {
    }
}
