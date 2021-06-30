package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Jay
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    //    By emailField = By.id("Email");
//    By passwordField = By.id("Password");
//    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
//    By welcomeText = By.xpath("//div[@class='page-title']//h1");
//
    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath =  "//button[contains(text(),'Log in')]")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;

    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)")
    WebElement errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welComeStore ;


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + password + " to password field : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        log.info("Clicking On Login Butto : " + loginBtn.toString());
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }


    public String getErrorMessage() {
        log.info("Verify Error Message: " + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }

    public void clickOnLogOutButton() {
        log.info("Clicking On Logout Button : " + logOutButton.toString());
        mouseHoverToElementAndClick(logOutButton);
    }
    public String getWelcomeStoreText() {
        log.info("Getting welcome text from : " + welComeStore.toString());
        return getTextFromElement(welComeStore);
    }

}
