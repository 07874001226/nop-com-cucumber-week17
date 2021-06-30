package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerStepdefs {
    @When("^I mousehover on computer tab$")
    public void iMousehoverOnComputerTab() {
        new HomePage().mouseHoverOnComputerLink();
    }

    @And("^I click on desktops$")
    public void iClickOnDesktops() {
        new ComputerPage().clickOnDeskstops();
    }

    @Then("^I should navigate to desktops page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals("Desktops",new ComputerPage().verifyOnDesktopsText());
    }

    @And("^I click on notebooks$")
    public void iClickOnNotebooks() {
        new ComputerPage().clickOnNotebooks();
    }

    @Then("^I should navigate to notebooks page succesfffully$")
    public void iShouldNavigateToNotebooksPageSuccesfffully() {
        Assert.assertEquals("Notebooks",new ComputerPage().verifyOnNotebooksText());
    }

    @When("^I click on software$")
    public void iClickOnSoftware() {
        new ComputerPage().clickOnSoftware();
    }

    @Then("^I should navigate to software page successfully$")
    public void iShouldNavigateToSoftwarePageSuccessfully() {
        Assert.assertEquals("Software",new ComputerPage().verifyOnSoftwareText());
    }

}
