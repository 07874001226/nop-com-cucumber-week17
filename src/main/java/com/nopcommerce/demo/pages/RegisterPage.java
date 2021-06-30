package com.nopcommerce.demo.pages;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterText;
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickOnRegisterButton;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement verifyFirstNameText;


    public String verifyRegisterText() {
        log.info("Verify Text : " + verifyRegisterText.toString());
        return getTextFromElement(verifyRegisterText);
    }
    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
        log.info("Entering firstname : " + firstname + " to firstname field : " + firstNameField.toString());
    }
    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
        log.info("Entering lastname  : " + lastname + " to lastname field : " + lastNameField.toString());
    }
        public void setConfirmPassword(String confirmpassword) {
            sendTextToElement(confirmPassword, confirmpassword);
            log.info("Entering ConfirmPassword  : " + confirmpassword + " to ConfirmPassword field : " + confirmPassword.toString());
        }
    public void setClickOnRegisterTab() {
        log.info("Clicking On Login Butto : " + clickOnRegisterButton.toString());
        clickOnElement(clickOnRegisterButton);
    }

    public String verifyFirstNameText() {
        log.info("Verify First Name Text : " + verifyFirstNameText.toString());
        return getTextFromElement(verifyFirstNameText);
    }

    }


