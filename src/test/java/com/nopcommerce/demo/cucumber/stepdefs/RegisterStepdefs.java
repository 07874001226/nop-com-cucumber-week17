package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterStepdefs {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Register", new RegisterPage().verifyRegisterText());
    }

    @And("^I enter email <\"([^\"]*)\">$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password <\"([^\"]*)\">$")
    public void iEnterPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        new LoginPage().enterPassword(password);


    }

    @And("^I enter confirm password on  <\"([^\"]*)\">$")
    public void iEnterConfirmPasswordOn(String confirmPassword) throws InterruptedException {
        Thread.sleep(1000);
        new RegisterPage().setConfirmPassword(confirmPassword);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        new RegisterPage().setClickOnRegisterTab();
    }

    @Then("^I should see the error message$")
    public void iShouldSeeTheErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("First name is required.", new RegisterPage().verifyFirstNameText());
    }

    @And("^I enter firstname <\"([^\"]*)\">$")
    public void iEnterFirstname(String firstname) throws InterruptedException {
        Thread.sleep(2000);
        new RegisterPage().enterFirstName(firstname);


    }

    @And("^I enter lastname <\"([^\"]*)\">$")
    public void iEnterLastname(String lastname) throws InterruptedException {
        Thread.sleep(2000);
        new RegisterPage().enterLastName(lastname);


    }

    @Then("^I should see verify register page successfully$")
    public void iShouldSeeVerifyRegisterPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Register",new RegisterPage().verifyRegisterText());

    }
}
