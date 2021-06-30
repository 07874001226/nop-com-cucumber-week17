package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.scene.control.Alert;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().getWelcomeText());

    }

    @And("^I click on logout tab$")
    public void iClickOnLogoutTab() throws InterruptedException {
        Thread.sleep(1000);
        new LoginPage().clickOnLogOutButton();

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        Thread.sleep(1000);

        new LoginPage().clickOnLoginButton();

    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() throws InterruptedException {
        Thread.sleep(1000);

        Assert.assertEquals("Welcome to our store", new LoginPage().getWelcomeStoreText());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(1000);

        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        new LoginPage().enterPassword(password);
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String msg) throws InterruptedException {
        Thread.sleep(1000);
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMsg = new LoginPage().getErrorMessage();
        Assert.assertEquals(expectedMsg, actualMsg);


    }
}
